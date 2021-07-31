package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointsResult extends StObject {
  
  /**
    * Information about the VPC endpoints that were not successfully deleted.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object DeleteVpcEndpointsResult {
  
  @scala.inline
  def apply(): DeleteVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointsResult]
  }
  
  @scala.inline
  implicit class DeleteVpcEndpointsResultMutableBuilder[Self <: DeleteVpcEndpointsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
