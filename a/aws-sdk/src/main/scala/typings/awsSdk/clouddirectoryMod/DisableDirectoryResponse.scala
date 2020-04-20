package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDirectoryResponse extends js.Object {
  /**
    * The ARN of the directory that has been disabled.
    */
  var DirectoryArn: Arn = js.native
}

object DisableDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): DisableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDirectoryResponse]
  }
}

