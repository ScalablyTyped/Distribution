package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachThingPrincipalRequest extends StObject {
  
  /**
    * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
    */
  var principal: Principal = js.native
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}
object DetachThingPrincipalRequest {
  
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): DetachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachThingPrincipalRequest]
  }
  
  @scala.inline
  implicit class DetachThingPrincipalRequestMutableBuilder[Self <: DetachThingPrincipalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
