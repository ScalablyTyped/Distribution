package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
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
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerDetails(value: CrawlerNodeDetails): Self = StObject.set(x, "CrawlerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerDetailsUndefined: Self = StObject.set(x, "CrawlerDetails", js.undefined)
    
    @scala.inline
    def setJobDetails(value: JobNodeDetails): Self = StObject.set(x, "JobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDetailsUndefined: Self = StObject.set(x, "JobDetails", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTriggerDetails(value: TriggerNodeDetails): Self = StObject.set(x, "TriggerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerDetailsUndefined: Self = StObject.set(x, "TriggerDetails", js.undefined)
    
    @scala.inline
    def setType(value: NodeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUniqueId(value: NameString): Self = StObject.set(x, "UniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "UniqueId", js.undefined)
  }
}
