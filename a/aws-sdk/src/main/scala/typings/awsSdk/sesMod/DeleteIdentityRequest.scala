package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityRequest extends StObject {
  
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: typings.awsSdk.sesMod.Identity
}
object DeleteIdentityRequest {
  
  @scala.inline
  def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
  
  @scala.inline
  implicit class DeleteIdentityRequestMutableBuilder[Self <: DeleteIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
  }
}
