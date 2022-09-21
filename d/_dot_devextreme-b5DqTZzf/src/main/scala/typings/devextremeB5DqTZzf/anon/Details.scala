package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.details
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.thumbnails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  /**
    * Configures the &apos;Details&apos; file system representation mode.
    */
  var details: js.UndefOr[Columns] = js.undefined
  
  /**
    * Specifies the file system representation mode.
    */
  var mode: js.UndefOr[details | thumbnails] = js.undefined
  
  /**
    * Specifies whether to display folders in the view. When this property is false, folders are displayed in the navigation pane only.
    */
  var showFolders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the parent directory in the view.
    */
  var showParentFolder: js.UndefOr[Boolean] = js.undefined
}
object Details {
  
  inline def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  extension [Self <: Details](x: Self) {
    
    inline def setDetails(value: Columns): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setMode(value: details | thumbnails): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    inline def setShowFoldersUndefined: Self = StObject.set(x, "showFolders", js.undefined)
    
    inline def setShowParentFolder(value: Boolean): Self = StObject.set(x, "showParentFolder", value.asInstanceOf[js.Any])
    
    inline def setShowParentFolderUndefined: Self = StObject.set(x, "showParentFolder", js.undefined)
  }
}
