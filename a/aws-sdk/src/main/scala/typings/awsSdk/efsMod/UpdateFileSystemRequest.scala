package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFileSystemRequest extends StObject {
  
  /**
    * The ID of the file system that you want to update.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  
  /**
    * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. Valid values are 1-1024. Required if ThroughputMode is changed to provisioned on update. If you're not updating the amount of provisioned throughput for your file system, you don't need to provide this value in your request. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  
  /**
    * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput mode, you don't need to provide this value in your request. If you are changing the ThroughputMode to provisioned, you must also set a value for ProvisionedThroughputInMibps.
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.efsMod.ThroughputMode] = js.native
}
object UpdateFileSystemRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  
  @scala.inline
  implicit class UpdateFileSystemRequestMutableBuilder[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = StObject.set(x, "ProvisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputInMibpsUndefined: Self = StObject.set(x, "ProvisionedThroughputInMibps", js.undefined)
    
    @scala.inline
    def setThroughputMode(value: ThroughputMode): Self = StObject.set(x, "ThroughputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputModeUndefined: Self = StObject.set(x, "ThroughputMode", js.undefined)
  }
}
