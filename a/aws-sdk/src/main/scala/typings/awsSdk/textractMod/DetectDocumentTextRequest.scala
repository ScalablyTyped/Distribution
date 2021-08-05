package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectDocumentTextRequest extends StObject {
  
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG or PNG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typings.awsSdk.textractMod.Document
}
object DetectDocumentTextRequest {
  
  inline def apply(Document: Document): DetectDocumentTextRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDocumentTextRequest]
  }
  
  extension [Self <: DetectDocumentTextRequest](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
  }
}
