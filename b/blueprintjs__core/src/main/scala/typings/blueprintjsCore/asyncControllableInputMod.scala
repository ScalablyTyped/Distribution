package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIAsyncControllable
import typings.react.mod.ClassAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LegacyRef
import typings.react.mod.PureComponent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncControllableInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
  @js.native
  class AsyncControllableInput protected ()
    extends PureComponent[IAsyncControllableInputProps, IAsyncControllableInputState, js.Any] {
    def this(props: IAsyncControllableInputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IAsyncControllableInputProps, context: js.Any) = this()
    
    var handleChange: js.Any = js.native
    
    var handleCompositionEnd: js.Any = js.native
    
    var handleCompositionStart: js.Any = js.native
  }
  /* static members */
  object AsyncControllableInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IAsyncControllableInputProps, nextState: IAsyncControllableInputState): PartialIAsyncControllable | Null = js.native
  }
  
  @js.native
  trait IAsyncControllableInputProps
    extends InputHTMLAttributes[HTMLInputElement]
       with ClassAttributes[HTMLInputElement] {
    
    var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.native
  }
  object IAsyncControllableInputProps {
    
    @scala.inline
    def apply(): IAsyncControllableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAsyncControllableInputProps]
    }
    
    @scala.inline
    implicit class IAsyncControllableInputPropsMutableBuilder[Self <: IAsyncControllableInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    }
  }
  
  @js.native
  trait IAsyncControllableInputState extends StObject {
    
    /**
      * Whether there is a pending update we are expecting from a parent component.
      * @default false
      */
    var hasPendingUpdate: Boolean = js.native
    
    /**
      * Whether we are in the middle of a composition event.
      * @default false
      */
    var isComposing: Boolean = js.native
    
    /**
      * The latest input value, which updates during IME composition. Defaults to props.value.
      */
    var nextValue: InputValue = js.native
    
    /**
      * The source of truth for the input value. This is not updated during IME composition.
      * It may be updated by a parent component.
      * @default ""
      */
    var value: InputValue = js.native
  }
  object IAsyncControllableInputState {
    
    @scala.inline
    def apply(hasPendingUpdate: Boolean, isComposing: Boolean): IAsyncControllableInputState = {
      val __obj = js.Dynamic.literal(hasPendingUpdate = hasPendingUpdate.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsyncControllableInputState]
    }
    
    @scala.inline
    implicit class IAsyncControllableInputStateMutableBuilder[Self <: IAsyncControllableInputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasPendingUpdate(value: Boolean): Self = StObject.set(x, "hasPendingUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextValue(value: InputValue): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextValueUndefined: Self = StObject.set(x, "nextValue", js.undefined)
      
      @scala.inline
      def setNextValueVarargs(value: String*): Self = StObject.set(x, "nextValue", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: InputValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type InputValue = js.UndefOr[String | js.Array[String] | Double]
}
