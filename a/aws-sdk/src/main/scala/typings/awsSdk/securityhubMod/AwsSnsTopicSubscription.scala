package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSnsTopicSubscription extends StObject {
  
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSnsTopicSubscription {
  
  inline def apply(): AwsSnsTopicSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicSubscription]
  }
  
  extension [Self <: AwsSnsTopicSubscription](x: Self) {
    
    inline def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
