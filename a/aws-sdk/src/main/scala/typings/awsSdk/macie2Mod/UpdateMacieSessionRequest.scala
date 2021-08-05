package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMacieSessionRequest extends StObject {
  
  /**
    * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  
  /**
    * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie activities for the account; and, PAUSED, suspend all Macie activities for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.undefined
}
object UpdateMacieSessionRequest {
  
  inline def apply(): UpdateMacieSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMacieSessionRequest]
  }
  
  extension [Self <: UpdateMacieSessionRequest](x: Self) {
    
    inline def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "findingPublishingFrequency", value.asInstanceOf[js.Any])
    
    inline def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "findingPublishingFrequency", js.undefined)
    
    inline def setStatus(value: MacieStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
