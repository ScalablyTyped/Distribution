package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberValidateOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
object PhoneNumberValidateOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): PhoneNumberValidateOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateOutput]
  }
}
