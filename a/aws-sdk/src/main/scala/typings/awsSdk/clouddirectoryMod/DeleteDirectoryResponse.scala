package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryResponse extends js.Object {
  /**
    * The ARN of the deleted directory.
    */
  var DirectoryArn: Arn = js.native
}

object DeleteDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryResponse]
  }
}

