package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVehicleRequestItem extends StObject {
  
  /**
    * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing thing as a vehicle.
    */
  var associationBehavior: js.UndefOr[VehicleAssociationBehavior] = js.undefined
  
  /**
    * Static information about a vehicle in a key-value pair. For example: "engine Type" : "v6" 
    */
  var attributes: js.UndefOr[attributesMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create. 
    */
  var decoderManifestArn: arn
  
  /**
    * The ARN of the vehicle model (model manifest) to create the vehicle from.
    */
  var modelManifestArn: arn
  
  /**
    * Metadata which can be used to manage the vehicle.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The unique ID of the vehicle to create.
    */
  var vehicleName: typings.awsSdk.iotfleetwiseMod.vehicleName
}
object CreateVehicleRequestItem {
  
  inline def apply(decoderManifestArn: arn, modelManifestArn: arn, vehicleName: vehicleName): CreateVehicleRequestItem = {
    val __obj = js.Dynamic.literal(decoderManifestArn = decoderManifestArn.asInstanceOf[js.Any], modelManifestArn = modelManifestArn.asInstanceOf[js.Any], vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVehicleRequestItem]
  }
  
  extension [Self <: CreateVehicleRequestItem](x: Self) {
    
    inline def setAssociationBehavior(value: VehicleAssociationBehavior): Self = StObject.set(x, "associationBehavior", value.asInstanceOf[js.Any])
    
    inline def setAssociationBehaviorUndefined: Self = StObject.set(x, "associationBehavior", js.undefined)
    
    inline def setAttributes(value: attributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDecoderManifestArn(value: arn): Self = StObject.set(x, "decoderManifestArn", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
