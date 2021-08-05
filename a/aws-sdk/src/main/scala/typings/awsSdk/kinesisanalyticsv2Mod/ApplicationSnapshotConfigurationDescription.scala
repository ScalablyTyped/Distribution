package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSnapshotConfigurationDescription extends StObject {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject
}
object ApplicationSnapshotConfigurationDescription {
  
  inline def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfigurationDescription = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfigurationDescription]
  }
  
  extension [Self <: ApplicationSnapshotConfigurationDescription](x: Self) {
    
    inline def setSnapshotsEnabled(value: BooleanObject): Self = StObject.set(x, "SnapshotsEnabled", value.asInstanceOf[js.Any])
  }
}
