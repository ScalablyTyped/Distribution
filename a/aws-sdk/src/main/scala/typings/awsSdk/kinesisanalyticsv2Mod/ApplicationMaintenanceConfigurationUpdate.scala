package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMaintenanceConfigurationUpdate extends StObject {
  
  /**
    * The updated start time for the maintenance window.
    */
  var ApplicationMaintenanceWindowStartTimeUpdate: ApplicationMaintenanceWindowStartTime
}
object ApplicationMaintenanceConfigurationUpdate {
  
  inline def apply(ApplicationMaintenanceWindowStartTimeUpdate: ApplicationMaintenanceWindowStartTime): ApplicationMaintenanceConfigurationUpdate = {
    val __obj = js.Dynamic.literal(ApplicationMaintenanceWindowStartTimeUpdate = ApplicationMaintenanceWindowStartTimeUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMaintenanceConfigurationUpdate]
  }
  
  extension [Self <: ApplicationMaintenanceConfigurationUpdate](x: Self) {
    
    inline def setApplicationMaintenanceWindowStartTimeUpdate(value: ApplicationMaintenanceWindowStartTime): Self = StObject.set(x, "ApplicationMaintenanceWindowStartTimeUpdate", value.asInstanceOf[js.Any])
  }
}
