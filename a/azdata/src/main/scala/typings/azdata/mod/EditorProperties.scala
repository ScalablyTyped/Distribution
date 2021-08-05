package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The content inside the text editor
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The languge mode for this text editor. The language mode is SQL by default.
    */
  var languageMode: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum height for editor component
    */
  var minimumHeight: js.UndefOr[Double] = js.undefined
}
object EditorProperties {
  
  inline def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  
  extension [Self <: EditorProperties](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setLanguageMode(value: String): Self = StObject.set(x, "languageMode", value.asInstanceOf[js.Any])
    
    inline def setLanguageModeUndefined: Self = StObject.set(x, "languageMode", js.undefined)
    
    inline def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimumHeightUndefined: Self = StObject.set(x, "minimumHeight", js.undefined)
  }
}
