package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  /**
    * Details of the crawler when the node represents a crawler.
    */
  var CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.native
  
  /**
    * Details of the Job when the node represents a Job.
    */
  var JobDetails: js.UndefOr[JobNodeDetails] = js.native
  
  /**
    * The name of the AWS Glue component represented by the node.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * Details of the Trigger when the node represents a Trigger.
    */
  var TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.native
  
  /**
    * The type of AWS Glue component represented by the node.
    */
  var Type: js.UndefOr[NodeType] = js.native
  
  /**
    * The unique Id assigned to the node within the workflow.
    */
  var UniqueId: js.UndefOr[NameString] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrawlerDetails(value: CrawlerNodeDetails): Self = this.set("CrawlerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlerDetails: Self = this.set("CrawlerDetails", js.undefined)
    
    @scala.inline
    def setJobDetails(value: JobNodeDetails): Self = this.set("JobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobDetails: Self = this.set("JobDetails", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setTriggerDetails(value: TriggerNodeDetails): Self = this.set("TriggerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerDetails: Self = this.set("TriggerDetails", js.undefined)
    
    @scala.inline
    def setType(value: NodeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUniqueId(value: NameString): Self = this.set("UniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueId: Self = this.set("UniqueId", js.undefined)
  }
}
