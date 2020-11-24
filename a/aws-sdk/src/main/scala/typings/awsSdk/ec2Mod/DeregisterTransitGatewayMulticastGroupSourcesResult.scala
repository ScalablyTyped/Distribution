package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
  
  /**
    * Information about the deregistered group sources.
    */
  var DeregisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastDeregisteredGroupSources] = js.native
}
object DeregisterTransitGatewayMulticastGroupSourcesResult {
  
  @scala.inline
  def apply(): DeregisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupSourcesResult]
  }
  
  @scala.inline
  implicit class DeregisterTransitGatewayMulticastGroupSourcesResultOps[Self <: DeregisterTransitGatewayMulticastGroupSourcesResult] (val x: Self) extends AnyVal {
    
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
    def setDeregisteredMulticastGroupSources(value: TransitGatewayMulticastDeregisteredGroupSources): Self = this.set("DeregisteredMulticastGroupSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeregisteredMulticastGroupSources: Self = this.set("DeregisteredMulticastGroupSources", js.undefined)
  }
}
