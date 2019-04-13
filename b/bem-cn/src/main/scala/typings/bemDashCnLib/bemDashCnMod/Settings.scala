package typings
package bemDashCnLib.bemDashCnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var classMap: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var el: js.UndefOr[java.lang.String] = js.undefined
  var mod: js.UndefOr[java.lang.String] = js.undefined
  var modValue: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    classMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    el: java.lang.String = null,
    mod: java.lang.String = null,
    modValue: java.lang.String = null,
    ns: java.lang.String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (classMap != null) __obj.updateDynamic("classMap")(classMap)
    if (el != null) __obj.updateDynamic("el")(el)
    if (mod != null) __obj.updateDynamic("mod")(mod)
    if (modValue != null) __obj.updateDynamic("modValue")(modValue)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    __obj.asInstanceOf[Settings]
  }
}

