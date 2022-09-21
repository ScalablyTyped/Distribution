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
  
  inline def apply(): BatchGetDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
  }
  
  extension [Self <: BatchGetDeploymentInstancesOutput](x: Self) {
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setInstancesSummary(value: InstanceSummaryList): Self = StObject.set(x, "instancesSummary", value.asInstanceOf[js.Any])
    
    inline def setInstancesSummaryUndefined: Self = StObject.set(x, "instancesSummary", js.undefined)
    
    inline def setInstancesSummaryVarargs(value: InstanceSummary*): Self = StObject.set(x, "instancesSummary", js.Array(value*))
  }
}
