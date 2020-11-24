package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteSnapshotResponse extends js.Object {
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typings.awsSdk.ebsMod.Status] = js.native
}
object CompleteSnapshotResponse {
  
  @scala.inline
  def apply(): CompleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteSnapshotResponse]
  }
  
  @scala.inline
  implicit class CompleteSnapshotResponseOps[Self <: CompleteSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
