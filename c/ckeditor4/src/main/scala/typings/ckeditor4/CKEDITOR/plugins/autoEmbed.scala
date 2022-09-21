package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.editor
import typings.ckeditor4.CKEDITOR.plugins.widget.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait autoEmbed extends StObject {
  
  def getWidgetDefinition(editor: editor, url: String): definition
}
object autoEmbed {
  
  inline def apply(getWidgetDefinition: (editor, String) => definition): autoEmbed = {
    val __obj = js.Dynamic.literal(getWidgetDefinition = js.Any.fromFunction2(getWidgetDefinition))
    __obj.asInstanceOf[autoEmbed]
  }
  
  extension [Self <: autoEmbed](x: Self) {
    
    inline def setGetWidgetDefinition(value: (editor, String) => definition): Self = StObject.set(x, "getWidgetDefinition", js.Any.fromFunction2(value))
  }
}
