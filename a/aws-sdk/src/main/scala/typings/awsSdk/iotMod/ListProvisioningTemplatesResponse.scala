package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningTemplatesResponse extends js.Object {
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of fleet provisioning templates
    */
  var templates: js.UndefOr[ProvisioningTemplateListing] = js.native
}

object ListProvisioningTemplatesResponse {
  @scala.inline
  def apply(): ListProvisioningTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningTemplatesResponse]
  }
  @scala.inline
  implicit class ListProvisioningTemplatesResponseOps[Self <: ListProvisioningTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTemplatesVarargs(value: ProvisioningTemplateSummary*): Self = this.set("templates", js.Array(value :_*))
    @scala.inline
    def setTemplates(value: ProvisioningTemplateListing): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
  
}

