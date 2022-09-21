package typings.ckeditorCkeditor5Undo

import typings.ckeditorCkeditor5Undo.anon.TypeofUndoEditing
import typings.ckeditorCkeditor5Undo.anon.TypeofUndoUI
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undo", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Plugin
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-undo/src/undo", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.Undo = js.native
    
    @JSImport("@ckeditor/ckeditor5-undo/src/undo", "default.requires")
    @js.native
    val requires: js.Tuple2[TypeofUndoEditing, TypeofUndoUI] = js.native
  }
  
  type Undo = Plugin
  
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
