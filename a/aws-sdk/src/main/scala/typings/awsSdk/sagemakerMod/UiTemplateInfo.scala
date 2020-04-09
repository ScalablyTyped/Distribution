package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTemplateInfo extends js.Object {
  /**
    * The SHA-256 digest of the contents of the template.
    */
  var ContentSha256: js.UndefOr[TemplateContentSha256] = js.native
  /**
    * The URL for the user interface template.
    */
  var Url: js.UndefOr[TemplateUrl] = js.native
}

object UiTemplateInfo {
  @scala.inline
  def apply(ContentSha256: TemplateContentSha256 = null, Url: TemplateUrl = null): UiTemplateInfo = {
    val __obj = js.Dynamic.literal()
    if (ContentSha256 != null) __obj.updateDynamic("ContentSha256")(ContentSha256.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTemplateInfo]
  }
}

