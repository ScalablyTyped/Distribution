package typings.bonjour.bonjourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserOptions extends js.Object {
  var protocol: js.UndefOr[String] = js.undefined
  var subtypes: js.UndefOr[js.Array[String]] = js.undefined
  var txt: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    protocol: String = null,
    subtypes: js.Array[String] = null,
    txt: js.Object = null,
    `type`: String = null
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes.asInstanceOf[js.Any])
    if (txt != null) __obj.updateDynamic("txt")(txt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserOptions]
  }
}

