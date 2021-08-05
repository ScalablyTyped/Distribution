package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationSnapshotResponse extends StObject {
  
  /**
    * An object containing information about the application snapshot.
    */
  var SnapshotDetails: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotDetails
}
object DescribeApplicationSnapshotResponse {
  
  inline def apply(SnapshotDetails: SnapshotDetails): DescribeApplicationSnapshotResponse = {
    val __obj = js.Dynamic.literal(SnapshotDetails = SnapshotDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
  }
  
  extension [Self <: DescribeApplicationSnapshotResponse](x: Self) {
    
    inline def setSnapshotDetails(value: SnapshotDetails): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
  }
}
