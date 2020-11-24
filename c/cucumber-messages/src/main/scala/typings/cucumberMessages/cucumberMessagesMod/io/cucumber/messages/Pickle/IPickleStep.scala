package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickleStepArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleStep. */
@js.native
trait IPickleStep extends js.Object {
  
  /** PickleStep argument */
  var argument: js.UndefOr[IPickleStepArgument | Null] = js.native
  
  /** PickleStep astNodeIds */
  var astNodeIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** PickleStep id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** PickleStep text */
  var text: js.UndefOr[String | Null] = js.native
}
object IPickleStep {
  
  @scala.inline
  def apply(): IPickleStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleStep]
  }
  
  @scala.inline
  implicit class IPickleStepOps[Self <: IPickleStep] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: IPickleStepArgument): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setArgumentNull: Self = this.set("argument", null)
    
    @scala.inline
    def setAstNodeIdsVarargs(value: String*): Self = this.set("astNodeIds", js.Array(value :_*))
    
    @scala.inline
    def setAstNodeIds(value: js.Array[String]): Self = this.set("astNodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstNodeIds: Self = this.set("astNodeIds", js.undefined)
    
    @scala.inline
    def setAstNodeIdsNull: Self = this.set("astNodeIds", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
}
