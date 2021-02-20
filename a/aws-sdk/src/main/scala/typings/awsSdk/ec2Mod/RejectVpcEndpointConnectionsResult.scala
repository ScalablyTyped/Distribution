package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectVpcEndpointConnectionsResult extends StObject {
  
  /**
    * Information about the endpoints that were not rejected, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}
object RejectVpcEndpointConnectionsResult {
  
  @scala.inline
  def apply(): RejectVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectVpcEndpointConnectionsResult]
  }
  
  @scala.inline
  implicit class RejectVpcEndpointConnectionsResultMutableBuilder[Self <: RejectVpcEndpointConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
