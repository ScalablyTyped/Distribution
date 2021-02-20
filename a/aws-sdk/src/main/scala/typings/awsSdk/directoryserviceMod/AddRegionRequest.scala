package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRegionRequest extends StObject {
  
  /**
    * The identifier of the directory to which you want to add Region replication.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The name of the Region where you want to add domain controllers for replication. For example, us-east-1.
    */
  var RegionName: typings.awsSdk.directoryserviceMod.RegionName = js.native
  
  var VPCSettings: DirectoryVpcSettings = js.native
}
object AddRegionRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, RegionName: RegionName, VPCSettings: DirectoryVpcSettings): AddRegionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RegionName = RegionName.asInstanceOf[js.Any], VPCSettings = VPCSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRegionRequest]
  }
  
  @scala.inline
  implicit class AddRegionRequestMutableBuilder[Self <: AddRegionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCSettings(value: DirectoryVpcSettings): Self = StObject.set(x, "VPCSettings", value.asInstanceOf[js.Any])
  }
}
