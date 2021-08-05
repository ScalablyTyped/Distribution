package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageRecipePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve. 
    */
  var imageRecipeArn: ImageRecipeArn
}
object GetImageRecipePolicyRequest {
  
  inline def apply(imageRecipeArn: ImageRecipeArn): GetImageRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipePolicyRequest]
  }
  
  extension [Self <: GetImageRecipePolicyRequest](x: Self) {
    
    inline def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
