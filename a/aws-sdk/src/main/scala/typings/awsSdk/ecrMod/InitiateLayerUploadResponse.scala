package typings.awsSdk.ecrMod

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
  
  @scala.inline
  def apply(): InitiateLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateLayerUploadResponse]
  }
  
  @scala.inline
  implicit class InitiateLayerUploadResponseMutableBuilder[Self <: InitiateLayerUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartSize(value: PartSize): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
