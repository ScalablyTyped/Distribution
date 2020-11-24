package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
  
  /**
    * A list of the custom verification email templates that exist in your account.
    */
  var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplatesList] = js.native
  
  /**
    * A token indicating that there are additional custom verification email templates available to be listed. Pass this token to a subsequent call to ListCustomVerificationEmailTemplates to retrieve the next 50 custom verification email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListCustomVerificationEmailTemplatesResponse {
  
  @scala.inline
  def apply(): ListCustomVerificationEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListCustomVerificationEmailTemplatesResponseOps[Self <: ListCustomVerificationEmailTemplatesResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomVerificationEmailTemplatesVarargs(value: CustomVerificationEmailTemplateMetadata*): Self = this.set("CustomVerificationEmailTemplates", js.Array(value :_*))
    
    @scala.inline
    def setCustomVerificationEmailTemplates(value: CustomVerificationEmailTemplatesList): Self = this.set("CustomVerificationEmailTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomVerificationEmailTemplates: Self = this.set("CustomVerificationEmailTemplates", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
