package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBehaviorModelTrainingSummariesRequest extends StObject {
  
  /**
    *  The maximum number of results to return at one time. The default is 25. 
    */
  var maxResults: js.UndefOr[TinyMaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The name of the security profile. 
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
}
object GetBehaviorModelTrainingSummariesRequest {
  
  inline def apply(): GetBehaviorModelTrainingSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBehaviorModelTrainingSummariesRequest]
  }
  
  extension [Self <: GetBehaviorModelTrainingSummariesRequest](x: Self) {
    
    inline def setMaxResults(value: TinyMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
  }
}
