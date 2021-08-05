package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.lib.CipherParams
import typings.cryptojs.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdf {
  
  @js.native
  trait IKdfImpl extends StObject {
    
    def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
    def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
    def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = js.native
  }
  
  trait KdfStatic extends StObject {
    
    var OpenSSL: IKdfImpl
  }
  object KdfStatic {
    
    inline def apply(OpenSSL: IKdfImpl): KdfStatic = {
      val __obj = js.Dynamic.literal(OpenSSL = OpenSSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdfStatic]
    }
    
    extension [Self <: KdfStatic](x: Self) {
      
      inline def setOpenSSL(value: IKdfImpl): Self = StObject.set(x, "OpenSSL", value.asInstanceOf[js.Any])
    }
  }
}
