package typings.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsEventTypeMap extends StObject {
  
  var binAvailable: HostedFieldsBinPayload
  
  var blur: HostedFieldsEvent
  
  var cardTypeChange: HostedFieldsEvent
  
  var empty: HostedFieldsEvent
  
  var focus: HostedFieldsEvent
  
  var inputSubmitRequest: HostedFieldsEvent
  
  var notEmpty: HostedFieldsEvent
  
  var validityChange: HostedFieldsEvent
}
object HostedFieldsEventTypeMap {
  
  inline def apply(
    binAvailable: HostedFieldsBinPayload,
    blur: HostedFieldsEvent,
    cardTypeChange: HostedFieldsEvent,
    empty: HostedFieldsEvent,
    focus: HostedFieldsEvent,
    inputSubmitRequest: HostedFieldsEvent,
    notEmpty: HostedFieldsEvent,
    validityChange: HostedFieldsEvent
  ): HostedFieldsEventTypeMap = {
    val __obj = js.Dynamic.literal(binAvailable = binAvailable.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cardTypeChange = cardTypeChange.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], inputSubmitRequest = inputSubmitRequest.asInstanceOf[js.Any], notEmpty = notEmpty.asInstanceOf[js.Any], validityChange = validityChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsEventTypeMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsEventTypeMap] (val x: Self) extends AnyVal {
    
    inline def setBinAvailable(value: HostedFieldsBinPayload): Self = StObject.set(x, "binAvailable", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: HostedFieldsEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setCardTypeChange(value: HostedFieldsEvent): Self = StObject.set(x, "cardTypeChange", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: HostedFieldsEvent): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: HostedFieldsEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setInputSubmitRequest(value: HostedFieldsEvent): Self = StObject.set(x, "inputSubmitRequest", value.asInstanceOf[js.Any])
    
    inline def setNotEmpty(value: HostedFieldsEvent): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
    
    inline def setValidityChange(value: HostedFieldsEvent): Self = StObject.set(x, "validityChange", value.asInstanceOf[js.Any])
  }
}
