package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotCopyGrantResult extends js.Object {
  
  var SnapshotCopyGrant: js.UndefOr[typings.awsSdk.redshiftMod.SnapshotCopyGrant] = js.native
}
object CreateSnapshotCopyGrantResult {
  
  @scala.inline
  def apply(): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
  
  @scala.inline
  implicit class CreateSnapshotCopyGrantResultOps[Self <: CreateSnapshotCopyGrantResult] (val x: Self) extends AnyVal {
    
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
    def setSnapshotCopyGrant(value: SnapshotCopyGrant): Self = this.set("SnapshotCopyGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCopyGrant: Self = this.set("SnapshotCopyGrant", js.undefined)
  }
}
