package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRecipeResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that was deleted. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteImageRecipeResponse {
  
  @scala.inline
  def apply(): DeleteImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageRecipeResponse]
  }
  
  @scala.inline
  implicit class DeleteImageRecipeResponseMutableBuilder[Self <: DeleteImageRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeArnUndefined: Self = StObject.set(x, "imageRecipeArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
