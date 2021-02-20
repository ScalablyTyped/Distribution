package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioMixin extends StObject {
  
  var bindEvents: js.Any = js.native
  
  var bindRequests: js.Any = js.native
  
  var getChannel: js.Any = js.native
  
  var unbindEvents: js.Any = js.native
  
  var unbindRequests: js.Any = js.native
}
object RadioMixin {
  
  @scala.inline
  def apply(
    bindEvents: js.Any,
    bindRequests: js.Any,
    getChannel: js.Any,
    unbindEvents: js.Any,
    unbindRequests: js.Any
  ): RadioMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], bindRequests = bindRequests.asInstanceOf[js.Any], getChannel = getChannel.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindRequests = unbindRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioMixin]
  }
  
  @scala.inline
  implicit class RadioMixinMutableBuilder[Self <: RadioMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindEvents(value: js.Any): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindRequests(value: js.Any): Self = StObject.set(x, "bindRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChannel(value: js.Any): Self = StObject.set(x, "getChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindEvents(value: js.Any): Self = StObject.set(x, "unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindRequests(value: js.Any): Self = StObject.set(x, "unbindRequests", value.asInstanceOf[js.Any])
  }
}
