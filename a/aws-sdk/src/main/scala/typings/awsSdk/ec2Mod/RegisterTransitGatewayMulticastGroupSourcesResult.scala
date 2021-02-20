package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayMulticastGroupSourcesResult extends StObject {
  
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
  implicit class RegisterTransitGatewayMulticastGroupSourcesResultMutableBuilder[Self <: RegisterTransitGatewayMulticastGroupSourcesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisteredMulticastGroupSources(value: TransitGatewayMulticastRegisteredGroupSources): Self = StObject.set(x, "RegisteredMulticastGroupSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredMulticastGroupSourcesUndefined: Self = StObject.set(x, "RegisteredMulticastGroupSources", js.undefined)
  }
}
