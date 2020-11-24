package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampleChannelDataResponse extends js.Object {
  
  /**
    * The list of message samples. Each sample message is returned as a base64-encoded string.
    */
  var payloads: js.UndefOr[MessagePayloads] = js.native
}
object SampleChannelDataResponse {
  
  @scala.inline
  def apply(): SampleChannelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SampleChannelDataResponse]
  }
  
  @scala.inline
  implicit class SampleChannelDataResponseOps[Self <: SampleChannelDataResponse] (val x: Self) extends AnyVal {
    
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
    def setPayloadsVarargs(value: MessagePayload*): Self = this.set("payloads", js.Array(value :_*))
    
    @scala.inline
    def setPayloads(value: MessagePayloads): Self = this.set("payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloads: Self = this.set("payloads", js.undefined)
  }
}
