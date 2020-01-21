package typings.bemCn.mod

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
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], modValue = modValue.asInstanceOf[js.Any])
    if (classMap != null) __obj.updateDynamic("classMap")(classMap.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemSettings]
  }
}

