package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobFlowsOutput extends StObject {
  
  /**
    * A list of job flows matching the parameters supplied.
    */
  var JobFlows: js.UndefOr[JobFlowDetailList] = js.native
}
object DescribeJobFlowsOutput {
  
  @scala.inline
  def apply(): DescribeJobFlowsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsOutput]
  }
  
  @scala.inline
  implicit class DescribeJobFlowsOutputMutableBuilder[Self <: DescribeJobFlowsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobFlows(value: JobFlowDetailList): Self = StObject.set(x, "JobFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowsUndefined: Self = StObject.set(x, "JobFlows", js.undefined)
    
    @scala.inline
    def setJobFlowsVarargs(value: JobFlowDetail*): Self = StObject.set(x, "JobFlows", js.Array(value :_*))
  }
}
