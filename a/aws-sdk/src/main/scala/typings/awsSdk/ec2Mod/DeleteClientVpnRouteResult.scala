package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClientVpnRouteResult extends StObject {
  
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
}
object DeleteClientVpnRouteResult {
  
  @scala.inline
  def apply(): DeleteClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClientVpnRouteResult]
  }
  
  @scala.inline
  implicit class DeleteClientVpnRouteResultMutableBuilder[Self <: DeleteClientVpnRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ClientVpnRouteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
