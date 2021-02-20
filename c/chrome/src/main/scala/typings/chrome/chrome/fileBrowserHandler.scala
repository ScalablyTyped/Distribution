package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// File Browser Handler
////////////////////
/**
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser. For example, you can use this API to enable users to upload files to your website.
  * Availability: Since Chrome 12.
  * Permissions:  "fileBrowserHandler"
  * Important: This API works only on Chrome OS.
  */
object fileBrowserHandler {
  
  type FileBrowserHandlerExecuteEvent = Event[
    js.Function2[/* id */ String, /* details */ FileHandlerExecuteEventDetails, Unit]
  ]
  
  @js.native
  trait FileHandlerExecuteEventDetails extends StObject {
    
    /** Array of Entry instances representing files that are targets of this action (selected in ChromeOS file browser). */
    var entries: js.Array[_] = js.native
    
    /** Optional. The ID of the tab that raised this event. Tab IDs are unique within a browser session.  */
    var tab_id: js.UndefOr[Double] = js.native
  }
  object FileHandlerExecuteEventDetails {
    
    @scala.inline
    def apply(entries: js.Array[_]): FileHandlerExecuteEventDetails = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileHandlerExecuteEventDetails]
    }
    
    @scala.inline
    implicit class FileHandlerExecuteEventDetailsMutableBuilder[Self <: FileHandlerExecuteEventDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[_]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: js.Any*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setTab_id(value: Double): Self = StObject.set(x, "tab_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_idUndefined: Self = StObject.set(x, "tab_id", js.undefined)
    }
  }
  
  @js.native
  trait SelectionParams extends StObject {
    
    /**
      * Optional.
      * List of file extensions that the selected file can have. The list is also used to specify what files to be shown in the select file dialog. Files with the listed extensions are only shown in the dialog. Extensions should not include the leading '.'. Example: ['jpg', 'png']
      * Since Chrome 23.
      */
    var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
    
    /** Suggested name for the file. */
    var suggestedName: String = js.native
  }
  object SelectionParams {
    
    @scala.inline
    def apply(suggestedName: String): SelectionParams = {
      val __obj = js.Dynamic.literal(suggestedName = suggestedName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionParams]
    }
    
    @scala.inline
    implicit class SelectionParamsMutableBuilder[Self <: SelectionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
      
      @scala.inline
      def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value :_*))
      
      @scala.inline
      def setSuggestedName(value: String): Self = StObject.set(x, "suggestedName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectionResult extends StObject {
    
    /** Optional. Selected file entry. It will be null if a file hasn't been selected.  */
    var entry: js.UndefOr[js.Object | Null] = js.native
    
    /** Whether the file has been selected. */
    var success: Boolean = js.native
  }
  object SelectionResult {
    
    @scala.inline
    def apply(success: Boolean): SelectionResult = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionResult]
    }
    
    @scala.inline
    implicit class SelectionResultMutableBuilder[Self <: SelectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: js.Object): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryNull: Self = StObject.set(x, "entry", null)
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
