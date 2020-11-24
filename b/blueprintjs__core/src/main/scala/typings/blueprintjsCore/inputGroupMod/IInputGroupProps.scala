package typings.blueprintjsCore.inputGroupMod

import typings.blueprintjsCore.propsMod.IControlledProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputGroupProps
  extends IControlledProps
     with IIntentProps
     with IProps {
  
  /**
    * Set this to `true` if you will be controlling the `value` of this input with asynchronous updates.
    * These may occur if you do not immediately call setState in a parent component with the value from
    * the `onChange` handler, or if working with certain libraries like __redux-form__.
    * @default false
    */
  var asyncControl: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the input is non-interactive.
    * Note that `rightElement` must be disabled separately; this prop will not affect it.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /** Ref handler or a ref object that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[IRef[HTMLInputElement]] = js.native
  
  /** Whether this input should use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  
  /**
    * Element to render on the left side of input.  This prop is mutually exclusive
    * with `leftIcon`.
    */
  var leftElement: js.UndefOr[Element] = js.native
  
  /**
    * Name of a Blueprint UI icon to render on the left side of the input group,
    * before the user's cursor.  This prop is mutually exclusive with `leftElement`.
    * Usage with content is deprecated.  Use `leftElement` for elements.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /** Placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[Element] = js.native
  
  /** Whether the input (and any buttons) should appear with rounded caps. */
  var round: js.UndefOr[Boolean] = js.native
  
  /** Whether this input should use small styles. */
  var small: js.UndefOr[Boolean] = js.native
  
  /**
    * HTML `input` type attribute.
    * @default "text"
    */
  var `type`: js.UndefOr[String] = js.native
}
object IInputGroupProps {
  
  @scala.inline
  def apply(): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputGroupProps]
  }
  
  @scala.inline
  implicit class IInputGroupPropsOps[Self <: IInputGroupProps] (val x: Self) extends AnyVal {
    
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
    def setAsyncControl(value: Boolean): Self = this.set("asyncControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncControl: Self = this.set("asyncControl", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setInputRefFunction1(value: /* ref */ HTMLInputElement | Null => js.Any): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRef(value: IRef[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setLeftElement(value: Element): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: IconName | MaybeElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
    @scala.inline
    def setLeftIconNull: Self = this.set("leftIcon", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRightElement(value: Element): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
