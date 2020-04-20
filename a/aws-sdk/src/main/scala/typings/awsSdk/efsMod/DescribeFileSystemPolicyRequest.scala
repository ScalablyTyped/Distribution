package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemPolicyRequest extends js.Object {
  /**
    * Specifies which EFS file system to retrieve the FileSystemPolicy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
}

object DescribeFileSystemPolicyRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemPolicyRequest]
  }
}

