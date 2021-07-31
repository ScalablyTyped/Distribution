package typings.awsSdkMiddlewareEc2Copysnapshot

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addPresignedUrl[Input /* <: CopySnapshotInput */, Output /* <: MetadataBearer */](
    hasRegionProviderCredentialsProviderEndpointProviderBase64EncoderUtf8DecoderSha256: AddPresignedUrlParameters
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addPresignedUrl")(hasRegionProviderCredentialsProviderEndpointProviderBase64EncoderUtf8DecoderSha256.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait AddPresignedUrlParameters extends StObject {
    
    /**
      * Encoder to encode the blob input when generate presigned URL
      */
    var base64Encoder: Encoder
    
    /**
      * Credentials provider used to sign the presigned URL
      */
    var credentials: Provider[Credentials]
    
    /**
      * Endpoint provider of the original request.
      */
    var endpoint: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
      ]
    
    /**
      * Region provider used to sign the presigned URL
      */
    var region: Provider[String]
    
    /**
      * Hashing class used by signer
      */
    var sha256: HashConstructor
    
    /**
      * Decoder to decode input string when generate presigned URL
      */
    var utf8Decoder: Decoder
  }
  object AddPresignedUrlParameters {
    
    @scala.inline
    def apply(
      base64Encoder: /* input */ Uint8Array => String,
      credentials: () => js.Promise[Credentials],
      endpoint: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
        ],
      region: () => js.Promise[String],
      sha256: HashConstructor,
      utf8Decoder: /* input */ String => Uint8Array
    ): AddPresignedUrlParameters = {
      val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[AddPresignedUrlParameters]
    }
    
    @scala.inline
    implicit class AddPresignedUrlParametersMutableBuilder[Self <: AddPresignedUrlParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpoint(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  trait CopySnapshotInput extends StObject {
    
    var DestinationRegion: js.UndefOr[String] = js.undefined
    
    var PresignedUrl: js.UndefOr[String] = js.undefined
    
    var SourceRegion: String
  }
  object CopySnapshotInput {
    
    @scala.inline
    def apply(SourceRegion: String): CopySnapshotInput = {
      val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopySnapshotInput]
    }
    
    @scala.inline
    implicit class CopySnapshotInputMutableBuilder[Self <: CopySnapshotInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationRegion(value: String): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
      
      @scala.inline
      def setPresignedUrl(value: String): Self = StObject.set(x, "PresignedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresignedUrlUndefined: Self = StObject.set(x, "PresignedUrl", js.undefined)
      
      @scala.inline
      def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    }
  }
}
