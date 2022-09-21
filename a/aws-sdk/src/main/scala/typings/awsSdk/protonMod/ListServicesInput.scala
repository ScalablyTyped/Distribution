package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesInput extends StObject {
  
  /**
    * The maximum number of services to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next service in the array of services, after the list of services that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListServicesInput {
  
  inline def apply(): ListServicesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesInput]
  }
  
  extension [Self <: ListServicesInput](x: Self) {
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
