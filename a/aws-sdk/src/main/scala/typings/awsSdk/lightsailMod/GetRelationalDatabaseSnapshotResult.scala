package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseSnapshotResult extends js.Object {
  
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.native
}
object GetRelationalDatabaseSnapshotResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotResultOps[Self <: GetRelationalDatabaseSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setRelationalDatabaseSnapshot(value: RelationalDatabaseSnapshot): Self = this.set("relationalDatabaseSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationalDatabaseSnapshot: Self = this.set("relationalDatabaseSnapshot", js.undefined)
  }
}
