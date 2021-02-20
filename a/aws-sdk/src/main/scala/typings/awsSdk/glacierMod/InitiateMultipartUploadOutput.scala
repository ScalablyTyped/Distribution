package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateMultipartUploadOutput extends StObject {
  
  /**
    * The relative URI path of the multipart upload ID Amazon S3 Glacier created.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The ID of the multipart upload. This value is also included as part of the location.
    */
  var uploadId: js.UndefOr[String] = js.native
}
object InitiateMultipartUploadOutput {
  
  @scala.inline
  def apply(): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
  
  @scala.inline
  implicit class InitiateMultipartUploadOutputMutableBuilder[Self <: InitiateMultipartUploadOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
