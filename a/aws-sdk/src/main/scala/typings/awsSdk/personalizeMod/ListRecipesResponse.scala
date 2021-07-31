package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecipesResponse extends StObject {
  
  /**
    * A token for getting the next set of recipes.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of available recipes.
    */
  var recipes: js.UndefOr[Recipes] = js.undefined
}
object ListRecipesResponse {
  
  @scala.inline
  def apply(): ListRecipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesResponse]
  }
  
  @scala.inline
  implicit class ListRecipesResponseMutableBuilder[Self <: ListRecipesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRecipes(value: Recipes): Self = StObject.set(x, "recipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipesUndefined: Self = StObject.set(x, "recipes", js.undefined)
    
    @scala.inline
    def setRecipesVarargs(value: RecipeSummary*): Self = StObject.set(x, "recipes", js.Array(value :_*))
  }
}
