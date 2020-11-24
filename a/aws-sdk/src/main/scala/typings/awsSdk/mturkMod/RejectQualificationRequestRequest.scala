package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectQualificationRequestRequest extends js.Object {
  
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
  implicit class RejectQualificationRequestRequestOps[Self <: RejectQualificationRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQualificationRequestId(value: String): Self = this.set("QualificationRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
}
