package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Snapshot instances. 
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}
object SnapshotMessage {
  
  @scala.inline
  def apply(): SnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotMessage]
  }
  
  @scala.inline
  implicit class SnapshotMessageMutableBuilder[Self <: SnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSnapshots(value: SnapshotList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value :_*))
  }
}
