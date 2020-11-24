package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioMixin extends js.Object {
  
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
  implicit class RadioMixinOps[Self <: RadioMixin] (val x: Self) extends AnyVal {
    
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
    def setBindEvents(value: js.Any): Self = this.set("bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindRequests(value: js.Any): Self = this.set("bindRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChannel(value: js.Any): Self = this.set("getChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindEvents(value: js.Any): Self = this.set("unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindRequests(value: js.Any): Self = this.set("unbindRequests", value.asInstanceOf[js.Any])
  }
}
