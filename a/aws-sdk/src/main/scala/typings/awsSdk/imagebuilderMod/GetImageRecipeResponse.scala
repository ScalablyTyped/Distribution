package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRecipeResponse extends js.Object {
  /**
    *  The image recipe object. 
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetImageRecipeResponse {
  @scala.inline
  def apply(imageRecipe: ImageRecipe = null, requestId: NonEmptyString = null): GetImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    if (imageRecipe != null) __obj.updateDynamic("imageRecipe")(imageRecipe.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipeResponse]
  }
}

