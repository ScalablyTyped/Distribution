package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIAsyncControllable
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.react.mod.ClassAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LegacyRef
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsAsyncControllableInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
  @js.native
  open class AsyncControllableInput protected ()
    extends AbstractPureComponent2[IAsyncControllableInputProps, IAsyncControllableInputState, js.Object] {
    def this(props: IAsyncControllableInputProps) = this()
    def this(props: IAsyncControllableInputProps, context: Any) = this()
    
    /* private */ var cancelPendingCompositionEnd: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleCompositionEnd: Any = js.native
    
    /* private */ var handleCompositionStart: Any = js.native
  }
  /* static members */
  object AsyncControllableInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The amount of time (in milliseconds) which the input will wait after a compositionEnd event before
      * unlocking its state value for external updates via props. See `handleCompositionEnd` for more details.
      */
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput.COMPOSITION_END_DELAY")
    @js.native
    def COMPOSITION_END_DELAY: Double = js.native
    inline def COMPOSITION_END_DELAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITION_END_DELAY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IAsyncControllableInputProps, nextState: IAsyncControllableInputState): PartialIAsyncControllable | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[PartialIAsyncControllable | Null]
  }
  
  trait IAsyncControllableInputProps
    extends StObject
       with ClassAttributes[HTMLInputElement]
       with InputHTMLAttributes[HTMLInputElement] {
    
    var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.undefined
  }
  object IAsyncControllableInputProps {
    
    inline def apply(): IAsyncControllableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAsyncControllableInputProps]
    }
    
    extension [Self <: IAsyncControllableInputProps](x: Self) {
      
      inline def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    }
  }
  
  trait IAsyncControllableInputState extends StObject {
    
    /**
      * Whether there is a pending update we are expecting from a parent component.
      *
      * @default false
      */
    var hasPendingUpdate: Boolean
    
    /**
      * Whether we are in the middle of a composition event.
      *
      * @default false
      */
    var isComposing: Boolean
    
    /**
      * The latest input value, which updates during IME composition. Defaults to props.value.
      */
    var nextValue: InputValue
    
    /**
      * The source of truth for the input value. This is not updated during IME composition.
      * It may be updated by a parent component.
      *
      * @default ""
      */
    var value: InputValue
  }
  object IAsyncControllableInputState {
    
    inline def apply(hasPendingUpdate: Boolean, isComposing: Boolean): IAsyncControllableInputState = {
      val __obj = js.Dynamic.literal(hasPendingUpdate = hasPendingUpdate.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsyncControllableInputState]
    }
    
    extension [Self <: IAsyncControllableInputState](x: Self) {
      
      inline def setHasPendingUpdate(value: Boolean): Self = StObject.set(x, "hasPendingUpdate", value.asInstanceOf[js.Any])
      
      inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
      
      inline def setNextValue(value: InputValue): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
      
      inline def setNextValueUndefined: Self = StObject.set(x, "nextValue", js.undefined)
      
      inline def setNextValueVarargs(value: String*): Self = StObject.set(x, "nextValue", js.Array(value*))
      
      inline def setValue(value: InputValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type InputValue = js.UndefOr[String | js.Array[String] | Double]
}
