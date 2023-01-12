package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationAdjustment extends StObject {
  
  var amount: String
  
  var processorResponseCode: String
  
  var processorResponseText: String
  
  var processorResponseType: String
  
  var success: Boolean
  
  var timestamp: js.Date
}
object AuthorizationAdjustment {
  
  inline def apply(
    amount: String,
    processorResponseCode: String,
    processorResponseText: String,
    processorResponseType: String,
    success: Boolean,
    timestamp: js.Date
  ): AuthorizationAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], processorResponseCode = processorResponseCode.asInstanceOf[js.Any], processorResponseText = processorResponseText.asInstanceOf[js.Any], processorResponseType = processorResponseType.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationAdjustment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setProcessorResponseCode(value: String): Self = StObject.set(x, "processorResponseCode", value.asInstanceOf[js.Any])
    
    inline def setProcessorResponseText(value: String): Self = StObject.set(x, "processorResponseText", value.asInstanceOf[js.Any])
    
    inline def setProcessorResponseType(value: String): Self = StObject.set(x, "processorResponseType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
