package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecipeResponse extends js.Object {
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.native
}

object DescribeRecipeResponse {
  @scala.inline
  def apply(recipe: Recipe = null): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    if (recipe != null) __obj.updateDynamic("recipe")(recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
}

