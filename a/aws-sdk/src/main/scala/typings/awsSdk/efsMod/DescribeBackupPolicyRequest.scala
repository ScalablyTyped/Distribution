package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupPolicyRequest extends js.Object {
  /**
    * Specifies which EFS file system to retrieve the BackupPolicy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
}

object DescribeBackupPolicyRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeBackupPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupPolicyRequest]
  }
  @scala.inline
  implicit class DescribeBackupPolicyRequestOps[Self <: DescribeBackupPolicyRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
  }
  
}

