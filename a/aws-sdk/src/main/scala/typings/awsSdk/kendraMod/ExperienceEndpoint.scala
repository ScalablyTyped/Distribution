package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperienceEndpoint extends StObject {
  
  /**
    * The endpoint of your Amazon Kendra experience.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.kendraMod.Endpoint] = js.undefined
  
  /**
    * The type of endpoint for your Amazon Kendra experience. The type currently available is HOME, which is a unique and fully hosted URL to the home page of your Amazon Kendra experience.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.kendraMod.EndpointType] = js.undefined
}
object ExperienceEndpoint {
  
  inline def apply(): ExperienceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperienceEndpoint]
  }
  
  extension [Self <: ExperienceEndpoint](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
