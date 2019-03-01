package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackName extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CallbackName {
  @scala.inline
  def apply(
    callback: js.Function = null,
    name: java.lang.String = null,
    selected: scala.Int | scala.Double = null
  ): Anon_CallbackName = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackName]
  }
}

