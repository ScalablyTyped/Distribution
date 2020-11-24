package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecipesRequest extends js.Object {
  
  /**
    * The maximum number of recipes to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * A token returned from the previous call to ListRecipes for getting the next set of recipes (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The default is SERVICE.
    */
  var recipeProvider: js.UndefOr[RecipeProvider] = js.native
}
object ListRecipesRequest {
  
  @scala.inline
  def apply(): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesRequest]
  }
  
  @scala.inline
  implicit class ListRecipesRequestOps[Self <: ListRecipesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRecipeProvider(value: RecipeProvider): Self = this.set("recipeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeProvider: Self = this.set("recipeProvider", js.undefined)
  }
}
