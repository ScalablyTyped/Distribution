package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunJobFlowOutput extends js.Object {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * An unique identifier for the job flow.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.native
}
object RunJobFlowOutput {
  
  @scala.inline
  def apply(): RunJobFlowOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunJobFlowOutput]
  }
  
  @scala.inline
  implicit class RunJobFlowOutputOps[Self <: RunJobFlowOutput] (val x: Self) extends AnyVal {
    
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
    def setClusterArn(value: ArnType): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = this.set("JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFlowId: Self = this.set("JobFlowId", js.undefined)
  }
}
