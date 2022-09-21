package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentTemplatesInput extends StObject {
  
  /**
    * The maximum number of environment templates to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next environment template in the array of environment templates, after the list of environment templates that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentTemplatesInput {
  
  inline def apply(): ListEnvironmentTemplatesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentTemplatesInput]
  }
  
  extension [Self <: ListEnvironmentTemplatesInput](x: Self) {
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
