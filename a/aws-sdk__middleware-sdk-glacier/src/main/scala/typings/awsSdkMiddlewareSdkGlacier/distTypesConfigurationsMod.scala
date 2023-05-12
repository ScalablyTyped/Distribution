package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.anon.Sha256
import typings.awsSdkTypes.distTypesChecksumMod.ChecksumConstructor
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlacierPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlacierPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  trait GlacierMiddlewareInputConfig extends StObject
  
  trait PreviouslyResolved extends StObject {
    
    var apiVersion: String
    
    def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]]
    
    var sha256: ChecksumConstructor | HashConstructor
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object PreviouslyResolved {
    
    inline def apply(
      apiVersion: String,
      bodyChecksumGenerator: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]],
      sha256: ChecksumConstructor | HashConstructor,
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], bodyChecksumGenerator = js.Any.fromFunction2(bodyChecksumGenerator), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setBodyChecksumGenerator(value: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]]): Self = StObject.set(x, "bodyChecksumGenerator", js.Any.fromFunction2(value))
      
      inline def setSha256(value: ChecksumConstructor | HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
}
