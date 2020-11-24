package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobFlowsOutput extends js.Object {
  
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
  implicit class DescribeJobFlowsOutputOps[Self <: DescribeJobFlowsOutput] (val x: Self) extends AnyVal {
    
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
    def setJobFlowsVarargs(value: JobFlowDetail*): Self = this.set("JobFlows", js.Array(value :_*))
    
    @scala.inline
    def setJobFlows(value: JobFlowDetailList): Self = this.set("JobFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFlows: Self = this.set("JobFlows", js.undefined)
  }
}
