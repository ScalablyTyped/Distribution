package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobDocumentResponse extends StObject {
  
  /**
    * The job document content.
    */
  var document: js.UndefOr[JobDocument] = js.native
}
object GetJobDocumentResponse {
  
  @scala.inline
  def apply(): GetJobDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobDocumentResponse]
  }
  
  @scala.inline
  implicit class GetJobDocumentResponseMutableBuilder[Self <: GetJobDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
