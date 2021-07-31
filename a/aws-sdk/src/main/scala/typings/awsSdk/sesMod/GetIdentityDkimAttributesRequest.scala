package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityDkimAttributesRequest extends StObject {
  
  /**
    * A list of one or more verified identities - email addresses, domains, or both.
    */
  var Identities: IdentityList
}
object GetIdentityDkimAttributesRequest {
  
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityDkimAttributesRequest]
  }
  
  @scala.inline
  implicit class GetIdentityDkimAttributesRequestMutableBuilder[Self <: GetIdentityDkimAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value :_*))
  }
}
