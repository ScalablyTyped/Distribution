package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptVpcEndpointConnectionsResult extends StObject {
  
  /**
    * Information about the interface endpoints that were not accepted, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object AcceptVpcEndpointConnectionsResult {
  
  @scala.inline
  def apply(): AcceptVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptVpcEndpointConnectionsResult]
  }
  
  @scala.inline
  implicit class AcceptVpcEndpointConnectionsResultMutableBuilder[Self <: AcceptVpcEndpointConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
