package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
  
  /**
    * Information about the transit gateway multicast group sources.
    */
  var RegisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastRegisteredGroupSources] = js.native
}
object RegisterTransitGatewayMulticastGroupSourcesResult {
  
  @scala.inline
  def apply(): RegisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupSourcesResult]
  }
  
  @scala.inline
  implicit class RegisterTransitGatewayMulticastGroupSourcesResultOps[Self <: RegisterTransitGatewayMulticastGroupSourcesResult] (val x: Self) extends AnyVal {
    
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
    def setRegisteredMulticastGroupSources(value: TransitGatewayMulticastRegisteredGroupSources): Self = this.set("RegisteredMulticastGroupSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredMulticastGroupSources: Self = this.set("RegisteredMulticastGroupSources", js.undefined)
  }
}
