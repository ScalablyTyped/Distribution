package typings.ckeditorCkeditor5Undo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBasecommandMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-undo/src/basecommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BaseCommand {
    
    /* CompleteClass */
    override def addBatch(batch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default): Unit = js.native
    
    /* CompleteClass */
    override def clearStack(): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait BaseCommand extends StObject {
    
    def addBatch(batch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default): Unit
    
    def clearStack(): Unit
    
    def refresh(): Unit
  }
  object BaseCommand {
    
    inline def apply(
      addBatch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default => Unit,
      clearStack: () => Unit,
      refresh: () => Unit
    ): BaseCommand = {
      val __obj = js.Dynamic.literal(addBatch = js.Any.fromFunction1(addBatch), clearStack = js.Any.fromFunction0(clearStack), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[BaseCommand]
    }
    
    extension [Self <: BaseCommand](x: Self) {
      
      inline def setAddBatch(value: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default => Unit): Self = StObject.set(x, "addBatch", js.Any.fromFunction1(value))
      
      inline def setClearStack(value: () => Unit): Self = StObject.set(x, "clearStack", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
