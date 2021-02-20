package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinInstruction extends StObject {
  
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
  implicit class JoinInstructionMutableBuilder[Self <: JoinInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftOperand(value: LogicalTableId): Self = StObject.set(x, "LeftOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClause(value: OnClause): Self = StObject.set(x, "OnClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOperand(value: LogicalTableId): Self = StObject.set(x, "RightOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JoinType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
