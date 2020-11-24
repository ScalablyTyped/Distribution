package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateJobFlowsInput extends js.Object {
  
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList = js.native
}
object TerminateJobFlowsInput {
  
  @scala.inline
  def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
  
  @scala.inline
  implicit class TerminateJobFlowsInputOps[Self <: TerminateJobFlowsInput] (val x: Self) extends AnyVal {
    
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
  }
}
