package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptSharedDirectoryRequest extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account. 
    */
  var SharedDirectoryId: DirectoryId = js.native
}

object AcceptSharedDirectoryRequest {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): AcceptSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptSharedDirectoryRequest]
  }
  @scala.inline
  implicit class AcceptSharedDirectoryRequestOps[Self <: AcceptSharedDirectoryRequest] (val x: Self) extends AnyVal {
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

