package typings
package contextjsLib.contextjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSettings extends js.Object {
  var above: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var fadeSpeed: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* e */ stdLib.Element, scala.Unit]] = js.undefined
  var preventDoubleContext: js.UndefOr[scala.Boolean] = js.undefined
}

object InitSettings {
  @scala.inline
  def apply(
    above: java.lang.String | scala.Boolean = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    fadeSpeed: scala.Int | scala.Double = null,
    filter: /* e */ stdLib.Element => scala.Unit = null,
    preventDoubleContext: js.UndefOr[scala.Boolean] = js.undefined
  ): InitSettings = {
    val __obj = js.Dynamic.literal()
    if (above != null) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (fadeSpeed != null) __obj.updateDynamic("fadeSpeed")(fadeSpeed.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(preventDoubleContext)) __obj.updateDynamic("preventDoubleContext")(preventDoubleContext)
    __obj.asInstanceOf[InitSettings]
  }
}

