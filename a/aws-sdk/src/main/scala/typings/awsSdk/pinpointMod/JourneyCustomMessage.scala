package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyCustomMessage extends js.Object {
  
  /**
    * The message content that's passed to an AWS Lambda function or to a web hook.
    */
  var Data: js.UndefOr[string] = js.native
}
object JourneyCustomMessage {
  
  @scala.inline
  def apply(): JourneyCustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyCustomMessage]
  }
  
  @scala.inline
  implicit class JourneyCustomMessageOps[Self <: JourneyCustomMessage] (val x: Self) extends AnyVal {
    
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
    def setData(value: string): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
}
