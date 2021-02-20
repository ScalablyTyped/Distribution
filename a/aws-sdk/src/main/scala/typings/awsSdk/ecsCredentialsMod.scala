package typings.awsSdk

import typings.awsSdk.anon.Timeout
import typings.awsSdk.remoteCredentialsMod.RemoteCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecsCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/ecs_credentials", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class ECSCredentials () extends RemoteCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @js.native
  trait ECSCredentialsOptions extends StObject {
    
    var httpOptions: js.UndefOr[Timeout] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
  }
  object ECSCredentialsOptions {
    
    @scala.inline
    def apply(): ECSCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ECSCredentialsOptions]
    }
    
    @scala.inline
    implicit class ECSCredentialsOptionsMutableBuilder[Self <: ECSCredentialsOptions] (val x: Self) extends AnyVal {
      
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
