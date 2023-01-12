package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWriteGetObjectResponseEndpointMod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/write-get-object-response-endpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWriteGetObjectResponseEndpointPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriteGetObjectResponseEndpointPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def writeGetObjectResponseEndpointMiddleware(config: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeGetObjectResponseEndpointMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/write-get-object-response-endpoint", "writeGetObjectResponseEndpointMiddlewareOptions")
  @js.native
  val writeGetObjectResponseEndpointMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  trait PreviouslyResolved extends StObject {
    
    var disableHostPrefix: Boolean
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    def region(): js.Promise[String]
    @JSName("region")
    var region_Original: Provider[String]
    
    var runtime: String
  }
  object PreviouslyResolved {
    
    inline def apply(disableHostPrefix: Boolean, region: () => js.Promise[String], runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], region = js.Any.fromFunction0(region), runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
