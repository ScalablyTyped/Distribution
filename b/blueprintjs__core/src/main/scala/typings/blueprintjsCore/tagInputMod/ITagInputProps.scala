package typings.blueprintjsCore.tagInputMod

import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.tagMod.ITagProps
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagInputProps
  extends IIntentProps
     with IProps {
  
  /**
    * If true, `onAdd` will be invoked when the input loses focus.
    * Otherwise, `onAdd` is only invoked when `enter` is pressed.
    * @default false
    */
  var addOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, `onAdd` will be invoked when the user pastes text containing the `separator`
    * into the input. Otherwise, pasted text will remain in the input.
    *
    * __Note:__ For example, if `addOnPaste=true` and `separator="\n"` (new line), then:
    * - Pasting `"hello"` will _not_ invoke `onAdd`
    * - Pasting `"hello\n"` will invoke `onAdd` with `["hello"]`
    * - Pasting `"hello\nworld"` will invoke `onAdd` with `["hello", "world"]`
    *
    * @default true
    */
  var addOnPaste: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component is non-interactive.
    * Note that you'll also need to disable the component's `rightElement`,
    * if appropriate.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Whether the tag input should take up the full width of its container. */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * React props to pass to the `<input>` element.
    * Note that `ref` and `key` are not supported here; use `inputRef` below.
    */
  var inputProps: js.UndefOr[HTMLInputProps] = js.native
  
  /** Ref handler for the `<input>` element. */
  var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.native
  
  /** Controlled value of the `<input>` element. This is shorthand for `inputProps={{ value }}`. */
  var inputValue: js.UndefOr[String] = js.native
  
  /** Whether the tag input should use a large size. */
  var large: js.UndefOr[Boolean] = js.native
  
  /** Name of a Blueprint UI icon (or an icon element) to render on the left side of the input. */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /**
    * Callback invoked when new tags are added by the user pressing `enter` on the input.
    * Receives the current value of the input field split by `separator` into an array.
    * New tags are expected to be appended to the list.
    *
    * The input will be cleared after `onAdd` is invoked _unless_ the callback explicitly
    * returns `false`. This is useful if the provided `value` is somehow invalid and should
    * not be added as a tag.
    */
  var onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.native
  
  /**
    * Callback invoked when new tags are added or removed. Receives the updated list of `values`:
    * new tags are appended to the end of the list, removed tags are removed at their index.
    *
    * Like `onAdd`, the input will be cleared after this handler is invoked _unless_ the callback
    * explicitly returns `false`.
    *
    * This callback essentially implements basic `onAdd` and `onRemove` functionality and merges
    * the two handlers into one to simplify controlled usage.
    * ```
    */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.native
  
  /**
    * Callback invoked when the value of `<input>` element is changed.
    * This is shorthand for `inputProps={{ onChange }}`.
    */
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  /**
    * Callback invoked when the user depresses a keyboard key.
    * Receives the event and the index of the active tag (or `undefined` if
    * focused in the input).
    */
  var onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /**
    * Callback invoked when the user releases a keyboard key.
    * Receives the event and the index of the active tag (or `undefined` if
    * focused in the input).
    */
  var onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /**
    * Callback invoked when the user clicks the X button on a tag.
    * Receives value and index of removed tag.
    */
  var onRemove: js.UndefOr[js.Function2[/* value */ ReactNode, /* index */ Double, Unit]] = js.native
  
  /**
    * Input placeholder text which will not appear if `values` contains any items
    * (consistent with default HTML input behavior).
    * Use `inputProps.placeholder` if you want the placeholder text to _always_ appear.
    *
    * If you define both `placeholder` and `inputProps.placeholder`, then the former will appear
    * when `values` is empty and the latter at all other times.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Element to render on right side of input.
    * For best results, use a small spinner or minimal button (button height will adjust if `TagInput` uses large styles).
    * Other elements will likely require custom styles for correct positioning.
    */
  var rightElement: js.UndefOr[Element] = js.native
  
  /**
    * Separator pattern used to split input text into multiple values. Default value splits on commas and newlines.
    * Explicit `false` value disables splitting (note that `onAdd` will still receive an array of length 1).
    * @default /[,\n\r]/
    */
  var separator: js.UndefOr[String | RegExp | `false`] = js.native
  
  /**
    * React props to pass to each `Tag`. Provide an object to pass the same props to every tag,
    * or a function to customize props per tag.
    *
    * If you define `onRemove` here then you will have to implement your own tag removal
    * handling as `TagInput`'s own `onRemove` handler will never be invoked.
    */
  var tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])] = js.native
  
  /**
    * Controlled tag values. Each value will be rendered inside a `Tag`, which can be customized
    * using `tagProps`. Therefore, any valid React node can be used as a `TagInput` value; falsy
    * values will not be rendered.
    *
    * __Note about typed usage:__ If you know your `values` will always be of a certain `ReactNode`
    * subtype, such as `string` or `ReactChild`, you can use that type on all your handlers
    * to simplify type logic.
    */
  var values: js.Array[ReactNode] = js.native
}
object ITagInputProps {
  
  @scala.inline
  def apply(values: js.Array[ReactNode]): ITagInputProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagInputProps]
  }
  
  @scala.inline
  implicit class ITagInputPropsOps[Self <: ITagInputProps] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: ReactNode*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ReactNode]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = this.set("addOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnBlur: Self = this.set("addOnBlur", js.undefined)
    
    @scala.inline
    def setAddOnPaste(value: Boolean): Self = this.set("addOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnPaste: Self = this.set("addOnPaste", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setInputProps(value: HTMLInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* input */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: IconName | MaybeElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
    @scala.inline
    def setLeftIconNull: Self = this.set("leftIcon", null)
    
    @scala.inline
    def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = this.set("onAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* values */ js.Array[ReactNode] => Boolean | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* value */ ReactNode, /* index */ Double) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRightElement(value: Element): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | RegExp | `false`): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTagPropsFunction2(value: (/* value */ ReactNode, /* index */ Double) => ITagProps): Self = this.set("tagProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTagProps(value: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])): Self = this.set("tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagProps: Self = this.set("tagProps", js.undefined)
  }
}
