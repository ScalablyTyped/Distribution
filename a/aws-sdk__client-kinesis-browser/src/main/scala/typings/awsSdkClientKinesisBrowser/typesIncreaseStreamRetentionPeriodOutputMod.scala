package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIncreaseStreamRetentionPeriodOutputMod {
  
  trait IncreaseStreamRetentionPeriodOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object IncreaseStreamRetentionPeriodOutput {
    
    inline def apply($metadata: ResponseMetadata): IncreaseStreamRetentionPeriodOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncreaseStreamRetentionPeriodOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncreaseStreamRetentionPeriodOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
