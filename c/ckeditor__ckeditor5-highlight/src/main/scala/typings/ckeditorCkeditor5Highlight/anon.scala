package typings.ckeditorCkeditor5Highlight

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightEditing
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightUI
import typings.ckeditorCkeditor5Highlight.srcHighlighteditingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofHighlightEditing
    extends StObject
       with Instantiable1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
          default
        ] {
    
    /**
      * @inheritDoc
      */
    def pluginName: HighlightEditing = js.native
  }
  
  @js.native
  trait TypeofHighlightUI
    extends StObject
       with Instantiable0[typings.ckeditorCkeditor5Highlight.srcHighlightuiMod.default] {
    
    /**
      * @inheritDoc
      */
    def pluginName: HighlightUI = js.native
  }
  
  trait Value extends StObject {
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
