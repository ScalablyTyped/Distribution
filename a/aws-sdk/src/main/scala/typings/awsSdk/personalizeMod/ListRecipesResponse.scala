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
  def apply(nextToken: NextToken = null, recipes: Recipes = null): ListRecipesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (recipes != null) __obj.updateDynamic("recipes")(recipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecipesResponse]
  }
}

