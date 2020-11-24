package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateDeviceFromPlacementRequest extends js.Object {
  
  /**
    * The device ID that should be removed from the placement.
    */
  var deviceTemplateName: DeviceTemplateName = js.native
  
  /**
    * The name of the placement that the device should be removed from.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The name of the project that contains the placement.
    */
  var projectName: ProjectName = js.native
}
object DisassociateDeviceFromPlacementRequest {
  
  @scala.inline
  def apply(deviceTemplateName: DeviceTemplateName, placementName: PlacementName, projectName: ProjectName): DisassociateDeviceFromPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceTemplateName = deviceTemplateName.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDeviceFromPlacementRequest]
  }
  
  @scala.inline
  implicit class DisassociateDeviceFromPlacementRequestOps[Self <: DisassociateDeviceFromPlacementRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceTemplateName(value: DeviceTemplateName): Self = this.set("deviceTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = this.set("placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
  }
}
