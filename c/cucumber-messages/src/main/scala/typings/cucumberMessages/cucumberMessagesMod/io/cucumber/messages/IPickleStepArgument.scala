package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleStepArgument. */
@js.native
trait IPickleStepArgument extends StObject {
  
  /** PickleStepArgument dataTable */
  var dataTable: js.UndefOr[IPickleTable | Null] = js.native
  
  /** PickleStepArgument docString */
  var docString: js.UndefOr[IPickleDocString | Null] = js.native
}
object IPickleStepArgument {
  
  @scala.inline
  def apply(): IPickleStepArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleStepArgument]
  }
  
  @scala.inline
  implicit class IPickleStepArgumentMutableBuilder[Self <: IPickleStepArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTable(value: IPickleTable): Self = StObject.set(x, "dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableNull: Self = StObject.set(x, "dataTable", null)
    
    @scala.inline
    def setDataTableUndefined: Self = StObject.set(x, "dataTable", js.undefined)
    
    @scala.inline
    def setDocString(value: IPickleDocString): Self = StObject.set(x, "docString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocStringNull: Self = StObject.set(x, "docString", null)
    
    @scala.inline
    def setDocStringUndefined: Self = StObject.set(x, "docString", js.undefined)
  }
}
