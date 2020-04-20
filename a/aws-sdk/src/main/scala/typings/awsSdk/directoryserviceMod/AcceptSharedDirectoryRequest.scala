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
}

