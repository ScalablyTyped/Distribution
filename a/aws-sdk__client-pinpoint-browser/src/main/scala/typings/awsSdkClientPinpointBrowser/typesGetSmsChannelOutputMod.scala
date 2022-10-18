package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSmsChannelOutputMod {
  
  trait GetSmsChannelOutput
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
  object GetSmsChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): GetSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSmsChannelOutput]
    }
    
    extension [Self <: GetSmsChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setSMSChannelResponse(value: UnmarshalledSMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
