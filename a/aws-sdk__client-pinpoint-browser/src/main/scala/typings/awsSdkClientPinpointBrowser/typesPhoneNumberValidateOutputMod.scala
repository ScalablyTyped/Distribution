package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPhoneNumberValidateOutputMod {
  
  @js.native
  trait PhoneNumberValidateOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Phone Number Validate response.
      */
    var NumberValidateResponse: UnmarshalledNumberValidateResponse = js.native
  }
  object PhoneNumberValidateOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): PhoneNumberValidateOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberValidateOutput]
    }
    
    @scala.inline
    implicit class PhoneNumberValidateOutputMutableBuilder[Self <: PhoneNumberValidateOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberValidateResponse(value: UnmarshalledNumberValidateResponse): Self = StObject.set(x, "NumberValidateResponse", value.asInstanceOf[js.Any])
    }
  }
}
