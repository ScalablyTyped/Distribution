package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityVerificationAttributesResponse extends StObject {
  
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typings.awsSdk.sesMod.VerificationAttributes = js.native
}
object GetIdentityVerificationAttributesResponse {
  
  @scala.inline
  def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
  
  @scala.inline
  implicit class GetIdentityVerificationAttributesResponseMutableBuilder[Self <: GetIdentityVerificationAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVerificationAttributes(value: VerificationAttributes): Self = StObject.set(x, "VerificationAttributes", value.asInstanceOf[js.Any])
  }
}
