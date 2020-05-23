package typings.contextjs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSettings extends js.Object {
  var above: js.UndefOr[String | Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var fadeSpeed: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.undefined
  var preventDoubleContext: js.UndefOr[Boolean] = js.undefined
}

object InitSettings {
  @scala.inline
  def apply(
    above: String | Boolean = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    fadeSpeed: js.UndefOr[Double] = js.undefined,
    filter: /* e */ Element => Unit = null,
    preventDoubleContext: js.UndefOr[Boolean] = js.undefined
  ): InitSettings = {
    val __obj = js.Dynamic.literal()
    if (above != null) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeSpeed)) __obj.updateDynamic("fadeSpeed")(fadeSpeed.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(preventDoubleContext)) __obj.updateDynamic("preventDoubleContext")(preventDoubleContext.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSettings]
  }
}

