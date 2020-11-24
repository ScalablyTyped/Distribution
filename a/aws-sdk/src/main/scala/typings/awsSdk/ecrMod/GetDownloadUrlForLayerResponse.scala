package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDownloadUrlForLayerResponse extends js.Object {
  
  /**
    * The pre-signed Amazon S3 download URL for the requested layer.
    */
  var downloadUrl: js.UndefOr[Url] = js.native
  
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
}
object GetDownloadUrlForLayerResponse {
  
  @scala.inline
  def apply(): GetDownloadUrlForLayerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
  }
  
  @scala.inline
  implicit class GetDownloadUrlForLayerResponseOps[Self <: GetDownloadUrlForLayerResponse] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: Url): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = this.set("layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerDigest: Self = this.set("layerDigest", js.undefined)
  }
}
