package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLifecycleConfigurationRequest extends StObject {
  
  /**
    * The ID of the file system whose LifecycleConfiguration object you want to retrieve (String).
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
}
object DescribeLifecycleConfigurationRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeLifecycleConfigurationRequestMutableBuilder[Self <: DescribeLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
