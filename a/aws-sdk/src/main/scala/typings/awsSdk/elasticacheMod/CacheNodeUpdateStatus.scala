package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNodeUpdateStatus extends js.Object {
  
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[TStamp] = js.native
  
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateInitiatedBy] = js.native
  
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateStatus] = js.native
  
  /**
    * The date when the NodeUpdateStatus was last modified&gt;
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.native
}
object CacheNodeUpdateStatus {
  
  @scala.inline
  def apply(): CacheNodeUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeUpdateStatus]
  }
  
  @scala.inline
  implicit class CacheNodeUpdateStatusOps[Self <: CacheNodeUpdateStatus] (val x: Self) extends AnyVal {
    
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
    def setCacheNodeId(value: String): Self = this.set("CacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeId: Self = this.set("CacheNodeId", js.undefined)
    
    @scala.inline
    def setNodeDeletionDate(value: TStamp): Self = this.set("NodeDeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDeletionDate: Self = this.set("NodeDeletionDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateEndDate(value: TStamp): Self = this.set("NodeUpdateEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateEndDate: Self = this.set("NodeUpdateEndDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedBy(value: NodeUpdateInitiatedBy): Self = this.set("NodeUpdateInitiatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateInitiatedBy: Self = this.set("NodeUpdateInitiatedBy", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedDate(value: TStamp): Self = this.set("NodeUpdateInitiatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateInitiatedDate: Self = this.set("NodeUpdateInitiatedDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStartDate(value: TStamp): Self = this.set("NodeUpdateStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateStartDate: Self = this.set("NodeUpdateStartDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatus(value: NodeUpdateStatus): Self = this.set("NodeUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateStatus: Self = this.set("NodeUpdateStatus", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatusModifiedDate(value: TStamp): Self = this.set("NodeUpdateStatusModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeUpdateStatusModifiedDate: Self = this.set("NodeUpdateStatusModifiedDate", js.undefined)
  }
}
