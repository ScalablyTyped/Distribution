package typings.ckeditorCkeditor5Undo

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUndoeditingMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undoediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UndoEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-undo/src/undoediting", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.UndoEditing = js.native
  }
  
  @js.native
  trait UndoEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var UndoEditing: typings.ckeditorCkeditor5Undo.srcUndoeditingMod.UndoEditing
    }
    object Plugins {
      
      inline def apply(UndoEditing: UndoEditing): Plugins = {
        val __obj = js.Dynamic.literal(UndoEditing = UndoEditing.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setUndoEditing(value: UndoEditing): Self = StObject.set(x, "UndoEditing", value.asInstanceOf[js.Any])
      }
    }
  }
}
