package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioMixinOptions extends js.Object {
  
  /**
    * Defines the Radio channel that will be used for the requests and/or
    * events.
    */
  var channelName: js.UndefOr[String] = js.native
  
  /**
    * Defines an events hash with the events to be listened and its respective
    * handlers.
    */
  var radioEvents: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[js.Any] = js.native
}
object RadioMixinOptions {
  
  @scala.inline
  def apply(): RadioMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioMixinOptions]
  }
  
  @scala.inline
  implicit class RadioMixinOptionsOps[Self <: RadioMixinOptions] (val x: Self) extends AnyVal {
    
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
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setRadioEvents(value: js.Any): Self = this.set("radioEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioEvents: Self = this.set("radioEvents", js.undefined)
    
    @scala.inline
    def setRadioRequests(value: js.Any): Self = this.set("radioRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioRequests: Self = this.set("radioRequests", js.undefined)
  }
}
