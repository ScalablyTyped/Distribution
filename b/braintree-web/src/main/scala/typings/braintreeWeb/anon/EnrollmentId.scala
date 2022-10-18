package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentId extends StObject {
  
  var card: Any
  
  var enrollmentId: String
  
  var hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields
  
  var smsCode: String
}
object EnrollmentId {
  
  inline def apply(
    card: Any,
    enrollmentId: String,
    hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields,
    smsCode: String
  ): EnrollmentId = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], enrollmentId = enrollmentId.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], smsCode = smsCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrollmentId]
  }
  
  extension [Self <: EnrollmentId](x: Self) {
    
    inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentId(value: String): Self = StObject.set(x, "enrollmentId", value.asInstanceOf[js.Any])
    
    inline def setHostedFields(value: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
    
    inline def setSmsCode(value: String): Self = StObject.set(x, "smsCode", value.asInstanceOf[js.Any])
  }
}
