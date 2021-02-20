package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityVerificationAttributes extends StObject {
  
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: typings.awsSdk.sesMod.VerificationStatus = js.native
  
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[typings.awsSdk.sesMod.VerificationToken] = js.native
}
object IdentityVerificationAttributes {
  
  @scala.inline
  def apply(VerificationStatus: VerificationStatus): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
  
  @scala.inline
  implicit class IdentityVerificationAttributesMutableBuilder[Self <: IdentityVerificationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVerificationStatus(value: VerificationStatus): Self = StObject.set(x, "VerificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationToken(value: VerificationToken): Self = StObject.set(x, "VerificationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationTokenUndefined: Self = StObject.set(x, "VerificationToken", js.undefined)
  }
}
