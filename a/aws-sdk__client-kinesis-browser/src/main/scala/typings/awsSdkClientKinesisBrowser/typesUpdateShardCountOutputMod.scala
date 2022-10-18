package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateShardCountOutputMod {
  
  trait UpdateShardCountOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The current number of shards.</p>
      */
    var CurrentShardCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The name of the stream.</p>
      */
    var StreamName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The updated number of shards.</p>
      */
    var TargetShardCount: js.UndefOr[Double] = js.undefined
  }
  object UpdateShardCountOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateShardCountOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateShardCountOutput]
    }
    
    extension [Self <: UpdateShardCountOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCurrentShardCount(value: Double): Self = StObject.set(x, "CurrentShardCount", value.asInstanceOf[js.Any])
      
      inline def setCurrentShardCountUndefined: Self = StObject.set(x, "CurrentShardCount", js.undefined)
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
      
      inline def setTargetShardCount(value: Double): Self = StObject.set(x, "TargetShardCount", value.asInstanceOf[js.Any])
      
      inline def setTargetShardCountUndefined: Self = StObject.set(x, "TargetShardCount", js.undefined)
    }
  }
}
