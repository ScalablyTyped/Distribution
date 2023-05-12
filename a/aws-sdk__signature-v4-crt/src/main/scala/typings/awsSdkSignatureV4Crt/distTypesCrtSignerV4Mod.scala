package typings.awsSdkSignatureV4Crt

import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesSignatureMod.RequestPresigner
import typings.awsSdkTypes.distTypesSignatureMod.RequestPresigningArguments
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigningArguments
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCrtSignerV4Mod {
  
  @JSImport("@aws-sdk/signature-v4-crt/dist-types/CrtSignerV4", "CrtSignerV4")
  @js.native
  open class CrtSignerV4 protected ()
    extends StObject
       with RequestPresigner
       with RequestSigner {
    def this(param0: CrtSignerV4Init & SignatureV4CryptoInit) = this()
    
    /* private */ val applyChecksum: Any = js.native
    
    /* private */ val credentialProvider: Any = js.native
    
    /* private */ var getQueryParam: Any = js.native
    
    /* private */ var options2crtConfigure: Any = js.native
    
    /* private */ val regionProvider: Any = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val sha256: Any = js.native
    
    /* private */ var signRequest: Any = js.native
    
    /* private */ val signingAlgorithm: Any = js.native
    
    /* private */ val uriEscapePath: Any = js.native
    
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: String,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String
    ): js.Promise[Boolean] = js.native
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: String,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String,
      options: RequestPresigningArguments
    ): js.Promise[Boolean] = js.native
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: js.Array[String],
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String
    ): js.Promise[Boolean] = js.native
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: js.Array[String],
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String,
      options: RequestPresigningArguments
    ): js.Promise[Boolean] = js.native
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: Null,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String
    ): js.Promise[Boolean] = js.native
    def verifySigv4aPreSigning(
      request: HttpRequest,
      signature: Null,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String,
      options: RequestPresigningArguments
    ): js.Promise[Boolean] = js.native
    
    /**
      * Test-only API used for cross-library signing verification tests. Verify sign.
      *
      * Verifies:
      *  (1) The canonical request generated during sigv4a signing of the request matches what is passed in
      *  (2) The signature passed in is a valid ECDSA signature of the hashed string-to-sign derived from the
      *  canonical request
      *
      * @param request The original request used for signing
      * @param signature the actual signature computed from a previous signing of the signable
      * @param expectedCanonicalRequest expected result when building the canonical request
      * @param eccPubKeyX the x coordinate of the public part of the ecc key to verify the signature
      * @param eccPubKeyY the y coordinate of the public part of the ecc key to verify the signature
      * @param options the RequestSigningArguments used for signing
      *
      * @return True, if the verification succeed. Otherwise, false.
      */
    def verifySigv4aSigning(
      request: HttpRequest,
      signature: String,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String
    ): js.Promise[Boolean] = js.native
    def verifySigv4aSigning(
      request: HttpRequest,
      signature: String,
      expectedCanonicalRequest: String,
      eccPubKeyX: String,
      eccPubKeyY: String,
      options: RequestSigningArguments
    ): js.Promise[Boolean] = js.native
  }
  
  type AwsSigningAlgorithm = typings.awsCrt.distNativeAuthMod.AwsSigningAlgorithm
  
  trait CrtSignerV4Init
    extends StObject
       with SignatureV4Init {
    
    /**
      * The Algorithm used for the signer. Includes: SigV4, SigV4Asymmetric.
      *
      * @default [SigV4]
      */
    var signingAlgorithm: js.UndefOr[AwsSigningAlgorithm] = js.undefined
  }
  object CrtSignerV4Init {
    
    inline def apply(
      credentials: AwsCredentialIdentity | Provider[AwsCredentialIdentity],
      region: String | Provider[String],
      service: String
    ): CrtSignerV4Init = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrtSignerV4Init]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrtSignerV4Init] (val x: Self) extends AnyVal {
      
      inline def setSigningAlgorithm(value: AwsSigningAlgorithm): Self = StObject.set(x, "signingAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "signingAlgorithm", js.undefined)
    }
  }
}
