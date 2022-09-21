package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioMixin extends StObject {
  
  var bindEvents: Any
  
  var bindRequests: Any
  
  var getChannel: Any
  
  var unbindEvents: Any
  
  var unbindRequests: Any
}
object RadioMixin {
  
  inline def apply(bindEvents: Any, bindRequests: Any, getChannel: Any, unbindEvents: Any, unbindRequests: Any): RadioMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], bindRequests = bindRequests.asInstanceOf[js.Any], getChannel = getChannel.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindRequests = unbindRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioMixin]
  }
  
  extension [Self <: RadioMixin](x: Self) {
    
    inline def setBindEvents(value: Any): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    inline def setBindRequests(value: Any): Self = StObject.set(x, "bindRequests", value.asInstanceOf[js.Any])
    
    inline def setGetChannel(value: Any): Self = StObject.set(x, "getChannel", value.asInstanceOf[js.Any])
    
    inline def setUnbindEvents(value: Any): Self = StObject.set(x, "unbindEvents", value.asInstanceOf[js.Any])
    
    inline def setUnbindRequests(value: Any): Self = StObject.set(x, "unbindRequests", value.asInstanceOf[js.Any])
  }
}
