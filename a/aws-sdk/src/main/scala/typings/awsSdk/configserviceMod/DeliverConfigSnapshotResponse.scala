package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverConfigSnapshotResponse extends js.Object {
  
  /**
    * The ID of the snapshot that is being created.
    */
  var configSnapshotId: js.UndefOr[String] = js.native
}
object DeliverConfigSnapshotResponse {
  
  @scala.inline
  def apply(): DeliverConfigSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverConfigSnapshotResponse]
  }
  
  @scala.inline
  implicit class DeliverConfigSnapshotResponseOps[Self <: DeliverConfigSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigSnapshotId(value: String): Self = this.set("configSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigSnapshotId: Self = this.set("configSnapshotId", js.undefined)
  }
}
