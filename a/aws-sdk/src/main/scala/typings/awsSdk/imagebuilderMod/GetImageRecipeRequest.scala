package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageRecipeRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that you want to retrieve. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
}
object GetImageRecipeRequest {
  
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): GetImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipeRequest]
  }
  
  @scala.inline
  implicit class GetImageRecipeRequestOps[Self <: GetImageRecipeRequest] (val x: Self) extends AnyVal {
    
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
