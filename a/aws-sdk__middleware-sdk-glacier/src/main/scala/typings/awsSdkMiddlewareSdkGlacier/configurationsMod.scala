package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.anon.Sha256
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.utilMod.Decoder
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlacierPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def resolveGlacierMiddlewareConfig[T](input: T & PreviouslyResolved & GlacierMiddlewareInputConfig): T & ResolvedGlacierMiddlewareConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlacierMiddlewareConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & ResolvedGlacierMiddlewareConfig]
  
  trait GlacierMiddlewareInputConfig extends StObject
  
  trait PreviouslyResolved extends StObject {
    
    var apiVersion: String
    
    def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]]
    
    var sha256: HashConstructor
    
    def utf8Decoder(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object PreviouslyResolved {
    
    @scala.inline
    def apply(
      apiVersion: String,
      bodyChecksumGenerator: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]],
      sha256: HashConstructor,
      utf8Decoder: /* input */ String => Uint8Array
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], bodyChecksumGenerator = js.Any.fromFunction2(bodyChecksumGenerator), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit class PreviouslyResolvedMutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyChecksumGenerator(value: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]]): Self = StObject.set(x, "bodyChecksumGenerator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  trait ResolvedGlacierMiddlewareConfig extends StObject {
    
    var apiVersion: String
    
    def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]]
    
    var sha256: HashConstructor
    
    def utf8Decoder(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object ResolvedGlacierMiddlewareConfig {
    
    @scala.inline
    def apply(
      apiVersion: String,
      bodyChecksumGenerator: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]],
      sha256: HashConstructor,
      utf8Decoder: /* input */ String => Uint8Array
    ): ResolvedGlacierMiddlewareConfig = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], bodyChecksumGenerator = js.Any.fromFunction2(bodyChecksumGenerator), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[ResolvedGlacierMiddlewareConfig]
    }
    
    @scala.inline
    implicit class ResolvedGlacierMiddlewareConfigMutableBuilder[Self <: ResolvedGlacierMiddlewareConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyChecksumGenerator(value: (HttpRequest, Sha256) => js.Promise[js.Tuple2[String, String]]): Self = StObject.set(x, "bodyChecksumGenerator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
}
