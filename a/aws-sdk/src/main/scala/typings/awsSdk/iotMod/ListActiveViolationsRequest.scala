package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActiveViolationsRequest extends StObject {
  
  /**
    *  The criteria for a behavior. 
    */
  var behaviorCriteriaType: js.UndefOr[BehaviorCriteriaType] = js.undefined
  
  /**
    *  A list of all suppressed alerts. 
    */
  var listSuppressedAlerts: js.UndefOr[ListSuppressedAlerts] = js.undefined
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the Device Defender security profile for which violations are listed.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The name of the thing whose active violations are listed.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  
  /**
    * The verification state of the violation (detect alarm).
    */
  var verificationState: js.UndefOr[VerificationState] = js.undefined
}
object ListActiveViolationsRequest {
  
  inline def apply(): ListActiveViolationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsRequest]
  }
  
  extension [Self <: ListActiveViolationsRequest](x: Self) {
    
    inline def setBehaviorCriteriaType(value: BehaviorCriteriaType): Self = StObject.set(x, "behaviorCriteriaType", value.asInstanceOf[js.Any])
    
    inline def setBehaviorCriteriaTypeUndefined: Self = StObject.set(x, "behaviorCriteriaType", js.undefined)
    
    inline def setListSuppressedAlerts(value: ListSuppressedAlerts): Self = StObject.set(x, "listSuppressedAlerts", value.asInstanceOf[js.Any])
    
    inline def setListSuppressedAlertsUndefined: Self = StObject.set(x, "listSuppressedAlerts", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setVerificationState(value: VerificationState): Self = StObject.set(x, "verificationState", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateUndefined: Self = StObject.set(x, "verificationState", js.undefined)
  }
}
