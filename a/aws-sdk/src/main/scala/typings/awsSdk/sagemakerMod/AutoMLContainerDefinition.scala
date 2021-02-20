package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLContainerDefinition extends StObject {
  
  /**
    * Environment variables to set in the container. Refer to ContainerDefinition for more details.
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.native
  
  /**
    * The ECR path of the container. Refer to ContainerDefinition for more details.
    */
  var Image: ContainerImage = js.native
  
  /**
    * The location of the model artifacts. Refer to ContainerDefinition for more details.
    */
  var ModelDataUrl: Url = js.native
}
object AutoMLContainerDefinition {
  
  @scala.inline
  def apply(Image: ContainerImage, ModelDataUrl: Url): AutoMLContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ModelDataUrl = ModelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLContainerDefinition]
  }
  
  @scala.inline
  implicit class AutoMLContainerDefinitionMutableBuilder[Self <: AutoMLContainerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: EnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
  }
}
