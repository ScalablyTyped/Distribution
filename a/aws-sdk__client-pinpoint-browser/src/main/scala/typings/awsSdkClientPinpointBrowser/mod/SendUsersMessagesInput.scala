package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod.SendUsersMessageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessagesInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
object SendUsersMessagesInput {
  
  inline def apply(ApplicationId: String, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesInput]
  }
}
