package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifyDocumentRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: DocumentClassifierEndpointArn = js.native
  
  /**
    * The document text to be analyzed.
    */
  var Text: CustomerInputString = js.native
}
object ClassifyDocumentRequest {
  
  @scala.inline
  def apply(EndpointArn: DocumentClassifierEndpointArn, Text: CustomerInputString): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
  
  @scala.inline
  implicit class ClassifyDocumentRequestMutableBuilder[Self <: ClassifyDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: DocumentClassifierEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
