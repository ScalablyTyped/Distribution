package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropagatingVgw extends StObject {
  
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.native
}
object PropagatingVgw {
  
  @scala.inline
  def apply(): PropagatingVgw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropagatingVgw]
  }
  
  @scala.inline
  implicit class PropagatingVgwMutableBuilder[Self <: PropagatingVgw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
  }
}
