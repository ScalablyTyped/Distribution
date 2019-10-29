package typings.bemDashCn.bemDashCnMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BemSettings extends js.Object {
  var classMap: js.UndefOr[Record[String, String]] = js.undefined
  var el: String
  var mod: String
  var modValue: String
  var ns: js.UndefOr[String] = js.undefined
}

object BemSettings {
  @scala.inline
  def apply(
    el: String,
    mod: String,
    modValue: String,
    classMap: Record[String, String] = null,
    ns: String = null
  ): BemSettings = {
    val __obj = js.Dynamic.literal(el = el, mod = mod, modValue = modValue)
    if (classMap != null) __obj.updateDynamic("classMap")(classMap)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    __obj.asInstanceOf[BemSettings]
  }
}

