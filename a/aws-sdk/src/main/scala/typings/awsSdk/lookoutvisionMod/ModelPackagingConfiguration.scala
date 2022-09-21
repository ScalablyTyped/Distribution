package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackagingConfiguration extends StObject {
  
  /**
    *  Configuration information for the AWS IoT Greengrass component in a model packaging job. 
    */
  var Greengrass: GreengrassConfiguration
}
object ModelPackagingConfiguration {
  
  inline def apply(Greengrass: GreengrassConfiguration): ModelPackagingConfiguration = {
    val __obj = js.Dynamic.literal(Greengrass = Greengrass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackagingConfiguration]
  }
  
  extension [Self <: ModelPackagingConfiguration](x: Self) {
    
    inline def setGreengrass(value: GreengrassConfiguration): Self = StObject.set(x, "Greengrass", value.asInstanceOf[js.Any])
  }
}
