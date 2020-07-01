package typings.blueprintjsCore.iconMod

import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconProps
  extends IIntentProps
     with IProps {
  /**
    * Color of icon. This is used as the `fill` attribute on the `<svg>` image
    * so it will override any CSS `color` property, including that set by
    * `intent`. If this prop is omitted, icon color is inherited from
    * surrounding text.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * String for the `title` attribute on the rendered element, which will appear
    * on hover as a native browser tooltip.
    */
  var htmlTitle: js.UndefOr[String] = js.undefined
  /**
    * Name of a Blueprint UI icon, or an icon element, to render. This prop is
    * required because it determines the content of the component, but it can
    * be explicitly set to falsy values to render nothing.
    *
    * - If `null` or `undefined` or `false`, this component will render nothing.
    * - If given an `IconName` (a string literal union of all icon names), that
    *   icon will be rendered as an `<svg>` with `<path>` tags. Unknown strings
    *   will render a blank icon to occupy space.
    * - If given a `JSX.Element`, that element will be rendered and _all other
    *   props on this component are ignored._ This type is supported to
    *   simplify icon support in other Blueprint components. As a consumer, you
    *   should avoid using `<Icon icon={<Element />}` directly; simply render
    *   `<Element />` instead.
    */
  var icon: IconName | MaybeElement
  /**
    * Size of the icon, in pixels. Blueprint contains 16px and 20px SVG icon
    * images, and chooses the appropriate resolution based on this prop.
    * @default Icon.SIZE_STANDARD = 16
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  /** CSS style properties. */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * HTML tag to use for the rendered element.
    * @default "span"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  /**
    * Description string. This string does not appear in normal browsers, but
    * it increases accessibility. For instance, screen readers will use it for
    * aural feedback. By default, this is set to the icon's name. Pass an
    * explicit falsy value to disable.
    */
  var title: js.UndefOr[String | `false` | Null] = js.undefined
}

object IIconProps {
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
    title: js.UndefOr[Null | String | `false`] = js.undefined
  ): IIconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconProps]
  }
}

