package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecipesRequest extends StObject {
  
  /**
    * The maximum number of results to return in this request. 
    */
  var MaxResults: js.UndefOr[MaxResults100] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
  
  /**
    * A version identifier. Using this parameter indicates to return only those recipes that have this version identifier.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.undefined
}
object ListRecipesRequest {
  
  inline def apply(): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesRequest]
  }
  
  extension [Self <: ListRecipesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
