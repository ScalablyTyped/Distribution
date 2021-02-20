package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDocumentClassifierResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierArn] = js.native
}
object CreateDocumentClassifierResponse {
  
  @scala.inline
  def apply(): CreateDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentClassifierResponse]
  }
  
  @scala.inline
  implicit class CreateDocumentClassifierResponseMutableBuilder[Self <: CreateDocumentClassifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClassifierArnUndefined: Self = StObject.set(x, "DocumentClassifierArn", js.undefined)
  }
}
