package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentInstancesOutput extends StObject {
  
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * Information about the instance.
    */
  var instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined
}
object BatchGetDeploymentInstancesOutput {
  
  @scala.inline
  def apply(): BatchGetDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentInstancesOutputMutableBuilder[Self <: BatchGetDeploymentInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setInstancesSummary(value: InstanceSummaryList): Self = StObject.set(x, "instancesSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesSummaryUndefined: Self = StObject.set(x, "instancesSummary", js.undefined)
    
    @scala.inline
    def setInstancesSummaryVarargs(value: InstanceSummary*): Self = StObject.set(x, "instancesSummary", js.Array(value :_*))
  }
}
