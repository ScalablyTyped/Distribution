package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSoftwareUpdatesResult extends js.Object {
  /**
    * The Amazon S3 presigned URL for the update file associated with the specified JobId value. The software update will be available for 2 days after this request is made. To access an update after the 2 days have passed, you'll have to make another call to GetSoftwareUpdates.
    */
  var UpdatesURI: js.UndefOr[String] = js.native
}

object GetSoftwareUpdatesResult {
  @scala.inline
  def apply(): GetSoftwareUpdatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSoftwareUpdatesResult]
  }
  @scala.inline
  implicit class GetSoftwareUpdatesResultOps[Self <: GetSoftwareUpdatesResult] (val x: Self) extends AnyVal {
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
    def setUpdatesURI(value: String): Self = this.set("UpdatesURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatesURI: Self = this.set("UpdatesURI", js.undefined)
  }
  
}

