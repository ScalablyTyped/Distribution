package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectQualificationRequestRequest extends StObject {
  
  /**
    *  The ID of the Qualification request, as returned by the ListQualificationRequests operation. 
    */
  var QualificationRequestId: String
  
  /**
    * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
    */
  var Reason: js.UndefOr[String] = js.undefined
}
object RejectQualificationRequestRequest {
  
  inline def apply(QualificationRequestId: String): RejectQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectQualificationRequestRequest]
  }
  
  extension [Self <: RejectQualificationRequestRequest](x: Self) {
    
    inline def setQualificationRequestId(value: String): Self = StObject.set(x, "QualificationRequestId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
