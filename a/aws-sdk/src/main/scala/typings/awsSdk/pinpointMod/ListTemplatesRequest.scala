package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesRequest extends js.Object {
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is currently not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported for application, campaign, and journey metrics.
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
  def apply(
    NextToken: string = null,
    PageSize: string = null,
    Prefix: string = null,
    TemplateType: string = null
  ): ListTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (TemplateType != null) __obj.updateDynamic("TemplateType")(TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesRequest]
  }
}

