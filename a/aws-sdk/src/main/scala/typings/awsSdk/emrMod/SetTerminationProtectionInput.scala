package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTerminationProtectionInput extends js.Object {
  
  /**
    *  A list of strings that uniquely identify the clusters to protect. This identifier is returned by RunJobFlow and can also be obtained from DescribeJobFlows . 
    */
  var JobFlowIds: XmlStringList = js.native
  
  /**
    * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from shutting down due to API calls, user intervention, or job-flow error.
    */
  var TerminationProtected: Boolean = js.native
}
object SetTerminationProtectionInput {
  
  @scala.inline
  def apply(JobFlowIds: XmlStringList, TerminationProtected: Boolean): SetTerminationProtectionInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any], TerminationProtected = TerminationProtected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTerminationProtectionInput]
  }
  
  @scala.inline
  implicit class SetTerminationProtectionInputOps[Self <: SetTerminationProtectionInput] (val x: Self) extends AnyVal {
    
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
    def setJobFlowIdsVarargs(value: XmlString*): Self = this.set("JobFlowIds", js.Array(value :_*))
    
    @scala.inline
    def setJobFlowIds(value: XmlStringList): Self = this.set("JobFlowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationProtected(value: Boolean): Self = this.set("TerminationProtected", value.asInstanceOf[js.Any])
  }
}
