package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyDocumentRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint. For information about endpoints, see Managing endpoints.
    */
  var EndpointArn: DocumentClassifierEndpointArn
  
  /**
    * The document text to be analyzed.
    */
  var Text: CustomerInputString
}
object ClassifyDocumentRequest {
  
  inline def apply(EndpointArn: DocumentClassifierEndpointArn, Text: CustomerInputString): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
  
  extension [Self <: ClassifyDocumentRequest](x: Self) {
    
    inline def setEndpointArn(value: DocumentClassifierEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
