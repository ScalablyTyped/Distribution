package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesMessageRequestMod.MessageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessagesInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
object SendMessagesInput {
  
  @scala.inline
  def apply(ApplicationId: String, MessageRequest: MessageRequest): SendMessagesInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesInput]
  }
}
