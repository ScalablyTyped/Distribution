package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceFleetReportResponse extends StObject {
  
  /**
    * The versions of Edge Manager agent deployed on the fleet.
    */
  var AgentVersions: js.UndefOr[typings.awsSdk.sagemakerMod.AgentVersions] = js.undefined
  
  /**
    * Description of the fleet.
    */
  var Description: js.UndefOr[DeviceFleetDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var DeviceFleetArn: typings.awsSdk.sagemakerMod.DeviceFleetArn
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
  
  /**
    * Status of devices.
    */
  var DeviceStats: js.UndefOr[typings.awsSdk.sagemakerMod.DeviceStats] = js.undefined
  
  /**
    * Status of model on device.
    */
  var ModelStats: js.UndefOr[EdgeModelStats] = js.undefined
  
  /**
    * The output configuration for storing sample data collected by the fleet.
    */
  var OutputConfig: js.UndefOr[EdgeOutputConfig] = js.undefined
  
  /**
    * Timestamp of when the report was generated.
    */
  var ReportGenerated: js.UndefOr[js.Date] = js.undefined
}
object GetDeviceFleetReportResponse {
  
  inline def apply(DeviceFleetArn: DeviceFleetArn, DeviceFleetName: EntityName): GetDeviceFleetReportResponse = {
    val __obj = js.Dynamic.literal(DeviceFleetArn = DeviceFleetArn.asInstanceOf[js.Any], DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceFleetReportResponse]
  }
  
  extension [Self <: GetDeviceFleetReportResponse](x: Self) {
    
    inline def setAgentVersions(value: AgentVersions): Self = StObject.set(x, "AgentVersions", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionsUndefined: Self = StObject.set(x, "AgentVersions", js.undefined)
    
    inline def setAgentVersionsVarargs(value: AgentVersion*): Self = StObject.set(x, "AgentVersions", js.Array(value*))
    
    inline def setDescription(value: DeviceFleetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceFleetArn(value: DeviceFleetArn): Self = StObject.set(x, "DeviceFleetArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceStats(value: DeviceStats): Self = StObject.set(x, "DeviceStats", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatsUndefined: Self = StObject.set(x, "DeviceStats", js.undefined)
    
    inline def setModelStats(value: EdgeModelStats): Self = StObject.set(x, "ModelStats", value.asInstanceOf[js.Any])
    
    inline def setModelStatsUndefined: Self = StObject.set(x, "ModelStats", js.undefined)
    
    inline def setModelStatsVarargs(value: EdgeModelStat*): Self = StObject.set(x, "ModelStats", js.Array(value*))
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    inline def setReportGenerated(value: js.Date): Self = StObject.set(x, "ReportGenerated", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratedUndefined: Self = StObject.set(x, "ReportGenerated", js.undefined)
  }
}
