package typings.cucumberCucumber

import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.TestCase
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeAssembleTestCasesMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/assemble_test_cases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleTestCases(param0: IAssembleTestCasesOptions): js.Promise[IAssembledTestCases] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleTestCases")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IAssembledTestCases]]
  
  trait IAssembleTestCasesOptions extends StObject {
    
    var eventBroadcaster: EventEmitter
    
    def newId(): String
    @JSName("newId")
    var newId_Original: NewId
    
    var pickles: js.Array[Pickle]
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object IAssembleTestCasesOptions {
    
    inline def apply(
      eventBroadcaster: EventEmitter,
      newId: () => String,
      pickles: js.Array[Pickle],
      supportCodeLibrary: ISupportCodeLibrary
    ): IAssembleTestCasesOptions = {
      val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), pickles = pickles.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAssembleTestCasesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAssembleTestCasesOptions] (val x: Self) extends AnyVal {
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setPickles(value: js.Array[Pickle]): Self = StObject.set(x, "pickles", value.asInstanceOf[js.Any])
      
      inline def setPicklesVarargs(value: Pickle*): Self = StObject.set(x, "pickles", js.Array(value*))
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  type IAssembledTestCases = Record[String, TestCase]
}
