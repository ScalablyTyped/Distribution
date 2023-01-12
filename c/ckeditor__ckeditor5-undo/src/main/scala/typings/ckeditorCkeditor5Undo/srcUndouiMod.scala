package typings.ckeditorCkeditor5Undo

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUndouiMod {
  
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
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var UndoUI: typings.ckeditorCkeditor5Undo.srcUndouiMod.UndoUI
    }
    object Plugins {
      
      inline def apply(UndoUI: UndoUI): Plugins = {
        val __obj = js.Dynamic.literal(UndoUI = UndoUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setUndoUI(value: UndoUI): Self = StObject.set(x, "UndoUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
