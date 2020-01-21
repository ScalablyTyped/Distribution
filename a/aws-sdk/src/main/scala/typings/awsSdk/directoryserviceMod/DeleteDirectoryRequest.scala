package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryRequest extends js.Object {
  /**
    * The identifier of the directory to delete.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DeleteDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
}

