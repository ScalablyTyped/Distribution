package typings.ckeditorCkeditor5Enter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entercommandMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/entercommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EnterCommand {
    
    /* CompleteClass */
    override def execute(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait EnterCommand extends StObject {
    
    def execute(): Unit
  }
  object EnterCommand {
    
    inline def apply(execute: () => Unit): EnterCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
      __obj.asInstanceOf[EnterCommand]
    }
    
    extension [Self <: EnterCommand](x: Self) {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    }
  }
  
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var EnterCommand: typings.ckeditorCkeditor5Enter.entercommandMod.EnterCommand
    }
    object Commands {
      
      inline def apply(EnterCommand: EnterCommand): Commands = {
        val __obj = js.Dynamic.literal(EnterCommand = EnterCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setEnterCommand(value: EnterCommand): Self = StObject.set(x, "EnterCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
