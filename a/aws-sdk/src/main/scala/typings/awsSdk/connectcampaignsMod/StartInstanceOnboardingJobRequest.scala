package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceOnboardingJobRequest extends StObject {
  
  var connectInstanceId: InstanceId
  
  var encryptionConfig: EncryptionConfig
}
object StartInstanceOnboardingJobRequest {
  
  inline def apply(connectInstanceId: InstanceId, encryptionConfig: EncryptionConfig): StartInstanceOnboardingJobRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any], encryptionConfig = encryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceOnboardingJobRequest]
  }
  
  extension [Self <: StartInstanceOnboardingJobRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
  }
}
