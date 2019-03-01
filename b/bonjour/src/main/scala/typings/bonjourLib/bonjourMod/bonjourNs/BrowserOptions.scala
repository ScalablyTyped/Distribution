package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserOptions extends js.Object {
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var subtypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var txt: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    protocol: java.lang.String = null,
    subtypes: js.Array[java.lang.String] = null,
    txt: js.Object = null,
    `type`: java.lang.String = null
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes)
    if (txt != null) __obj.updateDynamic("txt")(txt)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BrowserOptions]
  }
}

