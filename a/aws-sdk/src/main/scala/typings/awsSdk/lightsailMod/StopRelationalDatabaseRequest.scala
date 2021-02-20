package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of your database to stop.
    */
  var relationalDatabaseName: ResourceName = js.native
  
  /**
    * The name of your new database snapshot to be created before stopping your database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
}
object StopRelationalDatabaseRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StopRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit class StopRelationalDatabaseRequestMutableBuilder[Self <: StopRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotNameUndefined: Self = StObject.set(x, "relationalDatabaseSnapshotName", js.undefined)
  }
}
