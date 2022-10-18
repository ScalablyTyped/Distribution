package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutFunctionConcurrencyOutputMod {
  
  trait PutFunctionConcurrencyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var ReservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
  }
  object PutFunctionConcurrencyOutput {
    
    inline def apply($metadata: ResponseMetadata): PutFunctionConcurrencyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutFunctionConcurrencyOutput]
    }
    
    extension [Self <: PutFunctionConcurrencyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setReservedConcurrentExecutions(value: Double): Self = StObject.set(x, "ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      inline def setReservedConcurrentExecutionsUndefined: Self = StObject.set(x, "ReservedConcurrentExecutions", js.undefined)
    }
  }
}
