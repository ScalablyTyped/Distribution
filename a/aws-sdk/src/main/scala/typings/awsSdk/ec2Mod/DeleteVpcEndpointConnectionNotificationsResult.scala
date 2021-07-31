package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointConnectionNotificationsResult extends StObject {
  
  /**
    * Information about the notifications that could not be deleted successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object DeleteVpcEndpointConnectionNotificationsResult {
  
  @scala.inline
  def apply(): DeleteVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsResult]
  }
  
  @scala.inline
  implicit class DeleteVpcEndpointConnectionNotificationsResultMutableBuilder[Self <: DeleteVpcEndpointConnectionNotificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
