package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEventBusResponse extends js.Object {
  
  /**
    * The ARN of the new event bus.
    */
  var EventBusArn: js.UndefOr[String] = js.native
}
object CreateEventBusResponse {
  
  @scala.inline
  def apply(): CreateEventBusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventBusResponse]
  }
  
  @scala.inline
  implicit class CreateEventBusResponseOps[Self <: CreateEventBusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventBusArn(value: String): Self = this.set("EventBusArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusArn: Self = this.set("EventBusArn", js.undefined)
  }
}
