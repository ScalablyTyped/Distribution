package typings.ckeditorCkeditor5Heading

import typings.ckeditorCkeditor5Heading.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadingcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/headingcommand", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HeadingCommand {
    def this(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any,
      modelElements: js.Array[String]
    ) = this()
    
    /* CompleteClass */
    override def execute(options: Value): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait HeadingCommand extends StObject {
    
    def execute(options: Value): Unit
    
    def refresh(): Unit
  }
  object HeadingCommand {
    
    inline def apply(execute: Value => Unit, refresh: () => Unit): HeadingCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[HeadingCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Value => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var HeadingCommand: typings.ckeditorCkeditor5Heading.srcHeadingcommandMod.HeadingCommand
    }
    object Commands {
      
      inline def apply(HeadingCommand: HeadingCommand): Commands = {
        val __obj = js.Dynamic.literal(HeadingCommand = HeadingCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
        
        inline def setHeadingCommand(value: HeadingCommand): Self = StObject.set(x, "HeadingCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
