package typings.ckeditorCkeditor5Paragraph

import typings.ckeditorCkeditor5Paragraph.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInsertparagraphcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/insertparagraphcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with InsertParagraphCommand {
    
    /**
      * Executes the command.
      */
    /* CompleteClass */
    override def execute(options: Position): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait InsertParagraphCommand extends StObject {
    
    /**
      * Executes the command.
      */
    def execute(options: Position): Unit
  }
  object InsertParagraphCommand {
    
    inline def apply(execute: Position => Unit): InsertParagraphCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[InsertParagraphCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertParagraphCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Position => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
}
