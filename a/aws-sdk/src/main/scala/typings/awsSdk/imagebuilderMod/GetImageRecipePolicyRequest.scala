package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRecipePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
}

object GetImageRecipePolicyRequest {
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): GetImageRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipePolicyRequest]
  }
}

