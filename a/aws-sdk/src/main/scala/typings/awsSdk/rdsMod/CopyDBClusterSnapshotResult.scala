package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBClusterSnapshotResult extends js.Object {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBClusterSnapshot] = js.native
}
object CopyDBClusterSnapshotResult {
  
  @scala.inline
  def apply(): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class CopyDBClusterSnapshotResultOps[Self <: CopyDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setDBClusterSnapshot(value: DBClusterSnapshot): Self = this.set("DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterSnapshot: Self = this.set("DBClusterSnapshot", js.undefined)
  }
}
