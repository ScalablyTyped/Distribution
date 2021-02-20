package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialITagInputProps
import typings.blueprintjsCore.anon.PartialITagInputState
import typings.blueprintjsCore.anon.ReadonlyITagInputProps
import typings.blueprintjsCore.anon.ReadonlyITagInputState
import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
  @js.native
  class TagInput protected ()
    extends AbstractPureComponent2[ITagInputProps, ITagInputState, js.Object] {
    def this(props: ITagInputProps) = this()
    def this(props: ITagInputProps, context: js.Any) = this()
    
    var addTags: js.Any = js.native
    
    var findNextIndex: js.Any = js.native
    
    var getNextActiveIndex: js.Any = js.native
    
    /**
      * Splits inputValue on separator prop,
      * trims whitespace from each new value,
      * and ignores empty values.
      */
    var getValues: js.Any = js.native
    
    var handleBackspaceToRemove: js.Any = js.native
    
    var handleContainerBlur: js.Any = js.native
    
    var handleContainerClick: js.Any = js.native
    
    var handleDeleteToRemove: js.Any = js.native
    
    var handleInputChange: js.Any = js.native
    
    var handleInputFocus: js.Any = js.native
    
    var handleInputKeyDown: js.Any = js.native
    
    var handleInputKeyUp: js.Any = js.native
    
    var handleInputPaste: js.Any = js.native
    
    var handleRemoveTag: js.Any = js.native
    
    var inputElement: js.Any = js.native
    
    var invokeKeyPressCallback: js.Any = js.native
    
    /** Returns whether the given index represents a valid item in `this.props.values`. */
    var isValidIndex: js.Any = js.native
    
    var maybeRenderTag: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    /** Remove the item at the given index by invoking `onRemove` and `onChange` accordingly. */
    var removeIndexFromValues: js.Any = js.native
  }
  /* static members */
  object TagInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput.defaultProps")
    @js.native
    def defaultProps: PartialITagInputProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialITagInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ReadonlyITagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = js.native
  }
  
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
    implicit class ITagInputPropsMutableBuilder[Self <: ITagInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      @scala.inline
      def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* input */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setLeftIcon(value: IconName | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      @scala.inline
      def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      @scala.inline
      def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[ReactNode] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnRemove(value: (/* value */ ReactNode, /* index */ Double) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTagProps(value: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPropsFunction2(value: (/* value */ ReactNode, /* index */ Double) => ITagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[ReactNode]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: ReactNode*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITagInputState extends StObject {
    
    var activeIndex: Double = js.native
    
    var inputValue: String = js.native
    
    var isInputFocused: Boolean = js.native
    
    var prevInputValueProp: js.UndefOr[String] = js.native
  }
  object ITagInputState {
    
    @scala.inline
    def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ITagInputState = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagInputState]
    }
    
    @scala.inline
    implicit class ITagInputStateMutableBuilder[Self <: ITagInputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.default
    - typings.blueprintjsCore.blueprintjsCoreStrings.blur
    - typings.blueprintjsCore.blueprintjsCoreStrings.paste
  */
  trait TagInputAddMethod extends StObject
  object TagInputAddMethod {
    
    @scala.inline
    def default: typings.blueprintjsCore.blueprintjsCoreStrings.default = "default".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.default]
    
    @scala.inline
    def blur: typings.blueprintjsCore.blueprintjsCoreStrings.blur = "blur".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.blur]
    
    @scala.inline
    def paste: typings.blueprintjsCore.blueprintjsCoreStrings.paste = "paste".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.paste]
  }
}
