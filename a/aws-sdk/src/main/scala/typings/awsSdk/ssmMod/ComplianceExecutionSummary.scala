package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceExecutionSummary extends StObject {
  
  /**
    * An ID created by the system when PutComplianceItems was called. For example, CommandID is a valid execution ID. You can use this ID in subsequent calls.
    */
  var ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined
  
  /**
    * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionTime: DateTime
  
  /**
    * The type of execution. For example, Command is a valid execution type.
    */
  var ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined
}
object ComplianceExecutionSummary {
  
  @scala.inline
  def apply(ExecutionTime: DateTime): ComplianceExecutionSummary = {
    val __obj = js.Dynamic.literal(ExecutionTime = ExecutionTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceExecutionSummary]
  }
  
  @scala.inline
  implicit class ComplianceExecutionSummaryMutableBuilder[Self <: ComplianceExecutionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionId(value: ComplianceExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: DateTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: ComplianceExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTypeUndefined: Self = StObject.set(x, "ExecutionType", js.undefined)
  }
}
