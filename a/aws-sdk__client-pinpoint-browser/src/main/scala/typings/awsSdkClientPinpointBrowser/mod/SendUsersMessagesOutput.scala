package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessagesOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
object SendUsersMessagesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): SendUsersMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesOutput]
  }
}
