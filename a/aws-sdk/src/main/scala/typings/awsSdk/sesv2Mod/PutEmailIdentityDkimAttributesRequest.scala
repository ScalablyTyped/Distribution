package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityDkimAttributesRequest extends StObject {
  
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity
  
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that are sent from the identity are signed using DKIM. If you set this value to false, your messages are sent without DKIM signing.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
}
object PutEmailIdentityDkimAttributesRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
  
  @scala.inline
  implicit class PutEmailIdentityDkimAttributesRequestMutableBuilder[Self <: PutEmailIdentityDkimAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningEnabled(value: Enabled): Self = StObject.set(x, "SigningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningEnabledUndefined: Self = StObject.set(x, "SigningEnabled", js.undefined)
  }
}
