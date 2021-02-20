package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectQualificationRequestRequest extends StObject {
  
  /**
    *  The ID of the Qualification request, as returned by the ListQualificationRequests operation. 
    */
  var QualificationRequestId: String = js.native
  
  /**
    * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
    */
  var Reason: js.UndefOr[String] = js.native
}
object RejectQualificationRequestRequest {
  
  @scala.inline
  def apply(QualificationRequestId: String): RejectQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectQualificationRequestRequest]
  }
  
  @scala.inline
  implicit class RejectQualificationRequestRequestMutableBuilder[Self <: RejectQualificationRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationRequestId(value: String): Self = StObject.set(x, "QualificationRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
