package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSpecimenProps extends js.Object {
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object CodeSpecimenProps {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined
  ): CodeSpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[CodeSpecimenProps]
  }
}

