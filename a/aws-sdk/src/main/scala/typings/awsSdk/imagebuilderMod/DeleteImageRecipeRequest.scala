package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe to delete. 
    */
  var imageRecipeArn: ImageRecipeArn
}
object DeleteImageRecipeRequest {
  
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): DeleteImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRecipeRequest]
  }
  
  @scala.inline
  implicit class DeleteImageRecipeRequestMutableBuilder[Self <: DeleteImageRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
