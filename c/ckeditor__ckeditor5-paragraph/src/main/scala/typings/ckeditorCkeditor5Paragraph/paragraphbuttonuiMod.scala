package typings.ckeditorCkeditor5Paragraph

import typings.ckeditorCkeditor5Paragraph.paragraphMod.Paragraph
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paragraphbuttonuiMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraphbuttonui", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ParagraphButtonUI {
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorWithUI */ Any) = this()
  }
  
  @js.native
  trait ParagraphButtonUI
    extends StObject
       with Plugin {
    
    val editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorWithUI */ Any = js.native
    
    def init(): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Paragraph: typings.ckeditorCkeditor5Paragraph.paragraphMod.Paragraph
    }
    object Plugins {
      
      inline def apply(Paragraph: Paragraph): Plugins = {
        val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setParagraph(value: Paragraph): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
      }
    }
  }
}
