package typings.awsSdkTypes

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerOutput
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  type BodyLengthCalculator = js.Function1[/* body */ js.Any, js.UndefOr[Double]]
  
  type Decoder = js.Function1[/* input */ String, Uint8Array]
  
  type Encoder = js.Function1[/* input */ Uint8Array, String]
  
  type Provider[T] = js.Function0[js.Promise[T]]
  
  @js.native
  trait RegionInfo extends StObject {
    
    var hostname: String = js.native
    
    var partition: String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var signingRegion: js.UndefOr[String] = js.native
    
    var signingService: js.UndefOr[String] = js.native
  }
  object RegionInfo {
    
    @scala.inline
    def apply(hostname: String, partition: String): RegionInfo = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegionInfo]
    }
    
    @scala.inline
    implicit class RegionInfoMutableBuilder[Self <: RegionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      @scala.inline
      def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningServiceUndefined: Self = StObject.set(x, "signingService", js.undefined)
    }
  }
  
  type RegionInfoProvider = js.Function2[
    /* region */ String, 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[js.UndefOr[RegionInfo]]
  ]
  
  @js.native
  trait RetryStrategy extends StObject {
    
    /**
      * the retry behavior the will invoke the next handler and handle the retry accordingly.
      * This function should also update the $metadata from the response accordingly.
      * @see {@link ResponseMetadata}
      */
    def retry[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  }
  object RetryStrategy {
    
    @scala.inline
    def apply(
      retry: (FinalizeHandler[js.Any, js.Any], FinalizeHandlerArguments[js.Any]) => js.Promise[FinalizeHandlerOutput[js.Any]]
    ): RetryStrategy = {
      val __obj = js.Dynamic.literal(retry = js.Any.fromFunction2(retry))
      __obj.asInstanceOf[RetryStrategy]
    }
    
    @scala.inline
    implicit class RetryStrategyMutableBuilder[Self <: RetryStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetry(
        value: (FinalizeHandler[js.Any, js.Any], FinalizeHandlerArguments[js.Any]) => js.Promise[FinalizeHandlerOutput[js.Any]]
      ): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
    }
  }
  
  type UrlParser = js.Function1[/* url */ String, Endpoint]
}
