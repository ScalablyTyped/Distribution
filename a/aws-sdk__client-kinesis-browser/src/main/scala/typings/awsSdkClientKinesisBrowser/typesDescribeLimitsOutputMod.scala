package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeLimitsOutputMod {
  
  trait DescribeLimitsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The number of open shards.</p>
      */
    var OpenShardCount: Double
    
    /**
      * <p>The maximum number of shards.</p>
      */
    var ShardLimit: Double
  }
  object DescribeLimitsOutput {
    
    inline def apply($metadata: ResponseMetadata, OpenShardCount: Double, ShardLimit: Double): DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeLimitsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setOpenShardCount(value: Double): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
      
      inline def setShardLimit(value: Double): Self = StObject.set(x, "ShardLimit", value.asInstanceOf[js.Any])
    }
  }
}
