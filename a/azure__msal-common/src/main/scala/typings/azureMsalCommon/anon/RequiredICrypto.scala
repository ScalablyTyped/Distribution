package typings.azureMsalCommon.anon

import typings.azureMsalCommon.distCryptoIcryptoMod.PkceCodes
import typings.azureMsalCommon.distCryptoIcryptoMod.SignedHttpRequestParameters
import typings.azureMsalCommon.distCryptoSignedHttpRequestMod.SignedHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/crypto/ICrypto.ICrypto> */
trait RequiredICrypto extends StObject {
  
  def base64Decode(input: String): String
  @JSName("base64Decode")
  var base64Decode_Original: js.Function1[/* input */ String, String]
  
  def base64Encode(input: String): String
  @JSName("base64Encode")
  var base64Encode_Original: js.Function1[/* input */ String, String]
  
  def clearKeystore(): js.Promise[Boolean]
  @JSName("clearKeystore")
  var clearKeystore_Original: js.Function0[js.Promise[Boolean]]
  
  def createNewGuid(): String
  @JSName("createNewGuid")
  var createNewGuid_Original: js.Function0[String]
  
  def generatePkceCodes(): js.Promise[PkceCodes]
  @JSName("generatePkceCodes")
  var generatePkceCodes_Original: js.Function0[js.Promise[PkceCodes]]
  
  def getPublicKeyThumbprint(request: SignedHttpRequestParameters): js.Promise[String]
  @JSName("getPublicKeyThumbprint")
  var getPublicKeyThumbprint_Original: js.Function1[/* request */ SignedHttpRequestParameters, js.Promise[String]]
  
  def hashString(plainText: String): js.Promise[String]
  @JSName("hashString")
  var hashString_Original: js.Function1[/* plainText */ String, js.Promise[String]]
  
  def removeTokenBindingKey(kid: String): js.Promise[Boolean]
  @JSName("removeTokenBindingKey")
  var removeTokenBindingKey_Original: js.Function1[/* kid */ String, js.Promise[Boolean]]
  
  def signJwt(payload: SignedHttpRequest, kid: String): js.Promise[String]
  def signJwt(payload: SignedHttpRequest, kid: String, correlationId: String): js.Promise[String]
  @JSName("signJwt")
  var signJwt_Original: js.Function3[
    /* payload */ SignedHttpRequest, 
    /* kid */ String, 
    /* correlationId */ js.UndefOr[String], 
    js.Promise[String]
  ]
}
object RequiredICrypto {
  
  inline def apply(
    base64Decode: /* input */ String => String,
    base64Encode: /* input */ String => String,
    clearKeystore: () => js.Promise[Boolean],
    createNewGuid: () => String,
    generatePkceCodes: () => js.Promise[PkceCodes],
    getPublicKeyThumbprint: /* request */ SignedHttpRequestParameters => js.Promise[String],
    hashString: /* plainText */ String => js.Promise[String],
    removeTokenBindingKey: /* kid */ String => js.Promise[Boolean],
    signJwt: (/* payload */ SignedHttpRequest, /* kid */ String, /* correlationId */ js.UndefOr[String]) => js.Promise[String]
  ): RequiredICrypto = {
    val __obj = js.Dynamic.literal(base64Decode = js.Any.fromFunction1(base64Decode), base64Encode = js.Any.fromFunction1(base64Encode), clearKeystore = js.Any.fromFunction0(clearKeystore), createNewGuid = js.Any.fromFunction0(createNewGuid), generatePkceCodes = js.Any.fromFunction0(generatePkceCodes), getPublicKeyThumbprint = js.Any.fromFunction1(getPublicKeyThumbprint), hashString = js.Any.fromFunction1(hashString), removeTokenBindingKey = js.Any.fromFunction1(removeTokenBindingKey), signJwt = js.Any.fromFunction3(signJwt))
    __obj.asInstanceOf[RequiredICrypto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredICrypto] (val x: Self) extends AnyVal {
    
    inline def setBase64Decode(value: /* input */ String => String): Self = StObject.set(x, "base64Decode", js.Any.fromFunction1(value))
    
    inline def setBase64Encode(value: /* input */ String => String): Self = StObject.set(x, "base64Encode", js.Any.fromFunction1(value))
    
    inline def setClearKeystore(value: () => js.Promise[Boolean]): Self = StObject.set(x, "clearKeystore", js.Any.fromFunction0(value))
    
    inline def setCreateNewGuid(value: () => String): Self = StObject.set(x, "createNewGuid", js.Any.fromFunction0(value))
    
    inline def setGeneratePkceCodes(value: () => js.Promise[PkceCodes]): Self = StObject.set(x, "generatePkceCodes", js.Any.fromFunction0(value))
    
    inline def setGetPublicKeyThumbprint(value: /* request */ SignedHttpRequestParameters => js.Promise[String]): Self = StObject.set(x, "getPublicKeyThumbprint", js.Any.fromFunction1(value))
    
    inline def setHashString(value: /* plainText */ String => js.Promise[String]): Self = StObject.set(x, "hashString", js.Any.fromFunction1(value))
    
    inline def setRemoveTokenBindingKey(value: /* kid */ String => js.Promise[Boolean]): Self = StObject.set(x, "removeTokenBindingKey", js.Any.fromFunction1(value))
    
    inline def setSignJwt(
      value: (/* payload */ SignedHttpRequest, /* kid */ String, /* correlationId */ js.UndefOr[String]) => js.Promise[String]
    ): Self = StObject.set(x, "signJwt", js.Any.fromFunction3(value))
  }
}
