package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialITagInputState
import typings.blueprintjsCore.anon.PartialTagInputProps
import typings.blueprintjsCore.anon.ReadonlyITagInputState
import typings.blueprintjsCore.anon.ReadonlyTagInputProps
import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.blueprintjsCore.libEsmComponentsTagTagMod.TagProps
import typings.blueprintjsIcons.libEsmGeneratedIcons16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTagInputTagInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
  @js.native
  open class TagInput protected ()
    extends AbstractPureComponent2[TagInputProps, ITagInputState, js.Object] {
    def this(props: TagInputProps) = this()
    def this(props: TagInputProps, context: Any) = this()
    
    /* private */ var addTags: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTagInput(prevProps: TagInputProps): Unit = js.native
    
    /* private */ var findNextIndex: Any = js.native
    
    /* private */ var getNextActiveIndex: Any = js.native
    
    /**
      * Splits inputValue on separator prop,
      * trims whitespace from each new value,
      * and ignores empty values.
      */
    /* private */ var getValues: Any = js.native
    
    /* private */ var handleBackspaceToRemove: Any = js.native
    
    /* private */ var handleContainerBlur: Any = js.native
    
    /* private */ var handleContainerClick: Any = js.native
    
    /* private */ var handleDeleteToRemove: Any = js.native
    
    /* private */ var handleInputChange: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputKeyDown: Any = js.native
    
    /* private */ var handleInputKeyUp: Any = js.native
    
    /* private */ var handleInputPaste: Any = js.native
    
    /* private */ var handleRef: Any = js.native
    
    /* private */ var handleRemoveTag: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var invokeKeyPressCallback: Any = js.native
    
    /** Returns whether the given index represents a valid item in `this.props.values`. */
    /* private */ var isValidIndex: Any = js.native
    
    /* private */ var maybeRenderTag: Any = js.native
    
    /** Remove the item at the given index by invoking `onRemove` and `onChange` accordingly. */
    /* private */ var removeIndexFromValues: Any = js.native
  }
  /* static members */
  object TagInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput.defaultProps")
    @js.native
    def defaultProps: PartialTagInputProps = js.native
    inline def defaultProps_=(x: PartialTagInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ReadonlyTagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialITagInputState | Null]
  }
  
  trait ITagInputProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /**
      * If true, `onAdd` will be invoked when the input loses focus.
      * Otherwise, `onAdd` is only invoked when `enter` is pressed.
      *
      * @default false
      */
    var addOnBlur: js.UndefOr[Boolean] = js.undefined
    
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
    var addOnPaste: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the component should automatically resize as a user types in the text input.
      * This will have no effect when `fill={true}`.
      *
      * @default false
      */
    var autoResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional child elements which will be rendered between the selected tags and
      * the text input. Rendering children is usually unnecessary.
      *
      * @default undefined
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the component is non-interactive.
      * Note that you'll also need to disable the component's `rightElement`,
      * if appropriate.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the tag input should take up the full width of its container. */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * React props to pass to the `<input>` element.
      * Note that `ref` and `key` are not supported here; use `inputRef` below.
      * Also note that `inputProps.style.width` will be overriden if `autoResize={true}`.
      */
    var inputProps: js.UndefOr[HTMLInputProps] = js.undefined
    
    /** Ref handler for the `<input>` element. */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /** Controlled value of the `<input>` element. This is shorthand for `inputProps={{ value }}`. */
    var inputValue: js.UndefOr[String] = js.undefined
    
    /** Whether the tag input should use a large size. */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /** Name of a Blueprint UI icon (or an icon element) to render on the left side of the input. */
    var leftIcon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
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
      ] = js.undefined
    
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
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.undefined
    
    /**
      * Callback invoked when the value of `<input>` element is changed.
      * This is shorthand for `inputProps={{ onChange }}`.
      */
    var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Callback invoked when the user depresses a keyboard key.
      * Receives the event and the index of the active tag (or `undefined` if
      * focused in the input).
      */
    var onKeyDown: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /**
      * Callback invoked when the user releases a keyboard key.
      * Receives the event and the index of the active tag (or `undefined` if
      * focused in the input).
      */
    var onKeyUp: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /**
      * Callback invoked when the user clicks the X button on a tag.
      * Receives value and index of removed tag.
      */
    var onRemove: js.UndefOr[js.Function2[/* value */ ReactNode, /* index */ Double, Unit]] = js.undefined
    
    /**
      * Input placeholder text which will not appear if `values` contains any items
      * (consistent with default HTML input behavior).
      * Use `inputProps.placeholder` if you want the placeholder text to _always_ appear.
      *
      * If you define both `placeholder` and `inputProps.placeholder`, then the former will appear
      * when `values` is empty and the latter at all other times.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Element to render on right side of input.
      * For best results, use a small spinner or minimal button (button height will adjust if `TagInput` uses large styles).
      * Other elements will likely require custom styles for correct positioning.
      */
    var rightElement: js.UndefOr[Element] = js.undefined
    
    /**
      * Separator pattern used to split input text into multiple values. Default value splits on commas and newlines.
      * Explicit `false` value disables splitting (note that `onAdd` will still receive an array of length 1).
      *
      * @default /[,\n\r]/
      */
    var separator: js.UndefOr[String | js.RegExp | `false`] = js.undefined
    
    /**
      * React props to pass to each `Tag`. Provide an object to pass the same props to every tag,
      * or a function to customize props per tag.
      *
      * If you define `onRemove` here then you will have to implement your own tag removal
      * handling as `TagInput`'s own `onRemove` handler will never be invoked.
      */
    var tagProps: js.UndefOr[TagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, TagProps])] = js.undefined
    
    /**
      * Controlled tag values. Each value will be rendered inside a `Tag`, which can be customized
      * using `tagProps`. Therefore, any valid React node can be used as a `TagInput` value; falsy
      * values will not be rendered.
      */
    var values: js.Array[ReactNode]
  }
  object ITagInputProps {
    
    inline def apply(values: js.Array[ReactNode]): ITagInputProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITagInputProps] (val x: Self) extends AnyVal {
      
      inline def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      inline def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      inline def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      inline def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLeftIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[ReactNode] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnRemove(value: (/* value */ ReactNode, /* index */ Double) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      inline def setSeparator(value: String | js.RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTagProps(value: TagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, TagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      inline def setTagPropsFunction2(value: (/* value */ ReactNode, /* index */ Double) => TagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
      
      inline def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      inline def setValues(value: js.Array[ReactNode]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: ReactNode*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ITagInputState extends StObject {
    
    var activeIndex: Double
    
    var inputValue: String
    
    var isInputFocused: Boolean
    
    var prevInputValueProp: js.UndefOr[String] = js.undefined
  }
  object ITagInputState {
    
    inline def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ITagInputState = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagInputState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITagInputState] (val x: Self) extends AnyVal {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
      
      inline def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
      
      inline def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.default
    - typings.blueprintjsCore.blueprintjsCoreStrings.blur
    - typings.blueprintjsCore.blueprintjsCoreStrings.paste
  */
  trait TagInputAddMethod extends StObject
  object TagInputAddMethod {
    
    inline def default: typings.blueprintjsCore.blueprintjsCoreStrings.default = "default".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.default]
    
    inline def blur: typings.blueprintjsCore.blueprintjsCoreStrings.blur = "blur".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.blur]
    
    inline def paste: typings.blueprintjsCore.blueprintjsCoreStrings.paste = "paste".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.paste]
  }
  
  type TagInputProps = ITagInputProps
}
