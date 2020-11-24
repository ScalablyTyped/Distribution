package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinInstruction extends js.Object {
  
  /**
    * Left operand.
    */
  var LeftOperand: LogicalTableId = js.native
  
  /**
    * On Clause.
    */
  var OnClause: typings.awsSdk.quicksightMod.OnClause = js.native
  
  /**
    * Right operand.
    */
  var RightOperand: LogicalTableId = js.native
  
  /**
    * Type.
    */
  var Type: JoinType = js.native
}
object JoinInstruction {
  
  @scala.inline
  def apply(LeftOperand: LogicalTableId, OnClause: OnClause, RightOperand: LogicalTableId, Type: JoinType): JoinInstruction = {
    val __obj = js.Dynamic.literal(LeftOperand = LeftOperand.asInstanceOf[js.Any], OnClause = OnClause.asInstanceOf[js.Any], RightOperand = RightOperand.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinInstruction]
  }
  
  @scala.inline
  implicit class JoinInstructionOps[Self <: JoinInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLeftOperand(value: LogicalTableId): Self = this.set("LeftOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClause(value: OnClause): Self = this.set("OnClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOperand(value: LogicalTableId): Self = this.set("RightOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JoinType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
