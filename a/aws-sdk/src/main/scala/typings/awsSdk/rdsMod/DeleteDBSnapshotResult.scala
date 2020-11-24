package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBSnapshotResult extends js.Object {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}
object DeleteDBSnapshotResult {
  
  @scala.inline
  def apply(): DeleteDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBSnapshotResult]
  }
  
  @scala.inline
  implicit class DeleteDBSnapshotResultOps[Self <: DeleteDBSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBSnapshot(value: DBSnapshot): Self = this.set("DBSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSnapshot: Self = this.set("DBSnapshot", js.undefined)
  }
}
