package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetShardIteratorOutputMod {
  
  trait GetShardIteratorOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.</p>
      */
    var ShardIterator: js.UndefOr[String] = js.undefined
  }
  object GetShardIteratorOutput {
    
    inline def apply($metadata: ResponseMetadata): GetShardIteratorOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetShardIteratorOutput]
    }
    
    extension [Self <: GetShardIteratorOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setShardIterator(value: String): Self = StObject.set(x, "ShardIterator", value.asInstanceOf[js.Any])
      
      inline def setShardIteratorUndefined: Self = StObject.set(x, "ShardIterator", js.undefined)
    }
  }
}
