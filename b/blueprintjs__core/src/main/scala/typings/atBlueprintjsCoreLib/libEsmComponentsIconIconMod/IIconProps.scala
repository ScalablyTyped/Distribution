package typings
package atBlueprintjsCoreLib.libEsmComponentsIconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** This component does not support custom children. Use the `icon` prop. */
  var children: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Color of icon. This is used as the `fill` attribute on the `<svg>` image
    * so it will override any CSS `color` property, including that set by
    * `intent`. If this prop is omitted, icon color is inherited from
    * surrounding text.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String for the `title` attribute on the rendered element, which will appear
    * on hover as a native browser tooltip.
    */
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of a Blueprint UI icon, or an icon element, to render. This prop is
    * required because it determines the content of the component, but it can
    * be explicitly set to falsy values to render nothing.
    *
    * - If `null` or `undefined` or `false`, this component will render
    *   nothing.
    * - If given an `IconName` (a string literal union of all icon names), that
    *   icon will be rendered as an `<svg>` with `<path>` tags. Unknown strings
    *   will render a blank icon to occupy space.
    * - If given a `JSX.Element`, that element will be rendered and _all other
    *   props on this component are ignored._ This type is supported to
    *   simplify icon support in other Blueprint components. As a consumer, you
    *   should avoid using `<Icon icon={<Element />}` directly; simply render
    *   `<Element />` instead.
    */
  var icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  /**
    * Size of the icon, in pixels. Blueprint contains 16px and 20px SVG icon
    * images, and chooses the appropriate resolution based on this prop.
    * @default Icon.SIZE_STANDARD = 16
    */
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  /** CSS style properties. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * HTML tag to use for the rendered element.
    * @default "span"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
  /**
    * Description string. This string does not appear in normal browsers, but
    * it increases accessibility. For instance, screen readers will use it for
    * aural feedback. By default, this is set to the icon's name. Pass an
    * explicit falsy value to disable.
    */
  var title: js.UndefOr[
    java.lang.String | atBlueprintjsCoreLib.atBlueprintjsCoreLibNumbers.`false` | scala.Null
  ] = js.undefined
}

object IIconProps {
  @scala.inline
  def apply(
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement,
    children: js.UndefOr[scala.Nothing] = js.undefined,
    className: java.lang.String = null,
    color: java.lang.String = null,
    htmlTitle: java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null,
    title: java.lang.String | atBlueprintjsCoreLib.atBlueprintjsCoreLibNumbers.`false` = null
  ): IIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconProps]
  }
}

