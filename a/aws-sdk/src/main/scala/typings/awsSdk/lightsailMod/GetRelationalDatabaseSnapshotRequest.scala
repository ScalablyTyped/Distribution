package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseSnapshotRequest extends StObject {
  
  /**
    * The name of the database snapshot for which to get information.
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
}
object GetRelationalDatabaseSnapshotRequest {
  
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): GetRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotRequestMutableBuilder[Self <: GetRelationalDatabaseSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
  }
}
