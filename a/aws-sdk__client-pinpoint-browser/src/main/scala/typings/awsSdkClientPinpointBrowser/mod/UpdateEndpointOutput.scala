package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
object UpdateEndpointOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
}
