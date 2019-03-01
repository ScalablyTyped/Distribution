package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait buttonDefinition extends js.Object {
  var command: java.lang.String
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconOffset: js.UndefOr[scala.Double] = js.undefined
  var label: java.lang.String
  var toolbar: java.lang.String
}

object buttonDefinition {
  @scala.inline
  def apply(
    command: java.lang.String,
    label: java.lang.String,
    toolbar: java.lang.String,
    icon: java.lang.String = null,
    iconOffset: scala.Int | scala.Double = null
  ): buttonDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("toolbar")(toolbar)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[buttonDefinition]
  }
}

