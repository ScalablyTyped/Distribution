package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobFlowsOutput extends StObject {
  
  /**
    * A list of job flows matching the parameters supplied.
    */
  var JobFlows: js.UndefOr[JobFlowDetailList] = js.undefined
}
object DescribeJobFlowsOutput {
  
  inline def apply(): DescribeJobFlowsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsOutput]
  }
  
  extension [Self <: DescribeJobFlowsOutput](x: Self) {
    
    inline def setJobFlows(value: JobFlowDetailList): Self = StObject.set(x, "JobFlows", value.asInstanceOf[js.Any])
    
    inline def setJobFlowsUndefined: Self = StObject.set(x, "JobFlows", js.undefined)
    
    inline def setJobFlowsVarargs(value: JobFlowDetail*): Self = StObject.set(x, "JobFlows", js.Array(value :_*))
  }
}
