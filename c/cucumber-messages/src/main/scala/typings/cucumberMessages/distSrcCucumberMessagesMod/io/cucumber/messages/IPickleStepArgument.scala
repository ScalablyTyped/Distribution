package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleDocString
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleStepArgument. */
trait IPickleStepArgument extends StObject {
  
  /** PickleStepArgument dataTable */
  var dataTable: js.UndefOr[IPickleTable | Null] = js.undefined
  
  /** PickleStepArgument docString */
  var docString: js.UndefOr[IPickleDocString | Null] = js.undefined
}
object IPickleStepArgument {
  
  inline def apply(): IPickleStepArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleStepArgument]
  }
  
  extension [Self <: IPickleStepArgument](x: Self) {
    
    inline def setDataTable(value: IPickleTable): Self = StObject.set(x, "dataTable", value.asInstanceOf[js.Any])
    
    inline def setDataTableNull: Self = StObject.set(x, "dataTable", null)
    
    inline def setDataTableUndefined: Self = StObject.set(x, "dataTable", js.undefined)
    
    inline def setDocString(value: IPickleDocString): Self = StObject.set(x, "docString", value.asInstanceOf[js.Any])
    
    inline def setDocStringNull: Self = StObject.set(x, "docString", null)
    
    inline def setDocStringUndefined: Self = StObject.set(x, "docString", js.undefined)
  }
}
