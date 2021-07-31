package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecipesRequest extends StObject {
  
  /**
    * The maximum number of recipes to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListRecipes for getting the next set of recipes (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The default is SERVICE.
    */
  var recipeProvider: js.UndefOr[RecipeProvider] = js.undefined
}
object ListRecipesRequest {
  
  @scala.inline
  def apply(): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesRequest]
  }
  
  @scala.inline
  implicit class ListRecipesRequestMutableBuilder[Self <: ListRecipesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRecipeProvider(value: RecipeProvider): Self = StObject.set(x, "recipeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeProviderUndefined: Self = StObject.set(x, "recipeProvider", js.undefined)
  }
}
