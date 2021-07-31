package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAdmChannelOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
object DeleteAdmChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): DeleteAdmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAdmChannelOutput]
  }
}
