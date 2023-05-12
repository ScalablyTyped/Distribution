package typings.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.libEsmCommonIntentMod.Intent
import typings.blueprintjsIcons.libEsmGeneratedIcons16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonPropsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", "DISPLAYNAME_PREFIX")
  @js.native
  val DISPLAYNAME_PREFIX: /* "Blueprint4" */ String = js.native
  
  inline def removeNonHTMLProps(props: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: Unit, shouldMerge: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  trait ActionProps[T /* <: HTMLElement */]
    extends StObject
       with IIntentProps
       with IProps {
    
    /** Whether this action is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /** Click event handler. */
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[T, NativeMouseEvent], Unit]] = js.undefined
    
    /** Focus event handler. */
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[T, Element], Unit]] = js.undefined
    
    /** Action text. Can be any single React renderable. */
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object ActionProps {
    
    inline def apply[T /* <: HTMLElement */](): ActionProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionProps[?], T /* <: HTMLElement */] (val x: Self & ActionProps[T]) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClick(value: /* event */ MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[T, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ControlledProps2 = IControlledProps2
  
  type HTMLDivProps = HTMLAttributes[HTMLDivElement]
  
  type HTMLInputProps = InputHTMLAttributes[HTMLInputElement]
  
  type IActionProps = ActionProps[HTMLElement]
  
  trait IControlledProps extends StObject {
    
    /** Initial value of the input, for uncontrolled usage. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Change event handler. Use `event.target.value` for new value. */
    var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    /** Form value of the input, for controlled usage. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IControlledProps {
    
    inline def apply(): IControlledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlledProps] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IControlledProps2 extends StObject {
    
    /** Initial value of the input, for uncontrolled usage. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Form value of the input, for controlled usage. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IControlledProps2 {
    
    inline def apply(): IControlledProps2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledProps2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlledProps2] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IElementRefProps[E /* <: HTMLElement */] extends StObject {
    
    /** A ref handler or a ref object that receives the native HTML element rendered by this component. */
    var elementRef: js.UndefOr[Ref[E]] = js.undefined
  }
  object IElementRefProps {
    
    inline def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementRefProps[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IElementRefProps[?], E /* <: HTMLElement */] (val x: Self & IElementRefProps[E]) extends AnyVal {
      
      inline def setElementRef(value: Ref[E]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    }
  }
  
  trait IIntentProps extends StObject {
    
    /** Visual intent color to apply to element. */
    var intent: js.UndefOr[Intent] = js.undefined
  }
  object IIntentProps {
    
    inline def apply(): IIntentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIntentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIntentProps] (val x: Self) extends AnyVal {
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    }
  }
  
  trait ILinkProps extends StObject {
    
    /** Link URL. */
    var href: js.UndefOr[String] = js.undefined
    
    /** Link target attribute. Use `"_blank"` to open in a new window. */
    var target: js.UndefOr[String] = js.undefined
  }
  object ILinkProps {
    
    inline def apply(): ILinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILinkProps] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IOptionProps
    extends StObject
       with IProps {
    
    /** Whether this option is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Label text for this option. If omitted, `value` is used as the label. */
    var label: js.UndefOr[String] = js.undefined
    
    /** Value of this option. */
    var value: String | Double
  }
  object IOptionProps {
    
    inline def apply(value: String | Double): IOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptionProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProps extends StObject {
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.undefined
  }
  object IProps {
    
    inline def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type IntentProps = IIntentProps
  
  type LinkProps = ILinkProps
  
  type MaybeElement = js.UndefOr[typings.react.mod.global.JSX.Element | `false` | Null]
  
  type OptionProps = IOptionProps
  
  type Props = IProps
}
