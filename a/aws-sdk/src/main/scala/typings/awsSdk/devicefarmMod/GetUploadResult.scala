package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadResult extends js.Object {
  /**
    * An app or a set of one or more tests to upload or that have been uploaded.
    */
  var upload: js.UndefOr[Upload] = js.native
}

object GetUploadResult {
  @scala.inline
  def apply(): GetUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUploadResult]
  }
  @scala.inline
  implicit class GetUploadResultOps[Self <: GetUploadResult] (val x: Self) extends AnyVal {
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
    def setUpload(value: Upload): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}

