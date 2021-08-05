package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityDkimSigningAttributesRequest extends StObject {
  
  /**
    * The email identity that you want to configure DKIM for.
    */
  var EmailIdentity: Identity
  
  /**
    * An object that contains information about the private key and selector that you want to use to configure DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the identity.
    */
  var SigningAttributes: js.UndefOr[DkimSigningAttributes] = js.undefined
  
  /**
    * The method that you want to use to configure DKIM for the identity. There are two possible values:    AWS_SES – Configure DKIM for the identity by using Easy DKIM.    EXTERNAL – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).  
    */
  var SigningAttributesOrigin: DkimSigningAttributesOrigin
}
object PutEmailIdentityDkimSigningAttributesRequest {
  
  inline def apply(EmailIdentity: Identity, SigningAttributesOrigin: DkimSigningAttributesOrigin): PutEmailIdentityDkimSigningAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], SigningAttributesOrigin = SigningAttributesOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesRequest]
  }
  
  extension [Self <: PutEmailIdentityDkimSigningAttributesRequest](x: Self) {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    inline def setSigningAttributes(value: DkimSigningAttributes): Self = StObject.set(x, "SigningAttributes", value.asInstanceOf[js.Any])
    
    inline def setSigningAttributesOrigin(value: DkimSigningAttributesOrigin): Self = StObject.set(x, "SigningAttributesOrigin", value.asInstanceOf[js.Any])
    
    inline def setSigningAttributesUndefined: Self = StObject.set(x, "SigningAttributes", js.undefined)
  }
}
