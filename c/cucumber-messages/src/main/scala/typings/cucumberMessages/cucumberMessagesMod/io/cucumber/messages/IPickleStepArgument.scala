package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleStepArgument. */
@js.native
trait IPickleStepArgument extends js.Object {
  
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
  implicit class IPickleStepArgumentOps[Self <: IPickleStepArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataTable(value: IPickleTable): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    
    @scala.inline
    def setDataTableNull: Self = this.set("dataTable", null)
    
    @scala.inline
    def setDocString(value: IPickleDocString): Self = this.set("docString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocString: Self = this.set("docString", js.undefined)
    
    @scala.inline
    def setDocStringNull: Self = this.set("docString", null)
  }
}
