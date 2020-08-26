package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRecipeResponse extends js.Object {
  /**
    * The image recipe object. 
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetImageRecipeResponse {
  @scala.inline
  def apply(): GetImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageRecipeResponse]
  }
  @scala.inline
  implicit class GetImageRecipeResponseOps[Self <: GetImageRecipeResponse] (val x: Self) extends AnyVal {
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
    def setImageRecipe(value: ImageRecipe): Self = this.set("imageRecipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageRecipe: Self = this.set("imageRecipe", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

