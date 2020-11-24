package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEmailIdentityDkimAttributesRequest extends js.Object {
  
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that are sent from the identity are signed using DKIM. If you set this value to false, your messages are sent without DKIM signing.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
}
object PutEmailIdentityDkimAttributesRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
  
  @scala.inline
  implicit class PutEmailIdentityDkimAttributesRequestOps[Self <: PutEmailIdentityDkimAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setSigningEnabled(value: Enabled): Self = this.set("SigningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningEnabled: Self = this.set("SigningEnabled", js.undefined)
  }
}
