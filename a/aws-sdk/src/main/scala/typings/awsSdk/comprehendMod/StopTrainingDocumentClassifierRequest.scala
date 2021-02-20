package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTrainingDocumentClassifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn = js.native
}
object StopTrainingDocumentClassifierRequest {
  
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): StopTrainingDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingDocumentClassifierRequest]
  }
  
  @scala.inline
  implicit class StopTrainingDocumentClassifierRequestMutableBuilder[Self <: StopTrainingDocumentClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
}
