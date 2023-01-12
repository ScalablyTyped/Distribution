package typings.awsSdk

import typings.awsSdk.libErrorMod.AWSError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokenMod {
  
  @JSImport("aws-sdk/lib/token", "Token")
  @js.native
  open class Token protected () extends StObject {
    /**
      * Creates a Token object with a given set of token information as an options hash.
      *
      * @param {object} options - An option hash containing a set of token information.
      */
    def this(options: TokenOptions) = this()
    
    /**
      * Time when token should be considered expired.
      * Used in conjunction with expired.
      */
    var expireTime: js.Date = js.native
    
    /**
      * Whether the token has expired and require a refresh.
      * Used in conjunction with expireTime.
      */
    var expired: Boolean = js.native
    
    /**
      * Gets the existing token, refreshing it if it's are not yet loaded or have expired.
      * Users should call this method before using refresh(), as this will not attempt to reload
      * tokeb when they are already loaded into the object.
      *
      * @param {get} callback - When called with no error, the token information has been loaded into the object.
      */
    def get(callback: js.Function1[/* err */ js.UndefOr[AWSError], Unit]): Unit = js.native
    
    /**
      * Gets the existing token, refreshing ot if necessary, and returns
      * a promise that will be fulfilled immediately (if no refresh is necessary)
      * or when the refresh has completed.
      */
    def getPromise(): js.Promise[Unit] = js.native
    
    /**
      * Returns whether the token object should call refresh()
      */
    def needsRefresh(): Boolean = js.native
    
    /**
      * Refreshes the token.
      * Users should call get() before attempting to forcibly refresh token.
      *
      * @param {function} callback - When called with no error, the token information has been loaded into the object.
      */
    def refresh(callback: js.Function1[/* err */ js.UndefOr[AWSError], Unit]): Unit = js.native
    
    /**
      * Invokes a token refresh and returns a promise that will be fulfilled
      * when the refresh has completed or rejected when the refresh has failed.
      * Users should call get() before attempting to forcibly refresh token.
      */
    def refreshPromise(): js.Promise[Unit] = js.native
    
    /**
      * The literal token string.
      */
    var token: String = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("aws-sdk/lib/token", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/token", "Token.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  trait TokenOptions extends StObject {
    
    /**
      * The time at which the token expires.
      */
    var expireTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The literal token string.
      */
    var token: String
  }
  object TokenOptions {
    
    inline def apply(token: String): TokenOptions = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      inline def setExpireTime(value: js.Date): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
      
      inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
