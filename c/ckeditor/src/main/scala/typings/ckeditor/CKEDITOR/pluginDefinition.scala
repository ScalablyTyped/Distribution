package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.undefined
  var lang: js.UndefOr[String | js.Array[String]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var requires: js.UndefOr[String | js.Array[String]] = js.undefined
}

object pluginDefinition {
  @scala.inline
  def apply(
    afterInit: /* editor */ editor => _ = null,
    beforeInit: /* editor */ editor => _ = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    init: /* editor */ editor => Unit = null,
    lang: String | js.Array[String] = null,
    onLoad: () => _ = null,
    requires: String | js.Array[String] = null
  ): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction1(afterInit))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction1(beforeInit))
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluginDefinition]
  }
}

