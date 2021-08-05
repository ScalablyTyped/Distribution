package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component. 
    */
  var componentArn: ComponentVersionArnOrBuildVersionArn
}
object ComponentConfiguration {
  
  inline def apply(componentArn: ComponentVersionArnOrBuildVersionArn): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
  
  extension [Self <: ComponentConfiguration](x: Self) {
    
    inline def setComponentArn(value: ComponentVersionArnOrBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
  }
}
