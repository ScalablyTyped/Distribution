package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesRequest extends js.Object {
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  /**
    * The substring to match in the names of the message templates to include in the results. If you specify this value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
    */
  var Prefix: js.UndefOr[string] = js.native
  /**
    * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include all types of templates in the results, don't include this parameter in your request.
    */
  var TemplateType: js.UndefOr[string] = js.native
}

object ListTemplatesRequest {
  @scala.inline
  def apply(): ListTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesRequest]
  }
  @scala.inline
  implicit class ListTemplatesRequestOps[Self <: ListTemplatesRequest] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPageSize(value: string): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setPrefix(value: string): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setTemplateType(value: string): Self = this.set("TemplateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateType: Self = this.set("TemplateType", js.undefined)
  }
  
}

