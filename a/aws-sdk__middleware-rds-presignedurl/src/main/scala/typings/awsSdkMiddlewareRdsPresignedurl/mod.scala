package typings.awsSdkMiddlewareRdsPresignedurl

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl", "buildCrossRegionPresignedUrl")
  @js.native
  def buildCrossRegionPresignedUrl[Input /* <: RDSInput */, Output /* <: js.Object */](
    hasSourceIdentifierKeyRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: BuildRDSPresignedUrlParameters
  ): js.Any = js.native
  
  @js.native
  trait BuildRDSPresignedUrlParameters extends StObject {
    
    /**
      * Encoder to encode the blob input when generate presigned URL
      */
    var base64Encoder: Encoder = js.native
    
    /**
      * Credentials provider used to sign the presigned URL
      */
    var credentials: Provider[Credentials] = js.native
    
    /**
      * Endpoint provider of the original request.
      */
    var endpoint: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
      ] = js.native
    
    /**
      * Region provider used to sign the presigned URL
      */
    var region: Provider[String] = js.native
    
    /**
      * Hashing class used by signer
      */
    var sha256: HashConstructor = js.native
    
    /**
      * A special input parameter that can either be a name or ARN.
      * The middleware will determine whether to generate presigned URL
      * according to this parameter.
      */
    var sourceIdentifierKey: String = js.native
    
    /**
      * Decoder to decode input string when generate presigned URL
      */
    var utf8Decoder: Decoder = js.native
  }
  object BuildRDSPresignedUrlParameters {
    
    @scala.inline
    def apply(
      base64Encoder: /* input */ Uint8Array => String,
      credentials: () => js.Promise[Credentials],
      endpoint: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
        ],
      region: () => js.Promise[String],
      sha256: HashConstructor,
      sourceIdentifierKey: String,
      utf8Decoder: /* input */ String => Uint8Array
    ): BuildRDSPresignedUrlParameters = {
      val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], sourceIdentifierKey = sourceIdentifierKey.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[BuildRDSPresignedUrlParameters]
    }
    
    @scala.inline
    implicit class BuildRDSPresignedUrlParametersMutableBuilder[Self <: BuildRDSPresignedUrlParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpoint(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIdentifierKey(value: String): Self = StObject.set(x, "sourceIdentifierKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  type RDSInput = StringDictionary[js.Any]
}
