package typings.contentDisposition.mod

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If the filename option is outside ISO-8859-1,
    * then the file name is actually stored in a supplemental field for clients
    * that support Unicode file names and a ISO-8859-1 version of the file name is automatically generated
    * @default true
    */
  var fallback: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Specifies the disposition type.
    * This can also be "inline", or any other value (all values except `inline` are treated like attachment,
    * but can convey additional information if both parties agree to it).
    * The `type` is normalized to lower-case.
    * @default 'attachment'
    */
  var `type`: js.UndefOr[attachment | `inline` | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(fallback: String | Boolean = null, `type`: attachment | `inline` | String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

