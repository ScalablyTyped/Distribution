package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
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
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayerAvailability(value: LayerAvailability): Self = this.set("layerAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerAvailability: Self = this.set("layerAvailability", js.undefined)
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = this.set("layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerDigest: Self = this.set("layerDigest", js.undefined)
    
    @scala.inline
    def setLayerSize(value: LayerSizeInBytes): Self = this.set("layerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerSize: Self = this.set("layerSize", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaType): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
}
