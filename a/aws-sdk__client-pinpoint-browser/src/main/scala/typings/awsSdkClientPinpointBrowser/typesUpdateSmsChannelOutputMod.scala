package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateSmsChannelOutputMod {
  
  trait UpdateSmsChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * SMS Channel Response.
      */
    var SMSChannelResponse: UnmarshalledSMSChannelResponse
  }
  object UpdateSmsChannelOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): UpdateSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateSmsChannelOutput]
    }
    
    @scala.inline
    implicit class UpdateSmsChannelOutputMutableBuilder[Self <: UpdateSmsChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMSChannelResponse(value: UnmarshalledSMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
