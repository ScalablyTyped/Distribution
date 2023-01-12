package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.anon.LanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguagecommandMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguagecommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TextPartLanguageCommand
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ @js.native
  trait TextPartLanguageCommand extends StObject {
    
    def execute(): Unit = js.native
    def execute(options: LanguageCode): Unit = js.native
    
    def refresh(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var TextPartLanguageCommand: typings.ckeditorCkeditor5Language.srcTextpartlanguagecommandMod.TextPartLanguageCommand
    }
    object Commands {
      
      inline def apply(TextPartLanguageCommand: TextPartLanguageCommand): Commands = {
        val __obj = js.Dynamic.literal(TextPartLanguageCommand = TextPartLanguageCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
        
        inline def setTextPartLanguageCommand(value: TextPartLanguageCommand): Self = StObject.set(x, "TextPartLanguageCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
