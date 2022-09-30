package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVehicleResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the vehicle to retrieve information about. 
    */
  var arn: js.UndefOr[typings.awsSdk.iotfleetwiseMod.arn] = js.undefined
  
  /**
    * Static information about a vehicle in a key-value pair. For example:  "engineType" : "1.3 L R2" 
    */
  var attributes: js.UndefOr[attributesMap] = js.undefined
  
  /**
    *  The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of a decoder manifest associated with the vehicle. 
    */
  var decoderManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    *  The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of a vehicle model (model manifest) associated with the vehicle. 
    */
  var modelManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The ID of the vehicle.
    */
  var vehicleName: js.UndefOr[typings.awsSdk.iotfleetwiseMod.vehicleName] = js.undefined
}
object GetVehicleResponse {
  
  inline def apply(): GetVehicleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVehicleResponse]
  }
  
  extension [Self <: GetVehicleResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAttributes(value: attributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDecoderManifestArn(value: arn): Self = StObject.set(x, "decoderManifestArn", value.asInstanceOf[js.Any])
    
    inline def setDecoderManifestArnUndefined: Self = StObject.set(x, "decoderManifestArn", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArnUndefined: Self = StObject.set(x, "modelManifestArn", js.undefined)
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
    
    inline def setVehicleNameUndefined: Self = StObject.set(x, "vehicleName", js.undefined)
  }
}
