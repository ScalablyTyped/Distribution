package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessagesOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
object SendMessagesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): SendMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesOutput]
  }
}
