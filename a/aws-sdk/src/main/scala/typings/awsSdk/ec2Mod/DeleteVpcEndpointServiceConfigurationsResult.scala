package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointServiceConfigurationsResult extends StObject {
  
  /**
    * Information about the service configurations that were not deleted, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object DeleteVpcEndpointServiceConfigurationsResult {
  
  @scala.inline
  def apply(): DeleteVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointServiceConfigurationsResult]
  }
  
  @scala.inline
  implicit class DeleteVpcEndpointServiceConfigurationsResultMutableBuilder[Self <: DeleteVpcEndpointServiceConfigurationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
