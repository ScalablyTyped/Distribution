package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDecoderManifestRequest extends StObject {
  
  /**
    *  A brief description of the decoder manifest. 
    */
  var description: js.UndefOr[typings.awsSdk.iotfleetwiseMod.description] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the vehicle model (model manifest). 
    */
  var modelManifestArn: arn
  
  /**
    *  The unique name of the decoder manifest to create.
    */
  var name: resourceName
  
  /**
    *  A list of information about available network interfaces. 
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    *  A list of information about signal decoders. 
    */
  var signalDecoders: js.UndefOr[SignalDecoders] = js.undefined
  
  /**
    * Metadata that can be used to manage the decoder manifest.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateDecoderManifestRequest {
  
  inline def apply(modelManifestArn: arn, name: resourceName): CreateDecoderManifestRequest = {
    val __obj = js.Dynamic.literal(modelManifestArn = modelManifestArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDecoderManifestRequest]
  }
  
  extension [Self <: CreateDecoderManifestRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setSignalDecoders(value: SignalDecoders): Self = StObject.set(x, "signalDecoders", value.asInstanceOf[js.Any])
    
    inline def setSignalDecodersUndefined: Self = StObject.set(x, "signalDecoders", js.undefined)
    
    inline def setSignalDecodersVarargs(value: SignalDecoder*): Self = StObject.set(x, "signalDecoders", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
