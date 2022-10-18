package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateApplicationSettingsOutputMod {
  
  trait UpdateApplicationSettingsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Application settings.
      */
    var ApplicationSettingsResource: UnmarshalledApplicationSettingsResource
  }
  object UpdateApplicationSettingsOutput {
    
    inline def apply($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateApplicationSettingsOutput]
    }
    
    extension [Self <: UpdateApplicationSettingsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setApplicationSettingsResource(value: UnmarshalledApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
    }
  }
}
