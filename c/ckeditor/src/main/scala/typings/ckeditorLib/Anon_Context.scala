package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[java.lang.String] = js.undefined
  var enterMode: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[ckeditorLib.CKEDITORNs.filter] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: java.lang.String = null,
    enterMode: scala.Int | scala.Double = null,
    filter: ckeditorLib.CKEDITORNs.filter = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (enterMode != null) __obj.updateDynamic("enterMode")(enterMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_Context]
  }
}

