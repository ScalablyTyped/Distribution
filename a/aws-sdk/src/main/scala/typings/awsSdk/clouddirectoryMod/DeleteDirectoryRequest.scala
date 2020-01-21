package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to delete.
    */
  var DirectoryArn: Arn = js.native
}

object DeleteDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
}

