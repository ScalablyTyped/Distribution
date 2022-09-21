package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContainerRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe to delete.
    */
  var containerRecipeArn: ContainerRecipeArn
}
object DeleteContainerRecipeRequest {
  
  inline def apply(containerRecipeArn: ContainerRecipeArn): DeleteContainerRecipeRequest = {
    val __obj = js.Dynamic.literal(containerRecipeArn = containerRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerRecipeRequest]
  }
  
  extension [Self <: DeleteContainerRecipeRequest](x: Self) {
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
  }
}
