package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilesForTargetRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * If true, return child groups too.
    */
  var recursive: js.UndefOr[Recursive] = js.undefined
  
  /**
    * The ARN of the target (thing group) whose attached security profiles you want to get.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn
}
object ListSecurityProfilesForTargetRequest {
  
  inline def apply(securityProfileTargetArn: SecurityProfileTargetArn): ListSecurityProfilesForTargetRequest = {
    val __obj = js.Dynamic.literal(securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityProfilesForTargetRequest]
  }
  
  extension [Self <: ListSecurityProfilesForTargetRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecursive(value: Recursive): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setSecurityProfileTargetArn(value: SecurityProfileTargetArn): Self = StObject.set(x, "securityProfileTargetArn", value.asInstanceOf[js.Any])
  }
}
