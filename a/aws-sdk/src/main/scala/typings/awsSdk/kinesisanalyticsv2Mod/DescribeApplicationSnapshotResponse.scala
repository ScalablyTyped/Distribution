package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicationSnapshotResponse extends StObject {
  
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
  implicit class DescribeApplicationSnapshotResponseMutableBuilder[Self <: DescribeApplicationSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotDetails(value: SnapshotDetails): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
  }
}
