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
  var NodeDeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateInitiatedBy] = js.undefined
  
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.NodeUpdateStatus] = js.undefined
  
  /**
    * The date when the NodeUpdateStatus was last modified&gt;
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[js.Date] = js.undefined
}
object CacheNodeUpdateStatus {
  
  inline def apply(): CacheNodeUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeUpdateStatus]
  }
  
  extension [Self <: CacheNodeUpdateStatus](x: Self) {
    
    inline def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    inline def setNodeDeletionDate(value: js.Date): Self = StObject.set(x, "NodeDeletionDate", value.asInstanceOf[js.Any])
    
    inline def setNodeDeletionDateUndefined: Self = StObject.set(x, "NodeDeletionDate", js.undefined)
    
    inline def setNodeUpdateEndDate(value: js.Date): Self = StObject.set(x, "NodeUpdateEndDate", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateEndDateUndefined: Self = StObject.set(x, "NodeUpdateEndDate", js.undefined)
    
    inline def setNodeUpdateInitiatedBy(value: NodeUpdateInitiatedBy): Self = StObject.set(x, "NodeUpdateInitiatedBy", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateInitiatedByUndefined: Self = StObject.set(x, "NodeUpdateInitiatedBy", js.undefined)
    
    inline def setNodeUpdateInitiatedDate(value: js.Date): Self = StObject.set(x, "NodeUpdateInitiatedDate", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateInitiatedDateUndefined: Self = StObject.set(x, "NodeUpdateInitiatedDate", js.undefined)
    
    inline def setNodeUpdateStartDate(value: js.Date): Self = StObject.set(x, "NodeUpdateStartDate", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateStartDateUndefined: Self = StObject.set(x, "NodeUpdateStartDate", js.undefined)
    
    inline def setNodeUpdateStatus(value: NodeUpdateStatus): Self = StObject.set(x, "NodeUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateStatusModifiedDate(value: js.Date): Self = StObject.set(x, "NodeUpdateStatusModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setNodeUpdateStatusModifiedDateUndefined: Self = StObject.set(x, "NodeUpdateStatusModifiedDate", js.undefined)
    
    inline def setNodeUpdateStatusUndefined: Self = StObject.set(x, "NodeUpdateStatus", js.undefined)
  }
}
