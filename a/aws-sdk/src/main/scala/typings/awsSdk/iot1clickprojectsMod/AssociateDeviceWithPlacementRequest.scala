package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDeviceWithPlacementRequest extends StObject {
  
  /**
    * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4 character prefix is required for all deviceId values.
    */
  var deviceId: DeviceId = js.native
  
  /**
    * The device template name to associate with the device ID.
    */
  var deviceTemplateName: DeviceTemplateName = js.native
  
  /**
    * The name of the placement in which to associate the device.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The name of the project containing the placement in which to associate the device.
    */
  var projectName: ProjectName = js.native
}
object AssociateDeviceWithPlacementRequest {
  
  @scala.inline
  def apply(
    deviceId: DeviceId,
    deviceTemplateName: DeviceTemplateName,
    placementName: PlacementName,
    projectName: ProjectName
  ): AssociateDeviceWithPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceTemplateName = deviceTemplateName.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithPlacementRequest]
  }
  
  @scala.inline
  implicit class AssociateDeviceWithPlacementRequestMutableBuilder[Self <: AssociateDeviceWithPlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: DeviceId): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTemplateName(value: DeviceTemplateName): Self = StObject.set(x, "deviceTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
