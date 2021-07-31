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
  var radioEvents: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[js.Any] = js.undefined
}
object RadioMixinOptions {
  
  @scala.inline
  def apply(): RadioMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioMixinOptions]
  }
  
  @scala.inline
  implicit class RadioMixinOptionsMutableBuilder[Self <: RadioMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    @scala.inline
    def setRadioEvents(value: js.Any): Self = StObject.set(x, "radioEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioEventsUndefined: Self = StObject.set(x, "radioEvents", js.undefined)
    
    @scala.inline
    def setRadioRequests(value: js.Any): Self = StObject.set(x, "radioRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioRequestsUndefined: Self = StObject.set(x, "radioRequests", js.undefined)
  }
}
