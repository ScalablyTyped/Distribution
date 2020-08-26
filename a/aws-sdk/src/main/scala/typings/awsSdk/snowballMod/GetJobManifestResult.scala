package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobManifestResult extends js.Object {
  /**
    * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
    */
  var ManifestURI: js.UndefOr[String] = js.native
}

object GetJobManifestResult {
  @scala.inline
  def apply(): GetJobManifestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobManifestResult]
  }
  @scala.inline
  implicit class GetJobManifestResultOps[Self <: GetJobManifestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setManifestURI(value: String): Self = this.set("ManifestURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestURI: Self = this.set("ManifestURI", js.undefined)
  }
  
}

