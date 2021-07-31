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
  
  @scala.inline
  def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  
  @scala.inline
  implicit class EditorPropertiesMutableBuilder[Self <: EditorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setLanguageMode(value: String): Self = StObject.set(x, "languageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageModeUndefined: Self = StObject.set(x, "languageMode", js.undefined)
    
    @scala.inline
    def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHeightUndefined: Self = StObject.set(x, "minimumHeight", js.undefined)
  }
}
