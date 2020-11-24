package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImageRecipeRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe to delete. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
}
object DeleteImageRecipeRequest {
  
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): DeleteImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRecipeRequest]
  }
  
  @scala.inline
  implicit class DeleteImageRecipeRequestOps[Self <: DeleteImageRecipeRequest] (val x: Self) extends AnyVal {
    
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
    def setImageRecipeArn(value: ImageRecipeArn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
