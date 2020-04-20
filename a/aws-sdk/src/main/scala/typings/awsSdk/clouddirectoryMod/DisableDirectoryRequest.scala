package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to disable.
    */
  var DirectoryArn: Arn = js.native
}

object DisableDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): DisableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDirectoryRequest]
  }
}

