package typings.chromeApps.chrome

import typings.filesystem.FileEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileBrowserHandle
/////////////////////////
// File Browser Handle //
/////////////////////////
/**
  * @requires(CrOS) Chrome OS Only
  * @requires Permissions: 'fileBrowserHandler'
  * @requires Manifest: 'file_browser_handlers'
  * @description
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser.
  * For example, you can use this API to enable users to upload files to your website.
  * @see[Documentation]{@link https://developer.chrome.com/extensions/fileBrowserHandler}
  */
object fileBrowserHandler {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.ReadOnly
    - typings.chromeApps.chromeAppsStrings.ReadWrite
  */
  trait FileBrowserHandleExecuteId extends StObject
  object FileBrowserHandleExecuteId {
    
    inline def ReadOnly: typings.chromeApps.chromeAppsStrings.ReadOnly = "ReadOnly".asInstanceOf[typings.chromeApps.chromeAppsStrings.ReadOnly]
    
    inline def ReadWrite: typings.chromeApps.chromeAppsStrings.ReadWrite = "ReadWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.ReadWrite]
  }
  
  trait SelectFileParameters extends StObject {
    
    /**
      * List of file extensions that the selected file can have.
      * The list is also used to specify what files to be shown in the select file dialog.
      * Files with the listed extensions are only shown in the dialog.
      * Extensions should not include the leading '.'.
      * @example ['jpg', 'png']
      */
    var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Suggested name for the file. */
    var suggestedName: String
  }
  object SelectFileParameters {
    
    inline def apply(suggestedName: String): SelectFileParameters = {
      val __obj = js.Dynamic.literal(suggestedName = suggestedName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectFileParameters]
    }
    
    extension [Self <: SelectFileParameters](x: Self) {
      
      inline def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
      
      inline def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value*))
      
      inline def setSuggestedName(value: String): Self = StObject.set(x, "suggestedName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionResult extends StObject {
    
    /** Selected file entry. It will be null if a file hasn't been selected. */
    var entry: FileEntry | Null
    
    /** Whether the file has been selected. */
    var success: Boolean
  }
  object SelectionResult {
    
    inline def apply(success: Boolean): SelectionResult = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], entry = null)
      __obj.asInstanceOf[SelectionResult]
    }
    
    extension [Self <: SelectionResult](x: Self) {
      
      inline def setEntry(value: FileEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryNull: Self = StObject.set(x, "entry", null)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
