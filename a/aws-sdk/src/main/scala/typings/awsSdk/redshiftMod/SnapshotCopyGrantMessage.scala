package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCopyGrantMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeSnapshotCopyGrant request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the SnapshotCopyGrantName parameter or the Marker parameter, but not both. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The list of SnapshotCopyGrant objects.
    */
  var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.native
}
object SnapshotCopyGrantMessage {
  
  @scala.inline
  def apply(): SnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCopyGrantMessage]
  }
  
  @scala.inline
  implicit class SnapshotCopyGrantMessageMutableBuilder[Self <: SnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrants(value: SnapshotCopyGrantList): Self = StObject.set(x, "SnapshotCopyGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantsUndefined: Self = StObject.set(x, "SnapshotCopyGrants", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantsVarargs(value: SnapshotCopyGrant*): Self = StObject.set(x, "SnapshotCopyGrants", js.Array(value :_*))
  }
}
