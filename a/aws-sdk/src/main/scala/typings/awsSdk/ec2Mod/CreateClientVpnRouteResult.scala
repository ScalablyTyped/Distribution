package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientVpnRouteResult extends StObject {
  
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.native
}
object CreateClientVpnRouteResult {
  
  @scala.inline
  def apply(): CreateClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientVpnRouteResult]
  }
  
  @scala.inline
  implicit class CreateClientVpnRouteResultMutableBuilder[Self <: CreateClientVpnRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ClientVpnRouteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
