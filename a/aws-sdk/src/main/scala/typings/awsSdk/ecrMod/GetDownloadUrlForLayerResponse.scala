package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDownloadUrlForLayerResponse extends StObject {
  
  /**
    * The pre-signed Amazon S3 download URL for the requested layer.
    */
  var downloadUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
}
object GetDownloadUrlForLayerResponse {
  
  @scala.inline
  def apply(): GetDownloadUrlForLayerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
  }
  
  @scala.inline
  implicit class GetDownloadUrlForLayerResponseMutableBuilder[Self <: GetDownloadUrlForLayerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUrl(value: Url): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
  }
}
