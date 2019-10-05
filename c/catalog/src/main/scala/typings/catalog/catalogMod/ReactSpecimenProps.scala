package typings.catalog.catalogMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSpecimenProps extends js.Object {
  var children: ReactNode | String
  var dark: js.UndefOr[Boolean] = js.undefined
  var frame: js.UndefOr[Boolean] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  var noSource: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  var showSource: js.UndefOr[Boolean] = js.undefined
  var sourceText: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
}

object ReactSpecimenProps {
  @scala.inline
  def apply(
    children: ReactNode | String = null,
    dark: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    noSource: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    responsive: Boolean | String | js.Array[String] = null,
    showSource: js.UndefOr[Boolean] = js.undefined,
    sourceText: String = null,
    state: js.Any = null
  ): ReactSpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSource)) __obj.updateDynamic("showSource")(showSource)
    if (sourceText != null) __obj.updateDynamic("sourceText")(sourceText)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ReactSpecimenProps]
  }
}

