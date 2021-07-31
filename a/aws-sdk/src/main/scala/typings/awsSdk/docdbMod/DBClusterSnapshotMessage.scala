package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshotMessage extends StObject {
  
  /**
    * Provides a list of cluster snapshots.
    */
  var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterSnapshotMessage {
  
  @scala.inline
  def apply(): DBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class DBClusterSnapshotMessageMutableBuilder[Self <: DBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshots(value: DBClusterSnapshotList): Self = StObject.set(x, "DBClusterSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotsUndefined: Self = StObject.set(x, "DBClusterSnapshots", js.undefined)
    
    @scala.inline
    def setDBClusterSnapshotsVarargs(value: DBClusterSnapshot*): Self = StObject.set(x, "DBClusterSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
