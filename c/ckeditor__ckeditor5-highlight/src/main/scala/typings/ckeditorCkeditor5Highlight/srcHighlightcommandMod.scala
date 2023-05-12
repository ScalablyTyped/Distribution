package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightCommand
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ @js.native
  trait HighlightCommand extends StObject {
    
    /**
      * Executes the command.
      *
      * @param options Options for the executed command.
      * @param options.value The value to apply.
      *
      * @fires execute
      */
    def execute(): Unit = js.native
    def execute(options: Value): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    
    /**
      * A value indicating whether the command is active. If the selection has some highlight attribute,
      * it corresponds to the value of that attribute.
      *
      * @observable
      * @readonly
      */
    var value: js.UndefOr[String] = js.native
  }
}
