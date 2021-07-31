package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentClassifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. The operation returns this identifier in its response.
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn
}
object DescribeDocumentClassifierRequest {
  
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): DescribeDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentClassifierRequest]
  }
  
  @scala.inline
  implicit class DescribeDocumentClassifierRequestMutableBuilder[Self <: DescribeDocumentClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
}
