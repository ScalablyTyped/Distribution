package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentExtendedFilter extends StObject {
  
  /**
    * The provisioning state.
    */
  var provisioningState: js.UndefOr[String] = js.undefined
}
object DeploymentExtendedFilter {
  
  inline def apply(): DeploymentExtendedFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExtendedFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentExtendedFilter] (val x: Self) extends AnyVal {
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
  }
}
