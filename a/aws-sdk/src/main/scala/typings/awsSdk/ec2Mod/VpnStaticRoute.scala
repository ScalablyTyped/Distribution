package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnStaticRoute extends js.Object {
  
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
  implicit class VpnStaticRouteOps[Self <: VpnStaticRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setSource(value: VpnStaticRouteSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setState(value: VpnState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
