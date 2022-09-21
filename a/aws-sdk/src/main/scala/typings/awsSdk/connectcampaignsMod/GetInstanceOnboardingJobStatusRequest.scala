package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceOnboardingJobStatusRequest extends StObject {
  
  var connectInstanceId: InstanceId
}
object GetInstanceOnboardingJobStatusRequest {
  
  inline def apply(connectInstanceId: InstanceId): GetInstanceOnboardingJobStatusRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceOnboardingJobStatusRequest]
  }
  
  extension [Self <: GetInstanceOnboardingJobStatusRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
  }
}
