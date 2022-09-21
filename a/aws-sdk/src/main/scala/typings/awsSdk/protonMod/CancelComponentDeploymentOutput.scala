package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelComponentDeploymentOutput extends StObject {
  
  /**
    * The detailed data of the component with the deployment that is being canceled.
    */
  var component: Component
}
object CancelComponentDeploymentOutput {
  
  inline def apply(component: Component): CancelComponentDeploymentOutput = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelComponentDeploymentOutput]
  }
  
  extension [Self <: CancelComponentDeploymentOutput](x: Self) {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
