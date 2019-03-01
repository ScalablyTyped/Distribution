package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackSelected extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var selected: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CallbackSelected {
  @scala.inline
  def apply(callback: js.Function = null, selected: scala.Int | scala.Double = null): Anon_CallbackSelected = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackSelected]
  }
}

