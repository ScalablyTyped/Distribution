package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectSharedDirectoryRequest extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: DirectoryId = js.native
}

object RejectSharedDirectoryRequest {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): RejectSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectSharedDirectoryRequest]
  }
  @scala.inline
  implicit class RejectSharedDirectoryRequestOps[Self <: RejectSharedDirectoryRequest] (val x: Self) extends AnyVal {
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
    def setSharedDirectoryId(value: DirectoryId): Self = this.set("SharedDirectoryId", value.asInstanceOf[js.Any])
  }
  
}

