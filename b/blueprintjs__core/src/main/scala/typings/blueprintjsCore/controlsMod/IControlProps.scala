package typings.blueprintjsCore.controlsMod

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IControlProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * Alignment of the indicator within container.
    * @default Alignment.LEFT
    */
  var alignIndicator: js.UndefOr[Alignment] = js.native
  /** Whether the control should appear as an inline element. */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
  /**
    * Text label for the control.
    *
    * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
    * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * JSX Element label for the control.
    *
    * This prop is a workaround for TypeScript consumers as the type definition for `label` only
    * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
    */
  var labelElement: js.UndefOr[ReactNode] = js.native
  /** Whether this control should use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Name of the HTML tag that wraps the checkbox.
    *
    * By default a `<label>` is used, which effectively enlarges the click
    * target to include all of its children. Supply a different tag name if
    * this behavior is undesirable or you're listening to click events from a
    * parent element (as the label can register duplicate clicks).
    *
    * @default "label"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IControlProps {
  @scala.inline
  def apply(): IControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlProps]
  }
  @scala.inline
  implicit class IControlPropsOps[Self <: IControlProps] (val x: Self) extends AnyVal {
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
    def setAlignIndicator(value: Alignment): Self = this.set("alignIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignIndicator: Self = this.set("alignIndicator", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelElement(value: ReactNode): Self = this.set("labelElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelElement: Self = this.set("labelElement", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

