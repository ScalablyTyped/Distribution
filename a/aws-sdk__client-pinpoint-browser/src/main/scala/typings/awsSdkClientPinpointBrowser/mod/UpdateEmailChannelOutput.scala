package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailChannelOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
object UpdateEmailChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): UpdateEmailChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelOutput]
  }
}
