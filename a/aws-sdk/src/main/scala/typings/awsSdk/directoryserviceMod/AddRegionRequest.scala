package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRegionRequest extends js.Object {
  
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
  implicit class AddRegionRequestOps[Self <: AddRegionRequest] (val x: Self) extends AnyVal {
    
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCSettings(value: DirectoryVpcSettings): Self = this.set("VPCSettings", value.asInstanceOf[js.Any])
  }
}
