package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSpecimenProps extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
}

object CodeSpecimenProps {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    raw: js.UndefOr[Boolean] = js.undefined
  ): CodeSpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSpecimenProps]
  }
}

