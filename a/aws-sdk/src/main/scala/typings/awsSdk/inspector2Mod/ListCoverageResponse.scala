package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoverageResponse extends StObject {
  
  /**
    * An object that contains details on the covered resources in your environment.
    */
  var coveredResources: js.UndefOr[CoveredResources] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCoverageResponse {
  
  inline def apply(): ListCoverageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoverageResponse]
  }
  
  extension [Self <: ListCoverageResponse](x: Self) {
    
    inline def setCoveredResources(value: CoveredResources): Self = StObject.set(x, "coveredResources", value.asInstanceOf[js.Any])
    
    inline def setCoveredResourcesUndefined: Self = StObject.set(x, "coveredResources", js.undefined)
    
    inline def setCoveredResourcesVarargs(value: CoveredResource*): Self = StObject.set(x, "coveredResources", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
