package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrollmentId extends js.Object {
  
  var card: js.Any = js.native
  
  var enrollmentId: String = js.native
  
  var hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields = js.native
  
  var smsCode: String = js.native
}
object EnrollmentId {
  
  @scala.inline
  def apply(
    card: js.Any,
    enrollmentId: String,
    hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields,
    smsCode: String
  ): EnrollmentId = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], enrollmentId = enrollmentId.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], smsCode = smsCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrollmentId]
  }
  
  @scala.inline
  implicit class EnrollmentIdOps[Self <: EnrollmentId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCard(value: js.Any): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentId(value: String): Self = this.set("enrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedFields(value: typings.braintreeWeb.hostedFieldsMod.HostedFields): Self = this.set("hostedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsCode(value: String): Self = this.set("smsCode", value.asInstanceOf[js.Any])
  }
}
