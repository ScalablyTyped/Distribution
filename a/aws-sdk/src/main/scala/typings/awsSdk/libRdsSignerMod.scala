package typings.awsSdk

import typings.awsSdk.libCredentialsMod.Credentials
import typings.awsSdk.libCredentialsMod.CredentialsOptions
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRdsSignerMod.Signer.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRdsSignerMod {
  
  @js.native
  trait Signer extends StObject {
    
    /**
      * Generate an auth token to a database.
      */
    def getAuthToken(options: SignerOptions): String = js.native
    /**
      * Generate an auth token to a database.
      */
    def getAuthToken(options: SignerOptions, callback: js.Function2[/* err */ AWSError, /* token */ String, Unit]): Unit = js.native
  }
  object Signer {
    
    trait SignerOptions extends StObject {
      
      var credentials: js.UndefOr[Credentials | CredentialsOptions] = js.undefined
      
      var hostname: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
      
      var region: js.UndefOr[String] = js.undefined
      
      var username: js.UndefOr[String] = js.undefined
    }
    object SignerOptions {
      
      inline def apply(): SignerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SignerOptions]
      }
      
      extension [Self <: SignerOptions](x: Self) {
        
        inline def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
        
        inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
  }
}
