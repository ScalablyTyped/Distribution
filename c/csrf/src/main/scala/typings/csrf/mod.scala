package typings.csrf

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csrf", JSImport.Namespace)
  @js.native
  /**
    * Token generation/verification class.
    */
  class ^ () extends Tokens {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The string length of the salt (default: 8)
      */
    var saltLength: js.UndefOr[Double] = js.native
    
    /**
      * The byte length of the secret key (default: 18)
      */
    var secretLength: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      @scala.inline
      def setSecretLength(value: Double): Self = StObject.set(x, "secretLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretLengthUndefined: Self = StObject.set(x, "secretLength", js.undefined)
    }
  }
  
  type SecretCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
  
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
