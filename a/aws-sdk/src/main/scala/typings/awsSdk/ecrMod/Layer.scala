package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends StObject {
  
  /**
    * The availability status of the image layer.
    */
  var layerAvailability: js.UndefOr[LayerAvailability] = js.native
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
  
  /**
    * The size, in bytes, of the image layer.
    */
  var layerSize: js.UndefOr[LayerSizeInBytes] = js.native
  
  /**
    * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
    */
  var mediaType: js.UndefOr[MediaType] = js.native
}
object Layer {
  
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerAvailability(value: LayerAvailability): Self = StObject.set(x, "layerAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerAvailabilityUndefined: Self = StObject.set(x, "layerAvailability", js.undefined)
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
    
    @scala.inline
    def setLayerSize(value: LayerSizeInBytes): Self = StObject.set(x, "layerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerSizeUndefined: Self = StObject.set(x, "layerSize", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
