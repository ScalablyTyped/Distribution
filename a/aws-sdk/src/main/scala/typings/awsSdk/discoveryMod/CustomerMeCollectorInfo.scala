package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerMeCollectorInfo extends StObject {
  
  /**
    *  The number of active Migration Evaluator collectors. 
    */
  var activeMeCollectors: Integer
  
  /**
    *  The number of deny-listed Migration Evaluator collectors. 
    */
  var denyListedMeCollectors: Integer
  
  /**
    *  The number of healthy Migration Evaluator collectors. 
    */
  var healthyMeCollectors: Integer
  
  /**
    *  The number of Migration Evaluator collectors with SHUTDOWN status. 
    */
  var shutdownMeCollectors: Integer
  
  /**
    *  The total number of Migration Evaluator collectors. 
    */
  var totalMeCollectors: Integer
  
  /**
    *  The number of unhealthy Migration Evaluator collectors. 
    */
  var unhealthyMeCollectors: Integer
  
  /**
    *  The number of unknown Migration Evaluator collectors. 
    */
  var unknownMeCollectors: Integer
}
object CustomerMeCollectorInfo {
  
  inline def apply(
    activeMeCollectors: Integer,
    denyListedMeCollectors: Integer,
    healthyMeCollectors: Integer,
    shutdownMeCollectors: Integer,
    totalMeCollectors: Integer,
    unhealthyMeCollectors: Integer,
    unknownMeCollectors: Integer
  ): CustomerMeCollectorInfo = {
    val __obj = js.Dynamic.literal(activeMeCollectors = activeMeCollectors.asInstanceOf[js.Any], denyListedMeCollectors = denyListedMeCollectors.asInstanceOf[js.Any], healthyMeCollectors = healthyMeCollectors.asInstanceOf[js.Any], shutdownMeCollectors = shutdownMeCollectors.asInstanceOf[js.Any], totalMeCollectors = totalMeCollectors.asInstanceOf[js.Any], unhealthyMeCollectors = unhealthyMeCollectors.asInstanceOf[js.Any], unknownMeCollectors = unknownMeCollectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerMeCollectorInfo]
  }
  
  extension [Self <: CustomerMeCollectorInfo](x: Self) {
    
    inline def setActiveMeCollectors(value: Integer): Self = StObject.set(x, "activeMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setDenyListedMeCollectors(value: Integer): Self = StObject.set(x, "denyListedMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setHealthyMeCollectors(value: Integer): Self = StObject.set(x, "healthyMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setShutdownMeCollectors(value: Integer): Self = StObject.set(x, "shutdownMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setTotalMeCollectors(value: Integer): Self = StObject.set(x, "totalMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyMeCollectors(value: Integer): Self = StObject.set(x, "unhealthyMeCollectors", value.asInstanceOf[js.Any])
    
    inline def setUnknownMeCollectors(value: Integer): Self = StObject.set(x, "unknownMeCollectors", value.asInstanceOf[js.Any])
  }
}
