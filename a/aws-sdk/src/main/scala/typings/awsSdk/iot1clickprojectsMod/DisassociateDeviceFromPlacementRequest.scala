package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDeviceFromPlacementRequest extends StObject {
  
  /**
    * The device ID that should be removed from the placement.
    */
  var deviceTemplateName: DeviceTemplateName
  
  /**
    * The name of the placement that the device should be removed from.
    */
  var placementName: PlacementName
  
  /**
    * The name of the project that contains the placement.
    */
  var projectName: ProjectName
}
object DisassociateDeviceFromPlacementRequest {
  
  inline def apply(deviceTemplateName: DeviceTemplateName, placementName: PlacementName, projectName: ProjectName): DisassociateDeviceFromPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceTemplateName = deviceTemplateName.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDeviceFromPlacementRequest]
  }
  
  extension [Self <: DisassociateDeviceFromPlacementRequest](x: Self) {
    
    inline def setDeviceTemplateName(value: DeviceTemplateName): Self = StObject.set(x, "deviceTemplateName", value.asInstanceOf[js.Any])
    
    inline def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
