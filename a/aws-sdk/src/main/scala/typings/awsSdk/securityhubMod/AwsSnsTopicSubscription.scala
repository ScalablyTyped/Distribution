package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSnsTopicSubscription extends StObject {
  
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
}
object AwsSnsTopicSubscription {
  
  @scala.inline
  def apply(): AwsSnsTopicSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicSubscription]
  }
  
  @scala.inline
  implicit class AwsSnsTopicSubscriptionMutableBuilder[Self <: AwsSnsTopicSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
