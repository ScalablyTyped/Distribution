package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoreStateErrorItem extends js.Object {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The error.
    */
  var Error: js.UndefOr[EnableFastSnapshotRestoreStateError] = js.native
}
object EnableFastSnapshotRestoreStateErrorItem {
  
  @scala.inline
  def apply(): EnableFastSnapshotRestoreStateErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreStateErrorItem]
  }
  
  @scala.inline
  implicit class EnableFastSnapshotRestoreStateErrorItemOps[Self <: EnableFastSnapshotRestoreStateErrorItem] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setError(value: EnableFastSnapshotRestoreStateError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
  }
}
