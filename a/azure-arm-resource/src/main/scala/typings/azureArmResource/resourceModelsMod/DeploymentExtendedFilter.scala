package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentExtendedFilter extends StObject {
  
  /**
    * The provisioning state.
    */
  var provisioningState: js.UndefOr[String] = js.native
}
object DeploymentExtendedFilter {
  
  @scala.inline
  def apply(): DeploymentExtendedFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExtendedFilter]
  }
  
  @scala.inline
  implicit class DeploymentExtendedFilterMutableBuilder[Self <: DeploymentExtendedFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
  }
}
