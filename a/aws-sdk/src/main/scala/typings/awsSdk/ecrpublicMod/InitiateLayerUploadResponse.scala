package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateLayerUploadResponse extends StObject {
  
  /**
    * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
    */
  var partSize: js.UndefOr[PartSize] = js.undefined
  
  /**
    * The upload ID for the layer upload. This parameter is passed to further UploadLayerPart and CompleteLayerUpload operations.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}
object InitiateLayerUploadResponse {
  
  inline def apply(): InitiateLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateLayerUploadResponse]
  }
  
  extension [Self <: InitiateLayerUploadResponse](x: Self) {
    
    inline def setPartSize(value: PartSize): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
