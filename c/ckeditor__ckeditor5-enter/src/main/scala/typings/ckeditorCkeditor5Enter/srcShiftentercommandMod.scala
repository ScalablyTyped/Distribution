package typings.ckeditorCkeditor5Enter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcShiftentercommandMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/shiftentercommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ShiftEnterCommand {
    
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait ShiftEnterCommand extends StObject {
    
    def execute(): Unit
    
    def refresh(): Unit
  }
  object ShiftEnterCommand {
    
    inline def apply(execute: () => Unit, refresh: () => Unit): ShiftEnterCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[ShiftEnterCommand]
    }
    
    extension [Self <: ShiftEnterCommand](x: Self) {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var ShiftEnterCommand: typings.ckeditorCkeditor5Enter.srcShiftentercommandMod.ShiftEnterCommand
    }
    object Commands {
      
      inline def apply(ShiftEnterCommand: ShiftEnterCommand): Commands = {
        val __obj = js.Dynamic.literal(ShiftEnterCommand = ShiftEnterCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setShiftEnterCommand(value: ShiftEnterCommand): Self = StObject.set(x, "ShiftEnterCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
