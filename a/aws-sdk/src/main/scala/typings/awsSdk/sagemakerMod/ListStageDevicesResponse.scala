package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageDevicesResponse extends StObject {
  
  /**
    * List of summaries of devices allocated to the stage.
    */
  var DeviceDeploymentSummaries: typings.awsSdk.sagemakerMod.DeviceDeploymentSummaries
  
  /**
    * The token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListStageDevicesResponse {
  
  inline def apply(DeviceDeploymentSummaries: DeviceDeploymentSummaries): ListStageDevicesResponse = {
    val __obj = js.Dynamic.literal(DeviceDeploymentSummaries = DeviceDeploymentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageDevicesResponse]
  }
  
  extension [Self <: ListStageDevicesResponse](x: Self) {
    
    inline def setDeviceDeploymentSummaries(value: DeviceDeploymentSummaries): Self = StObject.set(x, "DeviceDeploymentSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceDeploymentSummariesVarargs(value: DeviceDeploymentSummary*): Self = StObject.set(x, "DeviceDeploymentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
