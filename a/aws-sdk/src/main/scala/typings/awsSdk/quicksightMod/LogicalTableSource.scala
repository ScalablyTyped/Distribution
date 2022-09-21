package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalTableSource extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the parent dataset.
    */
  var DataSetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Specifies the result of a join of two logical tables.
    */
  var JoinInstruction: js.UndefOr[typings.awsSdk.quicksightMod.JoinInstruction] = js.undefined
  
  /**
    * Physical table ID.
    */
  var PhysicalTableId: js.UndefOr[typings.awsSdk.quicksightMod.PhysicalTableId] = js.undefined
}
object LogicalTableSource {
  
  inline def apply(): LogicalTableSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalTableSource]
  }
  
  extension [Self <: LogicalTableSource](x: Self) {
    
    inline def setDataSetArn(value: Arn): Self = StObject.set(x, "DataSetArn", value.asInstanceOf[js.Any])
    
    inline def setDataSetArnUndefined: Self = StObject.set(x, "DataSetArn", js.undefined)
    
    inline def setJoinInstruction(value: JoinInstruction): Self = StObject.set(x, "JoinInstruction", value.asInstanceOf[js.Any])
    
    inline def setJoinInstructionUndefined: Self = StObject.set(x, "JoinInstruction", js.undefined)
    
    inline def setPhysicalTableId(value: PhysicalTableId): Self = StObject.set(x, "PhysicalTableId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalTableIdUndefined: Self = StObject.set(x, "PhysicalTableId", js.undefined)
  }
}
