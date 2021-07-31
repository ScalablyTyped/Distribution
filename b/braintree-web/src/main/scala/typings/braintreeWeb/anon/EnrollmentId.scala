package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentId extends StObject {
  
  var card: js.Any
  
  var enrollmentId: String
  
  var hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields
  
  var smsCode: String
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
  implicit class EnrollmentIdMutableBuilder[Self <: EnrollmentId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: js.Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentId(value: String): Self = StObject.set(x, "enrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedFields(value: typings.braintreeWeb.hostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsCode(value: String): Self = StObject.set(x, "smsCode", value.asInstanceOf[js.Any])
  }
}
