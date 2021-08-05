package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationRestoreConfiguration extends StObject {
  
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreType
  
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName] = js.undefined
}
object ApplicationRestoreConfiguration {
  
  inline def apply(ApplicationRestoreType: ApplicationRestoreType): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
  
  extension [Self <: ApplicationRestoreConfiguration](x: Self) {
    
    inline def setApplicationRestoreType(value: ApplicationRestoreType): Self = StObject.set(x, "ApplicationRestoreType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
  }
}
