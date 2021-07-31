package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSnapshotMessage extends StObject {
  
  /**
    *  A list of DBSnapshot instances. 
    */
  var DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBSnapshotMessage {
  
  @scala.inline
  def apply(): DBSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshotMessage]
  }
  
  @scala.inline
  implicit class DBSnapshotMessageMutableBuilder[Self <: DBSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshots(value: DBSnapshotList): Self = StObject.set(x, "DBSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotsUndefined: Self = StObject.set(x, "DBSnapshots", js.undefined)
    
    @scala.inline
    def setDBSnapshotsVarargs(value: DBSnapshot*): Self = StObject.set(x, "DBSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
