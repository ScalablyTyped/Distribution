package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiConfig extends js.Object {
  
  var autoJoinPolicy: AutoJoinPolicy = js.native
  
  var defaultActionPolicy: DefaultActionPolicy = js.native
  
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit = js.native
  
  def sessionListener(session: Session): Unit = js.native
  
  var sessionRequest: SessionRequest = js.native
}
object ApiConfig {
  
  @scala.inline
  def apply(
    autoJoinPolicy: AutoJoinPolicy,
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Unit,
    sessionListener: Session => Unit,
    sessionRequest: SessionRequest
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any], defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1(receiverListener), sessionListener = js.Any.fromFunction1(sessionListener), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
  
  @scala.inline
  implicit class ApiConfigOps[Self <: ApiConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoJoinPolicy(value: AutoJoinPolicy): Self = this.set("autoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActionPolicy(value: DefaultActionPolicy): Self = this.set("defaultActionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverListener(value: ReceiverAvailability => Unit): Self = this.set("receiverListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionListener(value: Session => Unit): Self = this.set("sessionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionRequest(value: SessionRequest): Self = this.set("sessionRequest", value.asInstanceOf[js.Any])
  }
}
