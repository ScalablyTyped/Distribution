package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to disable MFA.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DisableRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DisableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRadiusRequest]
  }
  @scala.inline
  implicit class DisableRadiusRequestOps[Self <: DisableRadiusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
  }
  
}

