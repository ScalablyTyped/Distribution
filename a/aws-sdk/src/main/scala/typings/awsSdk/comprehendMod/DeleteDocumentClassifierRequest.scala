package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentClassifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn
}
object DeleteDocumentClassifierRequest {
  
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): DeleteDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentClassifierRequest]
  }
  
  @scala.inline
  implicit class DeleteDocumentClassifierRequestMutableBuilder[Self <: DeleteDocumentClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
}
