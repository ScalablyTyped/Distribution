package typings.ckeditorCkeditor5SelectAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectallcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-select-all/src/selectallcommand", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SelectAllCommand {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
    
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def execute(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait SelectAllCommand extends StObject {
    
    /**
      * @inheritDoc
      */
    def execute(): Unit
  }
  object SelectAllCommand {
    
    inline def apply(execute: () => Unit): SelectAllCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
      __obj.asInstanceOf[SelectAllCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectAllCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    }
  }
}
