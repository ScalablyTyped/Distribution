package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffEditorProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The content inside the left text editor
    */
  var contentLeft: String
  
  /**
    * The content inside the right text editor
    */
  var contentRight: String
  
  /**
    * Toggle for whether the editor should be automatically resized or not
    */
  var isAutoResizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language mode for this text editor. The language mode is SQL by default.
    */
  var languageMode: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum height for editor component
    */
  var minimumHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Title of editor
    */
  var title: String
}
object DiffEditorProperties {
  
  inline def apply(contentLeft: String, contentRight: String, title: String): DiffEditorProperties = {
    val __obj = js.Dynamic.literal(contentLeft = contentLeft.asInstanceOf[js.Any], contentRight = contentRight.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffEditorProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffEditorProperties] (val x: Self) extends AnyVal {
    
    inline def setContentLeft(value: String): Self = StObject.set(x, "contentLeft", value.asInstanceOf[js.Any])
    
    inline def setContentRight(value: String): Self = StObject.set(x, "contentRight", value.asInstanceOf[js.Any])
    
    inline def setIsAutoResizable(value: Boolean): Self = StObject.set(x, "isAutoResizable", value.asInstanceOf[js.Any])
    
    inline def setIsAutoResizableUndefined: Self = StObject.set(x, "isAutoResizable", js.undefined)
    
    inline def setLanguageMode(value: String): Self = StObject.set(x, "languageMode", value.asInstanceOf[js.Any])
    
    inline def setLanguageModeUndefined: Self = StObject.set(x, "languageMode", js.undefined)
    
    inline def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimumHeightUndefined: Self = StObject.set(x, "minimumHeight", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
