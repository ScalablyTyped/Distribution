package typings.cucumberCucumber

import typings.cucumberMessages.mod.PickleDocString
import typings.cucumberMessages.mod.PickleStepArgument
import typings.cucumberMessages.mod.PickleTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepArgumentsMod {
  
  @JSImport("@cucumber/cucumber/lib/step_arguments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseStepArgument[T](arg: PickleStepArgument, mapping: IPickleStepArgumentFunctionMap[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStepArgument")(arg.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait IPickleStepArgumentFunctionMap[T] extends StObject {
    
    def dataTable(arg: PickleTable): T
    
    def docString(arg: PickleDocString): T
  }
  object IPickleStepArgumentFunctionMap {
    
    inline def apply[T](dataTable: PickleTable => T, docString: PickleDocString => T): IPickleStepArgumentFunctionMap[T] = {
      val __obj = js.Dynamic.literal(dataTable = js.Any.fromFunction1(dataTable), docString = js.Any.fromFunction1(docString))
      __obj.asInstanceOf[IPickleStepArgumentFunctionMap[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPickleStepArgumentFunctionMap[?], T] (val x: Self & IPickleStepArgumentFunctionMap[T]) extends AnyVal {
      
      inline def setDataTable(value: PickleTable => T): Self = StObject.set(x, "dataTable", js.Any.fromFunction1(value))
      
      inline def setDocString(value: PickleDocString => T): Self = StObject.set(x, "docString", js.Any.fromFunction1(value))
    }
  }
}
