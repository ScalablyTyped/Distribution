package typings.ckeditorCkeditor5Undo

import typings.ckeditorCkeditor5Undo.undoMod.Undo
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undouiMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undoui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UndoUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-undo/src/undoui", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.UndoUI = js.native
  }
  
  @js.native
  trait UndoUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Undo: typings.ckeditorCkeditor5Undo.undoMod.Undo
    }
    object Plugins {
      
      inline def apply(Undo: Undo): Plugins = {
        val __obj = js.Dynamic.literal(Undo = Undo.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setUndo(value: Undo): Self = StObject.set(x, "Undo", value.asInstanceOf[js.Any])
      }
    }
  }
}
