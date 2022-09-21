package typings.ckeditorCkeditor5Undo

import typings.ckeditorCkeditor5Undo.redocommandMod.RedoCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undocommandMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undocommand", JSImport.Default)
  @js.native
  open class default () extends UndoCommand
  
  @js.native
  trait UndoCommand
    extends typings.ckeditorCkeditor5Undo.basecommandMod.default {
    
    def execute(): Unit = js.native
    def execute(batch: typings.ckeditorCkeditor5Engine.batchMod.default): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var RedoCommand: typings.ckeditorCkeditor5Undo.redocommandMod.RedoCommand
    }
    object Commands {
      
      inline def apply(RedoCommand: RedoCommand): Commands = {
        val __obj = js.Dynamic.literal(RedoCommand = RedoCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setRedoCommand(value: RedoCommand): Self = StObject.set(x, "RedoCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
