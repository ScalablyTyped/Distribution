package typings.chrome.anon

import typings.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typings.chrome.chrome.platformKeys.Match
import typings.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typings.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofplatformKeysGetKeyPair extends StObject {
  
  def getKeyPair(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  
  def getKeyPairBySpki(
    publicKeySpkiDer: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit
  
  def subtleCrypto(): SubtleCrypto
  
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit
}
object TypeofplatformKeysGetKeyPair {
  
  inline def apply(
    getKeyPair: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit,
    getKeyPairBySpki: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit,
    selectClientCertificates: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit,
    subtleCrypto: () => SubtleCrypto,
    verifyTLSServerCertificate: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Unit
  ): TypeofplatformKeysGetKeyPair = {
    val __obj = js.Dynamic.literal(getKeyPair = js.Any.fromFunction3(getKeyPair), getKeyPairBySpki = js.Any.fromFunction3(getKeyPairBySpki), selectClientCertificates = js.Any.fromFunction2(selectClientCertificates), subtleCrypto = js.Any.fromFunction0(subtleCrypto), verifyTLSServerCertificate = js.Any.fromFunction2(verifyTLSServerCertificate))
    __obj.asInstanceOf[TypeofplatformKeysGetKeyPair]
  }
  
  extension [Self <: TypeofplatformKeysGetKeyPair](x: Self) {
    
    inline def setGetKeyPair(
      value: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit
    ): Self = StObject.set(x, "getKeyPair", js.Any.fromFunction3(value))
    
    inline def setGetKeyPairBySpki(
      value: (ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit
    ): Self = StObject.set(x, "getKeyPairBySpki", js.Any.fromFunction3(value))
    
    inline def setSelectClientCertificates(value: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit): Self = StObject.set(x, "selectClientCertificates", js.Any.fromFunction2(value))
    
    inline def setSubtleCrypto(value: () => SubtleCrypto): Self = StObject.set(x, "subtleCrypto", js.Any.fromFunction0(value))
    
    inline def setVerifyTLSServerCertificate(
      value: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Unit
    ): Self = StObject.set(x, "verifyTLSServerCertificate", js.Any.fromFunction2(value))
  }
}
