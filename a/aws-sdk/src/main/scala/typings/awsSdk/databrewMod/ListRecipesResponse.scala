package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecipesResponse extends StObject {
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
  
  /**
    * A list of recipes that are defined.
    */
  var Recipes: RecipeList
}
object ListRecipesResponse {
  
  inline def apply(Recipes: RecipeList): ListRecipesResponse = {
    val __obj = js.Dynamic.literal(Recipes = Recipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecipesResponse]
  }
  
  extension [Self <: ListRecipesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecipes(value: RecipeList): Self = StObject.set(x, "Recipes", value.asInstanceOf[js.Any])
    
    inline def setRecipesVarargs(value: Recipe*): Self = StObject.set(x, "Recipes", js.Array(value*))
  }
}
