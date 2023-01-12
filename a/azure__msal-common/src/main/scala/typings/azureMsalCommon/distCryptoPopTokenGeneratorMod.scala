package typings.azureMsalCommon

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distCryptoIcryptoMod.SignedHttpRequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoPopTokenGeneratorMod {
  
  @js.native
  sealed trait KeyLocation extends StObject
  @JSImport("@azure/msal-common/dist/crypto/PopTokenGenerator", "KeyLocation")
  @js.native
  object KeyLocation extends StObject {
    
    @js.native
    sealed trait SW
      extends StObject
         with KeyLocation
    
    @js.native
    sealed trait UHW
      extends StObject
         with KeyLocation
  }
  
  @JSImport("@azure/msal-common/dist/crypto/PopTokenGenerator", "PopTokenGenerator")
  @js.native
  open class PopTokenGenerator protected () extends StObject {
    def this(cryptoUtils: ICrypto) = this()
    
    /* private */ var cryptoUtils: Any = js.native
    
    /**
      * Generates the req_cnf validated at the RP in the POP protocol for SHR parameters
      * and returns an object containing the keyid, the full req_cnf string and the req_cnf string hash
      * @param request
      * @returns
      */
    def generateCnf(request: SignedHttpRequestParameters): js.Promise[ReqCnfData] = js.native
    
    /**
      * Generates key_id for a SHR token request
      * @param request
      * @returns
      */
    def generateKid(request: SignedHttpRequestParameters): js.Promise[ReqCnf] = js.native
    
    /**
      * Utility function to generate the signed JWT for an access_token
      * @param payload
      * @param kid
      * @param request
      * @param claims
      * @returns
      */
    def signPayload(payload: String, keyId: String, request: SignedHttpRequestParameters): js.Promise[String] = js.native
    def signPayload(payload: String, keyId: String, request: SignedHttpRequestParameters, claims: js.Object): js.Promise[String] = js.native
    
    /**
      * Signs the POP access_token with the local generated key-pair
      * @param accessToken
      * @param request
      * @returns
      */
    def signPopToken(accessToken: String, keyId: String, request: SignedHttpRequestParameters): js.Promise[String] = js.native
  }
  
  /**
    * See eSTS docs for more info.
    * - A kid element, with the value containing an RFC 7638-compliant JWK thumbprint that is base64 encoded.
    * -  xms_ksl element, representing the storage location of the key's secret component on the client device. One of two values:
    *      - sw: software storage
    *      - uhw: hardware storage
    */
  trait ReqCnf extends StObject {
    
    var kid: String
    
    var xms_ksl: KeyLocation
  }
  object ReqCnf {
    
    inline def apply(kid: String, xms_ksl: KeyLocation): ReqCnf = {
      val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any], xms_ksl = xms_ksl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqCnf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReqCnf] (val x: Self) extends AnyVal {
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setXms_ksl(value: KeyLocation): Self = StObject.set(x, "xms_ksl", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReqCnfData extends StObject {
    
    var kid: String
    
    var reqCnfHash: String
    
    var reqCnfString: String
  }
  object ReqCnfData {
    
    inline def apply(kid: String, reqCnfHash: String, reqCnfString: String): ReqCnfData = {
      val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any], reqCnfHash = reqCnfHash.asInstanceOf[js.Any], reqCnfString = reqCnfString.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqCnfData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReqCnfData] (val x: Self) extends AnyVal {
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setReqCnfHash(value: String): Self = StObject.set(x, "reqCnfHash", value.asInstanceOf[js.Any])
      
      inline def setReqCnfString(value: String): Self = StObject.set(x, "reqCnfString", value.asInstanceOf[js.Any])
    }
  }
}
