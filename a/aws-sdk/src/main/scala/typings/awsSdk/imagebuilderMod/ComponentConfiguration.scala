package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var componentArn: ComponentVersionArnOrBuildVersionArn
  
  /**
    * A group of parameter settings that are used to configure the component for a specific recipe.
    */
  var parameters: js.UndefOr[ComponentParameterList] = js.undefined
}
object ComponentConfiguration {
  
  inline def apply(componentArn: ComponentVersionArnOrBuildVersionArn): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
  
  extension [Self <: ComponentConfiguration](x: Self) {
    
    inline def setComponentArn(value: ComponentVersionArnOrBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ComponentParameterList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ComponentParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
