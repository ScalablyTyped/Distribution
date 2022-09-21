package typings.awsSdkS3RequestPresigner

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.signatureMod.RequestPresigner
import typings.awsSdkTypes.utilMod.Provider
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presignerMod {
  
  @JSImport("@aws-sdk/s3-request-presigner/dist-types/presigner", "S3RequestPresigner")
  @js.native
  open class S3RequestPresigner protected ()
    extends StObject
       with RequestPresigner {
    def this(options: S3RequestPresignerOptions) = this()
    
    /* private */ val signer: Any = js.native
  }
  
  type PartialBy[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Partial[Pick[T, K]])
  
  /* Inlined @aws-sdk/s3-request-presigner.@aws-sdk/s3-request-presigner/dist-types/presigner.PartialBy<@aws-sdk/signature-v4-multi-region.@aws-sdk/signature-v4-multi-region.SignatureV4MultiRegionInit, 'service' | 'uriEscapePath'> & {  signingName :string | undefined} */
  trait S3RequestPresignerOptions extends StObject {
    
    var applyChecksum: js.UndefOr[Boolean] = js.undefined
    
    var credentials: Credentials | Provider[Credentials]
    
    var region: String | Provider[String]
    
    var runtime: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    var signingName: js.UndefOr[String] = js.undefined
    
    var uriEscapePath: js.UndefOr[Boolean] = js.undefined
  }
  object S3RequestPresignerOptions {
    
    inline def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): S3RequestPresignerOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3RequestPresignerOptions]
    }
    
    extension [Self <: S3RequestPresignerOptions](x: Self) {
      
      inline def setApplyChecksum(value: Boolean): Self = StObject.set(x, "applyChecksum", value.asInstanceOf[js.Any])
      
      inline def setApplyChecksumUndefined: Self = StObject.set(x, "applyChecksum", js.undefined)
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      inline def setUriEscapePath(value: Boolean): Self = StObject.set(x, "uriEscapePath", value.asInstanceOf[js.Any])
      
      inline def setUriEscapePathUndefined: Self = StObject.set(x, "uriEscapePath", js.undefined)
    }
  }
}
