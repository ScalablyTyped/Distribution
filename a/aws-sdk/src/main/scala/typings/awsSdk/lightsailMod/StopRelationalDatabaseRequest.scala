package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRelationalDatabaseRequest extends js.Object {
  
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
  implicit class StopRelationalDatabaseRequestOps[Self <: StopRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = this.set("relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationalDatabaseSnapshotName: Self = this.set("relationalDatabaseSnapshotName", js.undefined)
  }
}
