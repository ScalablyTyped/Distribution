package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.carbonIconHelpersStrings.`false`
import typings.carbonIconHelpers.carbonIconHelpersStrings.`true`
import typings.carbonIconHelpers.carbonIconHelpersStrings.`xMidYMid meet`
import typings.carbonIconHelpers.carbonIconHelpersStrings.img
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait IconAttributes extends js.Object {
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var focusable: js.UndefOr[`true` | `false`] = js.undefined
  var height: IconSize
  var id: js.UndefOr[String] = js.undefined
  var preserveAspectRatio: js.UndefOr[String | (`xMidYMid meet`)] = js.undefined
  var role: js.UndefOr[img] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var tabindex: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var width: IconSize
}

object IconAttributes {
  @scala.inline
  def apply(
    height: IconSize,
    width: IconSize,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `class`: String = null,
    focusable: `true` | `false` = null,
    id: String = null,
    preserveAspectRatio: String | (`xMidYMid meet`) = null,
    role: img = null,
    style: String = null,
    tabindex: String = null,
    title: String = null,
    viewBox: String = null
  ): IconAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconAttributes]
  }
}

