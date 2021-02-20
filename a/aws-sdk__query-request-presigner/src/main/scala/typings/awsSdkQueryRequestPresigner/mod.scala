package typings.awsSdkQueryRequestPresigner

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/query-request-presigner", "presignRequestQuery")
  @js.native
  def presignRequestQuery(
    request: HttpRequest,
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest] = js.native
  
  @js.native
  trait PresignOption extends StObject {
    
    /**
      * credentials used to sign the request.
      */
    var credentials: Credentials = js.native
    
    /**
      * Use endpoint other than that in request
      * @default request the same endpoint as in the request
      */
    var endpoint: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
      ] = js.native
    
    /**
      * The time span in second that the presigned url lives
      * @default 3600
      */
    var expireTime: js.UndefOr[Double] = js.native
    
    var sha256: HashConstructor = js.native
    
    /**
      * The service name used to sign the request
      */
    var signingName: String = js.native
    
    /**
      * The region that signer used to sign. Usally the same as
      * that in request hostname
      */
    var signingRegion: String = js.native
  }
  object PresignOption {
    
    @scala.inline
    def apply(credentials: Credentials, sha256: HashConstructor, signingName: String, signingRegion: String): PresignOption = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresignOption]
    }
    
    @scala.inline
    implicit class PresignOptionMutableBuilder[Self <: PresignOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setExpireTime(value: Double): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
    }
  }
}
