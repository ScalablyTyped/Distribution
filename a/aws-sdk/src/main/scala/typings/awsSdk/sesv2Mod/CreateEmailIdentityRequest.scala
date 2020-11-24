package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEmailIdentityRequest extends js.Object {
  
  /**
    * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, as opposed to the default method, Easy DKIM. You can only specify this object if the email identity is a domain, as opposed to an address.
    */
  var DkimSigningAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.DkimSigningAttributes] = js.native
  
  /**
    * The email address or domain that you want to verify.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateEmailIdentityRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
  
  @scala.inline
  implicit class CreateEmailIdentityRequestOps[Self <: CreateEmailIdentityRequest] (val x: Self) extends AnyVal {
    
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
    def setDkimSigningAttributes(value: DkimSigningAttributes): Self = this.set("DkimSigningAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimSigningAttributes: Self = this.set("DkimSigningAttributes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
