package typings.awsSdkSignatureV4

import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesSignatureMod.EventSigner
import typings.awsSdkTypes.distTypesSignatureMod.EventSigningArguments
import typings.awsSdkTypes.distTypesSignatureMod.FormattedEvent
import typings.awsSdkTypes.distTypesSignatureMod.RequestPresigner
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesSignatureMod.StringSigner
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSignatureV4Mod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/SignatureV4", "SignatureV4")
  @js.native
  open class SignatureV4 protected ()
    extends StObject
       with RequestPresigner
       with RequestSigner
       with StringSigner
       with EventSigner {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init & SignatureV4CryptoInit) = this()
    
    /* private */ val applyChecksum: Any = js.native
    
    /* private */ var createCanonicalRequest: Any = js.native
    
    /* private */ var createStringToSign: Any = js.native
    
    /* private */ val credentialProvider: Any = js.native
    
    /* private */ var getCanonicalPath: Any = js.native
    
    /* private */ var getSignature: Any = js.native
    
    /* private */ var getSigningKey: Any = js.native
    
    /* private */ val regionProvider: Any = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val sha256: Any = js.native
    
    /**
      * Sign the individual event of the event stream.
      */
    /* CompleteClass */
    override def sign(event: FormattedEvent, options: EventSigningArguments): js.Promise[String] = js.native
    
    /* private */ var signEvent: Any = js.native
    
    /* private */ var signRequest: Any = js.native
    
    /* private */ var signString: Any = js.native
    
    /* private */ val uriEscapePath: Any = js.native
    
    /* private */ var validateResolvedCredentials: Any = js.native
  }
  
  trait SignatureV4CryptoInit extends StObject {
    
    var sha256: HashConstructor
  }
  object SignatureV4CryptoInit {
    
    inline def apply(sha256: HashConstructor): SignatureV4CryptoInit = {
      val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureV4CryptoInit]
    }
    
    extension [Self <: SignatureV4CryptoInit](x: Self) {
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignatureV4Init extends StObject {
    
    /**
      * Whether to calculate a checksum of the request body and include it as
      * either a request header (when signing) or as a query string parameter
      * (when presigning). This is required for AWS Glacier and Amazon S3 and optional for
      * every other AWS service as of late 2017.
      *
      * @default [true]
      */
    var applyChecksum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The credentials with which the request should be signed or a function
      * that returns a promise that will be resolved with credentials.
      */
    var credentials: Credentials | Provider[Credentials]
    
    /**
      * The region name or a function that returns a promise that will be
      * resolved with the region name.
      */
    var region: String | Provider[String]
    
    /**
      * The service signing name.
      */
    var service: String
    
    /**
      * A constructor function for a hash object that will calculate SHA-256 HMAC
      * checksums.
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * Whether to uri-escape the request URI path as part of computing the
      * canonical request string. This is required for every AWS service, except
      * Amazon S3, as of late 2017.
      *
      * @default [true]
      */
    var uriEscapePath: js.UndefOr[Boolean] = js.undefined
  }
  object SignatureV4Init {
    
    inline def apply(
      credentials: Credentials | Provider[Credentials],
      region: String | Provider[String],
      service: String
    ): SignatureV4Init = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureV4Init]
    }
    
    extension [Self <: SignatureV4Init](x: Self) {
      
      inline def setApplyChecksum(value: Boolean): Self = StObject.set(x, "applyChecksum", value.asInstanceOf[js.Any])
      
      inline def setApplyChecksumUndefined: Self = StObject.set(x, "applyChecksum", js.undefined)
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setUriEscapePath(value: Boolean): Self = StObject.set(x, "uriEscapePath", value.asInstanceOf[js.Any])
      
      inline def setUriEscapePathUndefined: Self = StObject.set(x, "uriEscapePath", js.undefined)
    }
  }
}
