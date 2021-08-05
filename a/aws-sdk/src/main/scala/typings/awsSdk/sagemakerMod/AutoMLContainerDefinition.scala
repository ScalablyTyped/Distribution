package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLContainerDefinition extends StObject {
  
  /**
    * Environment variables to set in the container. Refer to ContainerDefinition for more details.
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.undefined
  
  /**
    * The ECR path of the container. Refer to ContainerDefinition for more details.
    */
  var Image: ContainerImage
  
  /**
    * The location of the model artifacts. Refer to ContainerDefinition for more details.
    */
  var ModelDataUrl: Url
}
object AutoMLContainerDefinition {
  
  inline def apply(Image: ContainerImage, ModelDataUrl: Url): AutoMLContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ModelDataUrl = ModelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLContainerDefinition]
  }
  
  extension [Self <: AutoMLContainerDefinition](x: Self) {
    
    inline def setEnvironment(value: EnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
  }
}
