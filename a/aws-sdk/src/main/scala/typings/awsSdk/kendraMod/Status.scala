package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  /**
    * The unique identifier of the document.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.kendraMod.DocumentId] = js.undefined
  
  /**
    * The current status of a document. If the document was submitted for deletion, the status is NOT_FOUND after the document is deleted.
    */
  var DocumentStatus: js.UndefOr[typings.awsSdk.kendraMod.DocumentStatus] = js.undefined
  
  /**
    * Indicates the source of the error.
    */
  var FailureCode: js.UndefOr[String] = js.undefined
  
  /**
    * Provides detailed information about why the document couldn't be indexed. Use this information to correct the error before you resubmit the document for indexing.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setDocumentStatus(value: DocumentStatus): Self = StObject.set(x, "DocumentStatus", value.asInstanceOf[js.Any])
    
    inline def setDocumentStatusUndefined: Self = StObject.set(x, "DocumentStatus", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
  }
}
