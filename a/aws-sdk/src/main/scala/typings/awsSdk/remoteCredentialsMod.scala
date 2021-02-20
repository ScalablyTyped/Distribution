package typings.awsSdk

import typings.awsSdk.anon.Timeout
import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/remote_credentials", "RemoteCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class RemoteCredentials () extends Credentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @js.native
  trait RemoteCredentialsOptions extends StObject {
    
    var httpOptions: js.UndefOr[Timeout] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
  }
  object RemoteCredentialsOptions {
    
    @scala.inline
    def apply(): RemoteCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteCredentialsOptions]
    }
    
    @scala.inline
    implicit class RemoteCredentialsOptionsMutableBuilder[Self <: RemoteCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpOptions(value: Timeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
