package typings.awsSdkQueryRequestPresigner

import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/query-request-presigner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def presignRequestQuery(request: HttpRequest, param1: PresignOption): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("presignRequestQuery")(request.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  trait PresignOption extends StObject {
    
    /**
      * credentials used to sign the request.
      */
    var credentials: Credentials
    
    /**
      * Use endpoint other than that in request
      * @default request the same endpoint as in the request
      */
    var endpoint: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
      ] = js.undefined
    
    /**
      * The time span in second that the presigned url lives
      * @default 3600
      */
    var expireTime: js.UndefOr[Double] = js.undefined
    
    var sha256: HashConstructor
    
    /**
      * The service name used to sign the request
      */
    var signingName: String
    
    /**
      * The region that signer used to sign. Usally the same as
      * that in request hostname
      */
    var signingRegion: String
  }
  object PresignOption {
    
    inline def apply(credentials: Credentials, sha256: HashConstructor, signingName: String, signingRegion: String): PresignOption = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresignOption]
    }
    
    extension [Self <: PresignOption](x: Self) {
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setExpireTime(value: Double): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
      
      inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
    }
  }
}
