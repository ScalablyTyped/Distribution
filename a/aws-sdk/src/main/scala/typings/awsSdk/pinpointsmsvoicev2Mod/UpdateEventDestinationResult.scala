package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventDestinationResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the ConfigurationSet that was updated.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * An EventDestination object containing the details of where events will be logged. 
    */
  var EventDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.EventDestination] = js.undefined
}
object UpdateEventDestinationResult {
  
  inline def apply(): UpdateEventDestinationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventDestinationResult]
  }
  
  extension [Self <: UpdateEventDestinationResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
