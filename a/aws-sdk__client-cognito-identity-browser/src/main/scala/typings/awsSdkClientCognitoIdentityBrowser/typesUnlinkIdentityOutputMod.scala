package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnlinkIdentityOutputMod {
  
  trait UnlinkIdentityOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object UnlinkIdentityOutput {
    
    inline def apply($metadata: ResponseMetadata): UnlinkIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnlinkIdentityOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnlinkIdentityOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
