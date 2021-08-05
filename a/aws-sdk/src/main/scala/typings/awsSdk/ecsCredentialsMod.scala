package typings.awsSdk

import typings.awsSdk.anon.Timeout
import typings.awsSdk.remoteCredentialsMod.RemoteCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ECSCredentialsOptions extends StObject {
    
    var httpOptions: js.UndefOr[Timeout] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
  }
  object ECSCredentialsOptions {
    
    inline def apply(): ECSCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ECSCredentialsOptions]
    }
    
    extension [Self <: ECSCredentialsOptions](x: Self) {
      
      inline def setHttpOptions(value: Timeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
