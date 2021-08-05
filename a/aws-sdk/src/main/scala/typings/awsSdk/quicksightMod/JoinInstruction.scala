package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinInstruction extends StObject {
  
  /**
    * Left operand.
    */
  var LeftOperand: LogicalTableId
  
  /**
    * On Clause.
    */
  var OnClause: typings.awsSdk.quicksightMod.OnClause
  
  /**
    * Right operand.
    */
  var RightOperand: LogicalTableId
  
  /**
    * Type.
    */
  var Type: JoinType
}
object JoinInstruction {
  
  inline def apply(LeftOperand: LogicalTableId, OnClause: OnClause, RightOperand: LogicalTableId, Type: JoinType): JoinInstruction = {
    val __obj = js.Dynamic.literal(LeftOperand = LeftOperand.asInstanceOf[js.Any], OnClause = OnClause.asInstanceOf[js.Any], RightOperand = RightOperand.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinInstruction]
  }
  
  extension [Self <: JoinInstruction](x: Self) {
    
    inline def setLeftOperand(value: LogicalTableId): Self = StObject.set(x, "LeftOperand", value.asInstanceOf[js.Any])
    
    inline def setOnClause(value: OnClause): Self = StObject.set(x, "OnClause", value.asInstanceOf[js.Any])
    
    inline def setRightOperand(value: LogicalTableId): Self = StObject.set(x, "RightOperand", value.asInstanceOf[js.Any])
    
    inline def setType(value: JoinType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
