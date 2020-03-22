package typings.bemCn

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<bem-cn.bem-cn.BemSettings> */
trait PartialBemSettings extends js.Object {
  var classMap: js.UndefOr[Record[String, String]] = js.undefined
  var el: js.UndefOr[String] = js.undefined
  var mod: js.UndefOr[String] = js.undefined
  var modValue: js.UndefOr[String] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
}

object PartialBemSettings {
  @scala.inline
  def apply(
    classMap: Record[String, String] = null,
    el: String = null,
    mod: String = null,
    modValue: String = null,
    ns: String = null
  ): PartialBemSettings = {
    val __obj = js.Dynamic.literal()
    if (classMap != null) __obj.updateDynamic("classMap")(classMap.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (mod != null) __obj.updateDynamic("mod")(mod.asInstanceOf[js.Any])
    if (modValue != null) __obj.updateDynamic("modValue")(modValue.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBemSettings]
  }
}

