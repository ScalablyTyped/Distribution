package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservedNodeExchangeConfigurationOptionsInputMessage extends StObject {
  
  /**
    * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a snapshot or a resize.
    */
  var ActionType: ReservedNodeExchangeActionType
  
  /**
    * The identifier for the cluster that is the source for a reserved-node exchange.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * An optional pagination token provided by a previous GetReservedNodeExchangeConfigurationOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a Marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier for the snapshot that is the source for the reserved-node exchange.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object GetReservedNodeExchangeConfigurationOptionsInputMessage {
  
  inline def apply(ActionType: ReservedNodeExchangeActionType): GetReservedNodeExchangeConfigurationOptionsInputMessage = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeConfigurationOptionsInputMessage]
  }
  
  extension [Self <: GetReservedNodeExchangeConfigurationOptionsInputMessage](x: Self) {
    
    inline def setActionType(value: ReservedNodeExchangeActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
  }
}
