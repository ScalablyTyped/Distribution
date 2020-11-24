package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEmailIdentityDkimSigningAttributesRequest extends js.Object {
  
  /**
    * The email identity that you want to configure DKIM for.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * An object that contains information about the private key and selector that you want to use to configure DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the identity.
    */
  var SigningAttributes: js.UndefOr[DkimSigningAttributes] = js.native
  
  /**
    * The method that you want to use to configure DKIM for the identity. There are two possible values:    AWS_SES – Configure DKIM for the identity by using Easy DKIM.    EXTERNAL – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).  
    */
  var SigningAttributesOrigin: DkimSigningAttributesOrigin = js.native
}
object PutEmailIdentityDkimSigningAttributesRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity, SigningAttributesOrigin: DkimSigningAttributesOrigin): PutEmailIdentityDkimSigningAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], SigningAttributesOrigin = SigningAttributesOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesRequest]
  }
  
  @scala.inline
  implicit class PutEmailIdentityDkimSigningAttributesRequestOps[Self <: PutEmailIdentityDkimSigningAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = this.set("EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAttributesOrigin(value: DkimSigningAttributesOrigin): Self = this.set("SigningAttributesOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAttributes(value: DkimSigningAttributes): Self = this.set("SigningAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningAttributes: Self = this.set("SigningAttributes", js.undefined)
  }
}
