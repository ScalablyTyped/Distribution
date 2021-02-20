package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadEntityDefinitionsResponse extends StObject {
  
  /**
    * The ID that specifies the upload action. You can use this to track the status of the upload.
    */
  var uploadId: UploadId = js.native
}
object UploadEntityDefinitionsResponse {
  
  @scala.inline
  def apply(uploadId: UploadId): UploadEntityDefinitionsResponse = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadEntityDefinitionsResponse]
  }
  
  @scala.inline
  implicit class UploadEntityDefinitionsResponseMutableBuilder[Self <: UploadEntityDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
