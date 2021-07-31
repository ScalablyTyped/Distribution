package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.anon.Uuid
import typings.carbonComponentsReact.sharedMod.FileStatus
import typings.carbonComponentsReact.sharedMod.FileUploaderSize
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FileUploader/FileUploaderItem", JSImport.Default)
  @js.native
  val default: FC[FileUploaderItemProps] = js.native
  
  trait FileUploaderItemProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Error message body for an invalid file upload
      */
    var errorBody: js.UndefOr[NonNullable[ReactNode]] = js.undefined
    
    /**
      * Error message subject for an invalid file upload
      */
    var errorSubject: js.UndefOr[NonNullable[ReactNode]] = js.undefined
    
    var iconDescription: js.UndefOr[String] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the uploaded file
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Event handler that is called after removing a file from the file uploader
      * The event handler signature looks like `onDelete(evt, { uuid })`
      */
    var onDelete: js.UndefOr[
        js.Function2[
          /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          /* content */ Uuid, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Specify the size of the uploaded items, from a list of available
      * sizes. For `default` size, this prop can remain unspecified.
      */
    var size: js.UndefOr[FileUploaderSize] = js.undefined
    
    /**
      * Status of the file upload
      */
    var status: js.UndefOr[FileStatus] = js.undefined
    
    /**
      * Unique identifier for the file object
      */
    // Required but has a default value
    var uuid: js.UndefOr[String] = js.undefined
  }
  object FileUploaderItemProps {
    
    @scala.inline
    def apply(): FileUploaderItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderItemProps]
    }
    
    @scala.inline
    implicit class FileUploaderItemPropsMutableBuilder[Self <: FileUploaderItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorBody(value: NonNullable[ReactNode]): Self = StObject.set(x, "errorBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBodyUndefined: Self = StObject.set(x, "errorBody", js.undefined)
      
      @scala.inline
      def setErrorSubject(value: NonNullable[ReactNode]): Self = StObject.set(x, "errorSubject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorSubjectUndefined: Self = StObject.set(x, "errorSubject", js.undefined)
      
      @scala.inline
      def setIconDescription(value: String): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnDelete(
        value: (/* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], /* content */ Uuid) => Unit
      ): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setSize(value: FileUploaderSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: FileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  type _To = FC[FileUploaderItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileUploaderItemMod.foo` */
  override def _to: FC[FileUploaderItemProps] = default
}
