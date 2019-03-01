package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* editor */ editor, scala.Unit]] = js.undefined
  var lang: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var requires: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object pluginDefinition {
  @scala.inline
  def apply(
    afterInit: js.Function1[/* editor */ editor, _] = null,
    beforeInit: js.Function1[/* editor */ editor, _] = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    init: js.Function1[/* editor */ editor, scala.Unit] = null,
    lang: java.lang.String | js.Array[java.lang.String] = null,
    onLoad: js.Function0[_] = null,
    requires: java.lang.String | js.Array[java.lang.String] = null
  ): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (init != null) __obj.updateDynamic("init")(init)
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluginDefinition]
  }
}

