package typings.blueprintjsCore.iconMod

import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconProps
  extends IIntentProps
     with IProps {
  /** This component does not support custom children. Use the `icon` prop. */
  var children: js.UndefOr[scala.Nothing] = js.native
  /**
    * Color of icon. This is used as the `fill` attribute on the `<svg>` image
    * so it will override any CSS `color` property, including that set by
    * `intent`. If this prop is omitted, icon color is inherited from
    * surrounding text.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * String for the `title` attribute on the rendered element, which will appear
    * on hover as a native browser tooltip.
    */
  var htmlTitle: js.UndefOr[String] = js.native
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
  var icon: IconName | MaybeElement = js.native
  /**
    * Size of the icon, in pixels. Blueprint contains 16px and 20px SVG icon
    * images, and chooses the appropriate resolution based on this prop.
    * @default Icon.SIZE_STANDARD = 16
    */
  var iconSize: js.UndefOr[Double] = js.native
  /** CSS style properties. */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * HTML tag to use for the rendered element.
    * @default "span"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * Description string. This string does not appear in normal browsers, but
    * it increases accessibility. For instance, screen readers will use it for
    * aural feedback. By default, this is set to the icon's name. Pass an
    * explicit falsy value to disable.
    */
  var title: js.UndefOr[String | `false` | Null] = js.native
}

object IIconProps {
  @scala.inline
  def apply(): IIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconProps]
  }
  @scala.inline
  implicit class IIconPropsOps[Self <: IIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

