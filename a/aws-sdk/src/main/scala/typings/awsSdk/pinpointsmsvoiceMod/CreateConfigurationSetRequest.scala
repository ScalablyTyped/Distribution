package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetRequest extends StObject {
  
  /**
    * The name that you want to give the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
}
object CreateConfigurationSetRequest {
  
  inline def apply(): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  extension [Self <: CreateConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: WordCharactersWithDelimiters): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
  }
}
