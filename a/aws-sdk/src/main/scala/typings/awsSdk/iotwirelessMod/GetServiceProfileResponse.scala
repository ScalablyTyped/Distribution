package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[ServiceProfileArn] = js.undefined
  
  /**
    * The ID of the service profile.
    */
  var Id: js.UndefOr[ServiceProfileId] = js.undefined
  
  /**
    * Information about the service profile.
    */
  var LoRaWAN: js.UndefOr[LoRaWANGetServiceProfileInfo] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ServiceProfileName] = js.undefined
}
object GetServiceProfileResponse {
  
  inline def apply(): GetServiceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceProfileResponse]
  }
  
  extension [Self <: GetServiceProfileResponse](x: Self) {
    
    inline def setArn(value: ServiceProfileArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ServiceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANGetServiceProfileInfo): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: ServiceProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
