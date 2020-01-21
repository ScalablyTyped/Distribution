package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    recipeProvider: RecipeProvider = null
  ): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (recipeProvider != null) __obj.updateDynamic("recipeProvider")(recipeProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecipesRequest]
  }
}

