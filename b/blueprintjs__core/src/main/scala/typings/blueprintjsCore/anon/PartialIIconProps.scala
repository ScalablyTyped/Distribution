package typings.blueprintjsCore.anon

import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/icon/icon.IIconProps> */
trait PartialIIconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var htmlTitle: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  var title: js.UndefOr[String | `false`] = js.undefined
}

object PartialIIconProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    htmlTitle: String = null,
    icon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    iconSize: js.UndefOr[Double] = js.undefined,
    intent: Intent = null,
    style: CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    title: String | `false` = null
  ): PartialIIconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIIconProps]
  }
}

