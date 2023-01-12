package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioMixinOptions extends StObject {
  
  /**
    * Defines the Radio channel that will be used for the requests and/or
    * events.
    */
  var channelName: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an events hash with the events to be listened and its respective
    * handlers.
    */
  var radioEvents: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[Any] = js.undefined
}
object RadioMixinOptions {
  
  inline def apply(): RadioMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioMixinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioMixinOptions] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setRadioEvents(value: Any): Self = StObject.set(x, "radioEvents", value.asInstanceOf[js.Any])
    
    inline def setRadioEventsUndefined: Self = StObject.set(x, "radioEvents", js.undefined)
    
    inline def setRadioRequests(value: Any): Self = StObject.set(x, "radioRequests", value.asInstanceOf[js.Any])
    
    inline def setRadioRequestsUndefined: Self = StObject.set(x, "radioRequests", js.undefined)
  }
}
