package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityMailFromDomainAttributesRequest extends StObject {
  
  /**
    * A list of one or more identities.
    */
  var Identities: IdentityList = js.native
}
object GetIdentityMailFromDomainAttributesRequest {
  
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityMailFromDomainAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
  }
  
  @scala.inline
  implicit class GetIdentityMailFromDomainAttributesRequestMutableBuilder[Self <: GetIdentityMailFromDomainAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value :_*))
  }
}
