package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEmailTemplatesResponse extends js.Object {
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent ListEmailTemplates call to retrieve the next 10 email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[EmailTemplateMetadataList] = js.native
}

object ListEmailTemplatesResponse {
  @scala.inline
  def apply(): ListEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailTemplatesResponse]
  }
  @scala.inline
  implicit class ListEmailTemplatesResponseOps[Self <: ListEmailTemplatesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTemplatesMetadataVarargs(value: EmailTemplateMetadata*): Self = this.set("TemplatesMetadata", js.Array(value :_*))
    @scala.inline
    def setTemplatesMetadata(value: EmailTemplateMetadataList): Self = this.set("TemplatesMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplatesMetadata: Self = this.set("TemplatesMetadata", js.undefined)
  }
  
}

