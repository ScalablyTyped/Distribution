package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageRecipeRequest extends StObject {
  
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
  implicit class GetImageRecipeRequestMutableBuilder[Self <: GetImageRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
