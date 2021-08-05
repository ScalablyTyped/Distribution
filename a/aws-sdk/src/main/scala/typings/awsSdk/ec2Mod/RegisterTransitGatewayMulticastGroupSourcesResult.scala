package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTransitGatewayMulticastGroupSourcesResult extends StObject {
  
  /**
    * Information about the transit gateway multicast group sources.
    */
  var RegisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastRegisteredGroupSources] = js.undefined
}
object RegisterTransitGatewayMulticastGroupSourcesResult {
  
  inline def apply(): RegisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupSourcesResult]
  }
  
  extension [Self <: RegisterTransitGatewayMulticastGroupSourcesResult](x: Self) {
    
    inline def setRegisteredMulticastGroupSources(value: TransitGatewayMulticastRegisteredGroupSources): Self = StObject.set(x, "RegisteredMulticastGroupSources", value.asInstanceOf[js.Any])
    
    inline def setRegisteredMulticastGroupSourcesUndefined: Self = StObject.set(x, "RegisteredMulticastGroupSources", js.undefined)
  }
}
