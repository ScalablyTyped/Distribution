package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsInput extends StObject {
  
  /**
    * An array of the versions of the environment template.
    */
  var environmentTemplates: js.UndefOr[EnvironmentTemplateFilterList] = js.undefined
  
  /**
    * The maximum number of environments to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next environment in the array of environments, after the list of environments that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentsInput {
  
  inline def apply(): ListEnvironmentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsInput]
  }
  
  extension [Self <: ListEnvironmentsInput](x: Self) {
    
    inline def setEnvironmentTemplates(value: EnvironmentTemplateFilterList): Self = StObject.set(x, "environmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTemplatesUndefined: Self = StObject.set(x, "environmentTemplates", js.undefined)
    
    inline def setEnvironmentTemplatesVarargs(value: EnvironmentTemplateFilter*): Self = StObject.set(x, "environmentTemplates", js.Array(value*))
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
