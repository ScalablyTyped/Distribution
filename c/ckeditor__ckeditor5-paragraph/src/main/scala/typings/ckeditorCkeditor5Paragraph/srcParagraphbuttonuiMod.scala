package typings.ckeditorCkeditor5Paragraph

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParagraphbuttonuiMod {
  
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
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var ParagraphButtonUI: typings.ckeditorCkeditor5Paragraph.srcParagraphbuttonuiMod.ParagraphButtonUI
    }
    object Plugins {
      
      inline def apply(ParagraphButtonUI: ParagraphButtonUI): Plugins = {
        val __obj = js.Dynamic.literal(ParagraphButtonUI = ParagraphButtonUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setParagraphButtonUI(value: ParagraphButtonUI): Self = StObject.set(x, "ParagraphButtonUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
