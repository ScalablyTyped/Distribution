package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IControlledProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/inputGroup", "InputGroup")
  @js.native
  class InputGroup protected ()
    extends AbstractPureComponent2[IInputGroupProps & HTMLInputProps, IInputGroupState, js.Object] {
    def this(props: IInputGroupProps & HTMLInputProps) = this()
    def this(props: IInputGroupProps & HTMLInputProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInputGroup(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputGroup(prevProps: IInputGroupProps & HTMLInputProps): Unit = js.native
    
    /* private */ var leftElement: js.Any = js.native
    
    /* private */ var maybeRenderLeftElement: js.Any = js.native
    
    /* private */ var maybeRenderRightElement: js.Any = js.native
    
    /* private */ var refHandlers: js.Any = js.native
    
    /* private */ var rightElement: js.Any = js.native
    
    /* private */ var updateInputWidth: js.Any = js.native
  }
  /* static members */
  object InputGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/inputGroup", "InputGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/inputGroup", "InputGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IInputGroupProps
    extends StObject
       with IControlledProps
       with IIntentProps
       with IProps {
    
    /**
      * Set this to `true` if you will be controlling the `value` of this input with asynchronous updates.
      * These may occur if you do not immediately call setState in a parent component with the value from
      * the `onChange` handler, or if working with certain libraries like __redux-form__.
      * @default false
      */
    var asyncControl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the input is non-interactive.
      * Note that `rightElement` must be disabled separately; this prop will not affect it.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the component should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /** Ref handler or a ref object that receives HTML `<input>` element backing this component. */
    var inputRef: js.UndefOr[IRef[HTMLInputElement]] = js.undefined
    
    /** Whether this input should use large styles. */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Element to render on the left side of input.  This prop is mutually exclusive
      * with `leftIcon`.
      */
    var leftElement: js.UndefOr[Element] = js.undefined
    
    /**
      * Name of a Blueprint UI icon to render on the left side of the input group,
      * before the user's cursor.  This prop is mutually exclusive with `leftElement`.
      * Usage with content is deprecated.  Use `leftElement` for elements.
      */
    var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
    
    /** Placeholder text in the absence of any value. */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Element to render on right side of input.
      * For best results, use a minimal button, tag, or small spinner.
      */
    var rightElement: js.UndefOr[Element] = js.undefined
    
    /** Whether the input (and any buttons) should appear with rounded caps. */
    var round: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this input should use small styles. */
    var small: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTML `input` type attribute.
      * @default "text"
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IInputGroupProps {
    
    inline def apply(): IInputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInputGroupProps]
    }
    
    extension [Self <: IInputGroupProps](x: Self) {
      
      inline def setAsyncControl(value: Boolean): Self = StObject.set(x, "asyncControl", value.asInstanceOf[js.Any])
      
      inline def setAsyncControlUndefined: Self = StObject.set(x, "asyncControl", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInputRef(value: IRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* ref */ HTMLInputElement | Null => js.Any): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLeftElement(value: Element): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
      
      inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
      
      inline def setLeftIcon(value: IconName | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IInputGroupState extends StObject {
    
    var leftElementWidth: js.UndefOr[Double] = js.undefined
    
    var rightElementWidth: js.UndefOr[Double] = js.undefined
  }
  object IInputGroupState {
    
    inline def apply(): IInputGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInputGroupState]
    }
    
    extension [Self <: IInputGroupState](x: Self) {
      
      inline def setLeftElementWidth(value: Double): Self = StObject.set(x, "leftElementWidth", value.asInstanceOf[js.Any])
      
      inline def setLeftElementWidthUndefined: Self = StObject.set(x, "leftElementWidth", js.undefined)
      
      inline def setRightElementWidth(value: Double): Self = StObject.set(x, "rightElementWidth", value.asInstanceOf[js.Any])
      
      inline def setRightElementWidthUndefined: Self = StObject.set(x, "rightElementWidth", js.undefined)
    }
  }
}
