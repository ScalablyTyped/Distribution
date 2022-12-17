package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.anon.AddedFiles
import typings.react.mod.DragEvent
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFileUploaderFileUploaderDropContainerMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FileUploader/FileUploaderDropContainer", JSImport.Default)
  @js.native
  val default: FC[FileUploaderDropContainerProps] = js.native
  
  trait FileUploaderDropContainerProps
    extends StObject
       with HTMLAttributes[HTMLLabelElement] {
    
    /**
      * Specify the types of files that this input should be able to receive
      */
    var accept: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specify whether file input is disabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide the label text to be read by screen readers when interacting with
      * this control
      */
    // Required but has a default value
    var labelText: js.UndefOr[String] = js.undefined
    
    /**
      * Specify if the component should accept multiple files to upload
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a name for the underlying <input> node
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Event handler that is called after files are added to the uploader
      * The event handler signature looks like `onAddFiles(evt, { addedFiles })`
      */
    var onAddFiles: js.UndefOr[js.Function2[/* event */ DragEvent[HTMLElement], /* content */ AddedFiles, Unit]] = js.undefined
    
    /**
      * Provide a custom regex pattern for the acceptedTypes
      */
    var pattern: js.UndefOr[String] = js.undefined
    
    /**
      * Provide an accessibility role for the <FileUploaderButton>
      */
    @JSName("role")
    var role_FileUploaderDropContainerProps: js.UndefOr[String] = js.undefined
  }
  object FileUploaderDropContainerProps {
    
    inline def apply(): FileUploaderDropContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderDropContainerProps]
    }
    
    extension [Self <: FileUploaderDropContainerProps](x: Self) {
      
      inline def setAccept(value: js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAddFiles(value: (/* event */ DragEvent[HTMLElement], /* content */ AddedFiles) => Unit): Self = StObject.set(x, "onAddFiles", js.Any.fromFunction2(value))
      
      inline def setOnAddFilesUndefined: Self = StObject.set(x, "onAddFiles", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type _To = FC[FileUploaderDropContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFileUploaderFileUploaderDropContainerMod.foo` */
  override def _to: FC[FileUploaderDropContainerProps] = default
}
