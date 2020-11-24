package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAlexaOfferToMasterResponse extends js.Object {
  
  /**
    * The base64-encoded SDP answer content.
    */
  var Answer: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Answer] = js.native
}
object SendAlexaOfferToMasterResponse {
  
  @scala.inline
  def apply(): SendAlexaOfferToMasterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
  }
  
  @scala.inline
  implicit class SendAlexaOfferToMasterResponseOps[Self <: SendAlexaOfferToMasterResponse] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: Answer): Self = this.set("Answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswer: Self = this.set("Answer", js.undefined)
  }
}
