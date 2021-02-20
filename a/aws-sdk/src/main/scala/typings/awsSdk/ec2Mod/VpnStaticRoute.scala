package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnStaticRoute extends StObject {
  
  /**
    * The CIDR block associated with the local subnet of the customer data center.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Indicates how the routes were provided.
    */
  var Source: js.UndefOr[VpnStaticRouteSource] = js.native
  
  /**
    * The current state of the static route.
    */
  var State: js.UndefOr[VpnState] = js.native
}
object VpnStaticRoute {
  
  @scala.inline
  def apply(): VpnStaticRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnStaticRoute]
  }
  
  @scala.inline
  implicit class VpnStaticRouteMutableBuilder[Self <: VpnStaticRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setSource(value: VpnStaticRouteSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setState(value: VpnState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
