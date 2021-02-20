package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiskSnapshotsResult extends StObject {
  
  /**
    * An array of objects containing information about all block storage disk snapshots.
    */
  var diskSnapshots: js.UndefOr[DiskSnapshotList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDiskSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetDiskSnapshotsResult {
  
  @scala.inline
  def apply(): GetDiskSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotsResult]
  }
  
  @scala.inline
  implicit class GetDiskSnapshotsResultMutableBuilder[Self <: GetDiskSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSnapshots(value: DiskSnapshotList): Self = StObject.set(x, "diskSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSnapshotsUndefined: Self = StObject.set(x, "diskSnapshots", js.undefined)
    
    @scala.inline
    def setDiskSnapshotsVarargs(value: DiskSnapshot*): Self = StObject.set(x, "diskSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
