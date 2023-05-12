package typings.awsSdk2Types

import typings.awsSdk2Types.anon.Timeout
import typings.awsSdk2Types.libCredentialsRemoteCredentialsMod.RemoteCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsEcsCredentialsMod {
  
  @JSImport("aws-sdk2-types/lib/credentials/ecs_credentials", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class ECSCredentials () extends RemoteCredentials {
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ECSCredentialsOptions] (val x: Self) extends AnyVal {
      
      inline def setHttpOptions(value: Timeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
