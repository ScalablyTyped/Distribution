package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceSnapshotsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshots request.
    */
  var instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetInstanceSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetInstanceSnapshotsResult {
  
  inline def apply(): GetInstanceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceSnapshotsResult]
  }
  
  extension [Self <: GetInstanceSnapshotsResult](x: Self) {
    
    inline def setInstanceSnapshots(value: InstanceSnapshotList): Self = StObject.set(x, "instanceSnapshots", value.asInstanceOf[js.Any])
    
    inline def setInstanceSnapshotsUndefined: Self = StObject.set(x, "instanceSnapshots", js.undefined)
    
    inline def setInstanceSnapshotsVarargs(value: InstanceSnapshot*): Self = StObject.set(x, "instanceSnapshots", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
