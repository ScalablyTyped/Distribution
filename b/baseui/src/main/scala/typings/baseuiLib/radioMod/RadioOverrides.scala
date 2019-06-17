package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioOverrides extends js.Object {
  var Description: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Input: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Label: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var RadioMarkInner: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var RadioMarkOuter: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object RadioOverrides {
  @scala.inline
  def apply(
    Description: baseuiLib.Override[_] = null,
    Input: baseuiLib.Override[_] = null,
    Label: baseuiLib.Override[_] = null,
    RadioMarkInner: baseuiLib.Override[_] = null,
    RadioMarkOuter: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null
  ): RadioOverrides = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (RadioMarkInner != null) __obj.updateDynamic("RadioMarkInner")(RadioMarkInner.asInstanceOf[js.Any])
    if (RadioMarkOuter != null) __obj.updateDynamic("RadioMarkOuter")(RadioMarkOuter.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioOverrides]
  }
}

