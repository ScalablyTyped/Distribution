package typings.ckeditorCkeditor5Enter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEntercommandMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnterCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var EnterCommand: typings.ckeditorCkeditor5Enter.srcEntercommandMod.EnterCommand
    }
    object Commands {
      
      inline def apply(EnterCommand: EnterCommand): Commands = {
        val __obj = js.Dynamic.literal(EnterCommand = EnterCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
        
        inline def setEnterCommand(value: EnterCommand): Self = StObject.set(x, "EnterCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
