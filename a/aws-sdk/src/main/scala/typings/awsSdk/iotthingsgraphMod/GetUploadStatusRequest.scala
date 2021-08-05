package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUploadStatusRequest extends StObject {
  
  /**
    * The ID of the upload. This value is returned by the UploadEntityDefinitions action.
    */
  var uploadId: UploadId
}
object GetUploadStatusRequest {
  
  inline def apply(uploadId: UploadId): GetUploadStatusRequest = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusRequest]
  }
  
  extension [Self <: GetUploadStatusRequest](x: Self) {
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
