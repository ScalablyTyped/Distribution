package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNodeExchangeStatus extends StObject {
  
  /**
    * A date and time that indicate when the reserved-node exchange was requested.
    */
  var RequestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the reserved-node exchange request.
    */
  var ReservedNodeExchangeRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The source reserved-node count in the cluster.
    */
  var SourceReservedNodeCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier of the source reserved node.
    */
  var SourceReservedNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The source reserved-node type, for example ds2.xlarge.
    */
  var SourceReservedNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the reserved-node exchange request. Statuses include in-progress and requested.
    */
  var Status: js.UndefOr[ReservedNodeExchangeStatusType] = js.undefined
  
  /**
    * The count of target reserved nodes in the cluster.
    */
  var TargetReservedNodeCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier of the target reserved node offering.
    */
  var TargetReservedNodeOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The node type of the target reserved node, for example ra3.4xlarge.
    */
  var TargetReservedNodeType: js.UndefOr[String] = js.undefined
}
object ReservedNodeExchangeStatus {
  
  inline def apply(): ReservedNodeExchangeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeExchangeStatus]
  }
  
  extension [Self <: ReservedNodeExchangeStatus](x: Self) {
    
    inline def setRequestTime(value: js.Date): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    inline def setReservedNodeExchangeRequestId(value: String): Self = StObject.set(x, "ReservedNodeExchangeRequestId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeExchangeRequestIdUndefined: Self = StObject.set(x, "ReservedNodeExchangeRequestId", js.undefined)
    
    inline def setSourceReservedNodeCount(value: Integer): Self = StObject.set(x, "SourceReservedNodeCount", value.asInstanceOf[js.Any])
    
    inline def setSourceReservedNodeCountUndefined: Self = StObject.set(x, "SourceReservedNodeCount", js.undefined)
    
    inline def setSourceReservedNodeId(value: String): Self = StObject.set(x, "SourceReservedNodeId", value.asInstanceOf[js.Any])
    
    inline def setSourceReservedNodeIdUndefined: Self = StObject.set(x, "SourceReservedNodeId", js.undefined)
    
    inline def setSourceReservedNodeType(value: String): Self = StObject.set(x, "SourceReservedNodeType", value.asInstanceOf[js.Any])
    
    inline def setSourceReservedNodeTypeUndefined: Self = StObject.set(x, "SourceReservedNodeType", js.undefined)
    
    inline def setStatus(value: ReservedNodeExchangeStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetReservedNodeCount(value: Integer): Self = StObject.set(x, "TargetReservedNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeCountUndefined: Self = StObject.set(x, "TargetReservedNodeCount", js.undefined)
    
    inline def setTargetReservedNodeOfferingId(value: String): Self = StObject.set(x, "TargetReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeOfferingIdUndefined: Self = StObject.set(x, "TargetReservedNodeOfferingId", js.undefined)
    
    inline def setTargetReservedNodeType(value: String): Self = StObject.set(x, "TargetReservedNodeType", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeTypeUndefined: Self = StObject.set(x, "TargetReservedNodeType", js.undefined)
  }
}
