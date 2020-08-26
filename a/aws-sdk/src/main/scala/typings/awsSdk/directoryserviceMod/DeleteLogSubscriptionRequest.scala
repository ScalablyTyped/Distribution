package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLogSubscriptionRequest extends js.Object {
  /**
    * Identifier of the directory whose log subscription you want to delete.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DeleteLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeleteLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogSubscriptionRequest]
  }
  @scala.inline
  implicit class DeleteLogSubscriptionRequestOps[Self <: DeleteLogSubscriptionRequest] (val x: Self) extends AnyVal {
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

