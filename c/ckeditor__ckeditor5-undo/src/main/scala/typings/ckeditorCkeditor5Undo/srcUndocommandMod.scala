package typings.ckeditorCkeditor5Undo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUndocommandMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undocommand", JSImport.Default)
  @js.native
  open class default () extends UndoCommand
  
  @js.native
  trait UndoCommand
    extends typings.ckeditorCkeditor5Undo.srcBasecommandMod.default {
    
    def execute(): Unit = js.native
    def execute(batch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var UndoCommand: typings.ckeditorCkeditor5Undo.srcUndocommandMod.UndoCommand
    }
    object Commands {
      
      inline def apply(UndoCommand: UndoCommand): Commands = {
        val __obj = js.Dynamic.literal(UndoCommand = UndoCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setUndoCommand(value: UndoCommand): Self = StObject.set(x, "UndoCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
