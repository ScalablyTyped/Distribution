package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageRecipePolicyRequest extends StObject {
  
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
  
  @scala.inline
  implicit class GetImageRecipePolicyRequestMutableBuilder[Self <: GetImageRecipePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
