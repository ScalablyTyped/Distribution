package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshotMessage extends StObject {
  
  /**
    * Provides a list of DB cluster snapshots for the user.
    */
  var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterSnapshotMessage {
  
  inline def apply(): DBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotMessage]
  }
  
  extension [Self <: DBClusterSnapshotMessage](x: Self) {
    
    inline def setDBClusterSnapshots(value: DBClusterSnapshotList): Self = StObject.set(x, "DBClusterSnapshots", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotsUndefined: Self = StObject.set(x, "DBClusterSnapshots", js.undefined)
    
    inline def setDBClusterSnapshotsVarargs(value: DBClusterSnapshot*): Self = StObject.set(x, "DBClusterSnapshots", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
