package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesResponse extends js.Object {
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.native
}

object ListTemplatesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TemplatesMetadata: TemplateMetadataList = null): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TemplatesMetadata != null) __obj.updateDynamic("TemplatesMetadata")(TemplatesMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
}

