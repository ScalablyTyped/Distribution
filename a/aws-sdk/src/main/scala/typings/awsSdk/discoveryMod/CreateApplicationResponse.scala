package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * Configuration ID of an application to be created.
    */
  var configurationId: js.UndefOr[String] = js.undefined
}
object CreateApplicationResponse {
  
  inline def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  extension [Self <: CreateApplicationResponse](x: Self) {
    
    inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
  }
}
