package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFileSystemPolicyRequest extends StObject {
  
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
  
  @scala.inline
  implicit class DescribeFileSystemPolicyRequestMutableBuilder[Self <: DescribeFileSystemPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
