package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceSnapshotResult extends js.Object {
  
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.native
}
object GetInstanceSnapshotResult {
  
  @scala.inline
  def apply(): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
  
  @scala.inline
  implicit class GetInstanceSnapshotResultOps[Self <: GetInstanceSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceSnapshot(value: InstanceSnapshot): Self = this.set("instanceSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceSnapshot: Self = this.set("instanceSnapshot", js.undefined)
  }
}
