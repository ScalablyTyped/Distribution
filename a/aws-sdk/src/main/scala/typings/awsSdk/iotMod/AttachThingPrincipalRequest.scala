package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachThingPrincipalRequest extends StObject {
  
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal = js.native
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}
object AttachThingPrincipalRequest {
  
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): AttachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachThingPrincipalRequest]
  }
  
  @scala.inline
  implicit class AttachThingPrincipalRequestMutableBuilder[Self <: AttachThingPrincipalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
