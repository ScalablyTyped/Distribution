package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationSnapshotRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The identifier of an application snapshot. You can retrieve this value using .
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName
}
object DescribeApplicationSnapshotRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): DescribeApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationSnapshotRequest]
  }
  
  @scala.inline
  implicit class DescribeApplicationSnapshotRequestMutableBuilder[Self <: DescribeApplicationSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
