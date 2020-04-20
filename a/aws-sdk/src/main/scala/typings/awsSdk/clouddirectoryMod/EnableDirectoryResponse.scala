package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDirectoryResponse extends js.Object {
  /**
    * The ARN of the enabled directory.
    */
  var DirectoryArn: Arn = js.native
}

object EnableDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDirectoryResponse]
  }
}

