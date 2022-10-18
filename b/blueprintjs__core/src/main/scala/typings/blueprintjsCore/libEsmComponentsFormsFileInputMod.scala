package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLProps
import typings.react.mod.LabelHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsFileInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput")
  @js.native
  open class FileInput protected ()
    extends AbstractPureComponent2[FileInputProps, js.Object, js.Object] {
    def this(props: FileInputProps) = this()
    def this(props: FileInputProps, context: Any) = this()
    
    /* private */ var handleInputChange: Any = js.native
  }
  /* static members */
  object FileInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput.defaultProps")
    @js.native
    def defaultProps: FileInputProps = js.native
    inline def defaultProps_=(x: FileInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type FileInputProps = IFileInputProps
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IFileInputProps
    extends StObject
       with LabelHTMLAttributes[HTMLLabelElement] {
    
    /**
      * The button text.
      *
      * @default "Browse"
      */
    var buttonText: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the file input is non-interactive.
      * Setting this to `true` will automatically disable the child input too.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the file input should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the user has made a selection in the input. This will affect the component's
      * text styling. Make sure to set a non-empty value for the text prop as well.
      *
      * @default false
      */
    var hasSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The props to pass to the child input.
      * `disabled` will be ignored in favor of the top-level prop.
      * `type` will be ignored, because the input _must_ be `type="file"`.
      * Pass `onChange` here to be notified when the user selects a file.
      */
    var inputProps: js.UndefOr[HTMLProps[HTMLInputElement]] = js.undefined
    
    /**
      * Whether the file input should appear with large styling.
      */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked on `<input>` `change` events.
      *
      * This callback is offered as a convenience; it is equivalent to passing
      * `onChange` to `inputProps`.
      *
      * __Note:__ The top-level `onChange` prop is passed to the wrapping
      * `<label>` rather than the `<input>`, which may not be what you expect.
      */
    var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * The text to display.
      *
      * @default "Choose file..."
      */
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object IFileInputProps {
    
    inline def apply(): IFileInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileInputProps]
    }
    
    extension [Self <: IFileInputProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHasSelection(value: Boolean): Self = StObject.set(x, "hasSelection", value.asInstanceOf[js.Any])
      
      inline def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      inline def setInputProps(value: HTMLProps[HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
