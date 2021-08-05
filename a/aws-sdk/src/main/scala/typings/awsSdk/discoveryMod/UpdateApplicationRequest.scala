package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * Configuration ID of the application to be updated.
    */
  var configurationId: ApplicationId
  
  /**
    * New description of the application to be updated.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * New name of the application to be updated.
    */
  var name: js.UndefOr[String] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(configurationId: ApplicationId): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setConfigurationId(value: ApplicationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
