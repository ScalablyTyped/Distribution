package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheNodeUpdateStatus extends StObject {
  
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateInitiatedBy] = js.undefined
  
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateStatus] = js.undefined
  
  /**
    * The date when the NodeUpdateStatus was last modified&gt;
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
}
object CacheNodeUpdateStatus {
  
  @scala.inline
  def apply(): CacheNodeUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeUpdateStatus]
  }
  
  @scala.inline
  implicit class CacheNodeUpdateStatusMutableBuilder[Self <: CacheNodeUpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    @scala.inline
    def setNodeDeletionDate(value: TStamp): Self = StObject.set(x, "NodeDeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDeletionDateUndefined: Self = StObject.set(x, "NodeDeletionDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateEndDate(value: TStamp): Self = StObject.set(x, "NodeUpdateEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateEndDateUndefined: Self = StObject.set(x, "NodeUpdateEndDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedBy(value: NodeUpdateInitiatedBy): Self = StObject.set(x, "NodeUpdateInitiatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateInitiatedByUndefined: Self = StObject.set(x, "NodeUpdateInitiatedBy", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedDate(value: TStamp): Self = StObject.set(x, "NodeUpdateInitiatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateInitiatedDateUndefined: Self = StObject.set(x, "NodeUpdateInitiatedDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStartDate(value: TStamp): Self = StObject.set(x, "NodeUpdateStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStartDateUndefined: Self = StObject.set(x, "NodeUpdateStartDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatus(value: NodeUpdateStatus): Self = StObject.set(x, "NodeUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStatusModifiedDate(value: TStamp): Self = StObject.set(x, "NodeUpdateStatusModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStatusModifiedDateUndefined: Self = StObject.set(x, "NodeUpdateStatusModifiedDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatusUndefined: Self = StObject.set(x, "NodeUpdateStatus", js.undefined)
  }
}
