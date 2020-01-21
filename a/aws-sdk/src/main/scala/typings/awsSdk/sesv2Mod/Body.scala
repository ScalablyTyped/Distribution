package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  /**
    * An object that represents the version of the message that is displayed in email clients that support HTML. HTML messages can include formatted text, hyperlinks, images, and more. 
    */
  var Html: js.UndefOr[Content] = js.native
  /**
    * An object that represents the version of the message that is displayed in email clients that don't support HTML, or clients where the recipient has disabled HTML rendering.
    */
  var Text: js.UndefOr[Content] = js.native
}

object Body {
  @scala.inline
  def apply(Html: Content = null, Text: Content = null): Body = {
    val __obj = js.Dynamic.literal()
    if (Html != null) __obj.updateDynamic("Html")(Html.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

