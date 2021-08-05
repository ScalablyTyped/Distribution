package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTrainingDocumentClassifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn
}
object StopTrainingDocumentClassifierRequest {
  
  inline def apply(DocumentClassifierArn: DocumentClassifierArn): StopTrainingDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingDocumentClassifierRequest]
  }
  
  extension [Self <: StopTrainingDocumentClassifierRequest](x: Self) {
    
    inline def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
}
