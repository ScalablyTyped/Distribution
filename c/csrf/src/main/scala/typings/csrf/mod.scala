package typings.csrf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csrf", JSImport.Namespace)
  @js.native
  /**
    * Token generation/verification class.
    */
  open class ^ ()
    extends StObject
       with Tokens {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * The string length of the salt (default: 8)
      */
    var saltLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The byte length of the secret key (default: 18)
      */
    var secretLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      inline def setSecretLength(value: Double): Self = StObject.set(x, "secretLength", value.asInstanceOf[js.Any])
      
      inline def setSecretLengthUndefined: Self = StObject.set(x, "secretLength", js.undefined)
    }
  }
  
  type SecretCallback = js.Function2[/* err */ js.Error | Null, /* secret */ String, Unit]
  
  @js.native
  trait Tokens extends StObject {
    
    /**
      * Create a new CSRF token.
      */
    def create(secret: String): String = js.native
    
    /**
      * Create a new secret key.
      */
    def secret(): js.Promise[String] = js.native
    /**
      * Create a new secret key.
      */
    def secret(callback: SecretCallback): Unit = js.native
    
    /**
      * Create a new secret key synchronously.
      */
    def secretSync(): String = js.native
    
    /**
      * Verify if a given token is valid for a given secret.
      */
    def verify(secret: String, token: String): Boolean = js.native
  }
}
