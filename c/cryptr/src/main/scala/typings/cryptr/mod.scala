package typings.cryptr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cryptr", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Cryptr {
    /**
      * Cryptr provides a mechanism for aes-256-ctr encryption/decryption.
      * @param secret key used for encryption/decryption
      */
    def this(secret: String) = this()
    
    /** Decrypt a string. */
    /* CompleteClass */
    override def decrypt(value: String): String = js.native
    
    /** Encrypt a string. */
    /* CompleteClass */
    override def encrypt(value: String): String = js.native
  }
  
  trait Cryptr extends StObject {
    
    /** Decrypt a string. */
    def decrypt(value: String): String
    
    /** Encrypt a string. */
    def encrypt(value: String): String
  }
  object Cryptr {
    
    inline def apply(decrypt: String => String, encrypt: String => String): Cryptr = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[Cryptr]
    }
    
    extension [Self <: Cryptr](x: Self) {
      
      inline def setDecrypt(value: String => String): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      inline def setEncrypt(value: String => String): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
    }
  }
}
