package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThingShadowResponse extends js.Object {
  
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[JsonDocument] = js.native
}
object GetThingShadowResponse {
  
  @scala.inline
  def apply(): GetThingShadowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThingShadowResponse]
  }
  
  @scala.inline
  implicit class GetThingShadowResponseOps[Self <: GetThingShadowResponse] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: JsonDocument): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
