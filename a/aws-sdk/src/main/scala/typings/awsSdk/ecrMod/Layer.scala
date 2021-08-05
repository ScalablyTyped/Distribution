package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /**
    * The availability status of the image layer.
    */
  var layerAvailability: js.UndefOr[LayerAvailability] = js.undefined
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
  
  /**
    * The size, in bytes, of the image layer.
    */
  var layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined
  
  /**
    * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
    */
  var mediaType: js.UndefOr[MediaType] = js.undefined
}
object Layer {
  
  inline def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setLayerAvailability(value: LayerAvailability): Self = StObject.set(x, "layerAvailability", value.asInstanceOf[js.Any])
    
    inline def setLayerAvailabilityUndefined: Self = StObject.set(x, "layerAvailability", js.undefined)
    
    inline def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    inline def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
    
    inline def setLayerSize(value: LayerSizeInBytes): Self = StObject.set(x, "layerSize", value.asInstanceOf[js.Any])
    
    inline def setLayerSizeUndefined: Self = StObject.set(x, "layerSize", js.undefined)
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
