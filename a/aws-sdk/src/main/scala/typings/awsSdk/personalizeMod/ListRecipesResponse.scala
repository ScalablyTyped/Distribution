package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecipesResponse extends js.Object {
  /**
    * A token for getting the next set of recipes.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of available recipes.
    */
  var recipes: js.UndefOr[Recipes] = js.native
}

object ListRecipesResponse {
  @scala.inline
  def apply(): ListRecipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesResponse]
  }
  @scala.inline
  implicit class ListRecipesResponseOps[Self <: ListRecipesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRecipesVarargs(value: RecipeSummary*): Self = this.set("recipes", js.Array(value :_*))
    @scala.inline
    def setRecipes(value: Recipes): Self = this.set("recipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipes: Self = this.set("recipes", js.undefined)
  }
  
}

