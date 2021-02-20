package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSnapshotConfiguration extends StObject {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject = js.native
}
object ApplicationSnapshotConfiguration {
  
  @scala.inline
  def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationSnapshotConfigurationMutableBuilder[Self <: ApplicationSnapshotConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotsEnabled(value: BooleanObject): Self = StObject.set(x, "SnapshotsEnabled", value.asInstanceOf[js.Any])
  }
}
