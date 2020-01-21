package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to enable.
    */
  var DirectoryArn: Arn = js.native
}

object EnableDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableDirectoryRequest]
  }
}

