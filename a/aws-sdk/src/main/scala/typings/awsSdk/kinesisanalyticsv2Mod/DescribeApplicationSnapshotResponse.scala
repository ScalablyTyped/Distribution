package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationSnapshotResponse extends js.Object {
  
  /**
    * An object containing information about the application snapshot.
    */
  var SnapshotDetails: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotDetails = js.native
}
object DescribeApplicationSnapshotResponse {
  
  @scala.inline
  def apply(SnapshotDetails: SnapshotDetails): DescribeApplicationSnapshotResponse = {
    val __obj = js.Dynamic.literal(SnapshotDetails = SnapshotDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
  }
  
  @scala.inline
  implicit class DescribeApplicationSnapshotResponseOps[Self <: DescribeApplicationSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setSnapshotDetails(value: SnapshotDetails): Self = this.set("SnapshotDetails", value.asInstanceOf[js.Any])
  }
}
