package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerRecipeResponse extends StObject {
  
  /**
    * The container recipe object that is returned.
    */
  var containerRecipe: js.UndefOr[ContainerRecipe] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetContainerRecipeResponse {
  
  inline def apply(): GetContainerRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerRecipeResponse]
  }
  
  extension [Self <: GetContainerRecipeResponse](x: Self) {
    
    inline def setContainerRecipe(value: ContainerRecipe): Self = StObject.set(x, "containerRecipe", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeUndefined: Self = StObject.set(x, "containerRecipe", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
