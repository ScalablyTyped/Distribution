package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationMaintenanceConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The application maintenance configuration description after the update.
    */
  var ApplicationMaintenanceConfigurationDescription: js.UndefOr[
    typings.awsSdk.kinesisanalyticsv2Mod.ApplicationMaintenanceConfigurationDescription
  ] = js.undefined
}
object UpdateApplicationMaintenanceConfigurationResponse {
  
  inline def apply(): UpdateApplicationMaintenanceConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationMaintenanceConfigurationResponse]
  }
  
  extension [Self <: UpdateApplicationMaintenanceConfigurationResponse](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    inline def setApplicationMaintenanceConfigurationDescription(value: ApplicationMaintenanceConfigurationDescription): Self = StObject.set(x, "ApplicationMaintenanceConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationMaintenanceConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationMaintenanceConfigurationDescription", js.undefined)
  }
}
