package typings.ckeditorCkeditor5Paragraph

import typings.ckeditorCkeditor5Paragraph.anon.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParagraphcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraphcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ParagraphCommand
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ @js.native
  trait ParagraphCommand extends StObject {
    
    /**
      * Executes the command. All the blocks (see {@link module:engine/model/schema~Schema}) in the selection
      * will be turned to paragraphs.
      */
    def execute(): Unit = js.native
    def execute(options: Selection): Unit = js.native
    
    /**
      * The value of the command. Indicates whether the selection start is placed in a paragraph.
      */
    def value: Boolean = js.native
    /* protected */ def value_=(value: Boolean): Unit = js.native
  }
}
