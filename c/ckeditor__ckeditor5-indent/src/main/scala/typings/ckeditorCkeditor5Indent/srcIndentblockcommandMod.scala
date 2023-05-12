package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.srcIndentcommandbehaviorIndentbehaviorMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentblockcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentblockcommand", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentBlockCommand {
    /**
      * Creates an instance of the command.
      */
    def this(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any,
      indentBehavior: IndentBehavior
    ) = this()
    
    /**
      * The command's indentation behavior.
      */
    /* private */ /* CompleteClass */
    override val _indentBehavior: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait IndentBlockCommand extends StObject {
    
    /**
      * The command's indentation behavior.
      */
    /* private */ val _indentBehavior: Any
    
    /**
      * @inheritDoc
      */
    def execute(): Unit
    
    /**
      * @inheritDoc
      */
    def refresh(): Unit
  }
  object IndentBlockCommand {
    
    inline def apply(_indentBehavior: Any, execute: () => Unit, refresh: () => Unit): IndentBlockCommand = {
      val __obj = js.Dynamic.literal(_indentBehavior = _indentBehavior.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[IndentBlockCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndentBlockCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def set_indentBehavior(value: Any): Self = StObject.set(x, "_indentBehavior", value.asInstanceOf[js.Any])
    }
  }
}
