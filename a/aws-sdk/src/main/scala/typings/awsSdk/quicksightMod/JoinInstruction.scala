package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinInstruction extends StObject {
  
  /**
    * Join key properties of the left operand.
    */
  var LeftJoinKeyProperties: js.UndefOr[JoinKeyProperties] = js.undefined
  
  /**
    * The operand on the left side of a join.
    */
  var LeftOperand: LogicalTableId
  
  /**
    * The join instructions provided in the ON clause of a join.
    */
  var OnClause: typings.awsSdk.quicksightMod.OnClause
  
  /**
    * Join key properties of the right operand.
    */
  var RightJoinKeyProperties: js.UndefOr[JoinKeyProperties] = js.undefined
  
  /**
    * The operand on the right side of a join.
    */
  var RightOperand: LogicalTableId
  
  /**
    * The type of join that it is.
    */
  var Type: JoinType
}
object JoinInstruction {
  
  inline def apply(LeftOperand: LogicalTableId, OnClause: OnClause, RightOperand: LogicalTableId, Type: JoinType): JoinInstruction = {
    val __obj = js.Dynamic.literal(LeftOperand = LeftOperand.asInstanceOf[js.Any], OnClause = OnClause.asInstanceOf[js.Any], RightOperand = RightOperand.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinInstruction]
  }
  
  extension [Self <: JoinInstruction](x: Self) {
    
    inline def setLeftJoinKeyProperties(value: JoinKeyProperties): Self = StObject.set(x, "LeftJoinKeyProperties", value.asInstanceOf[js.Any])
    
    inline def setLeftJoinKeyPropertiesUndefined: Self = StObject.set(x, "LeftJoinKeyProperties", js.undefined)
    
    inline def setLeftOperand(value: LogicalTableId): Self = StObject.set(x, "LeftOperand", value.asInstanceOf[js.Any])
    
    inline def setOnClause(value: OnClause): Self = StObject.set(x, "OnClause", value.asInstanceOf[js.Any])
    
    inline def setRightJoinKeyProperties(value: JoinKeyProperties): Self = StObject.set(x, "RightJoinKeyProperties", value.asInstanceOf[js.Any])
    
    inline def setRightJoinKeyPropertiesUndefined: Self = StObject.set(x, "RightJoinKeyProperties", js.undefined)
    
    inline def setRightOperand(value: LogicalTableId): Self = StObject.set(x, "RightOperand", value.asInstanceOf[js.Any])
    
    inline def setType(value: JoinType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
