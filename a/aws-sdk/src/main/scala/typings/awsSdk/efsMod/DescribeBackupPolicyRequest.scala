package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBackupPolicyRequest extends StObject {
  
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
  implicit class DescribeBackupPolicyRequestMutableBuilder[Self <: DescribeBackupPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
