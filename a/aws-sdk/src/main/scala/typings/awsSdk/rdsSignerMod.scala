package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.rdsSignerMod.Signer.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsSignerMod {
  
  @JSImport("aws-sdk/lib/rds/signer", "Signer")
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer () extends StObject {
    def this(options: SignerOptions) = this()
    
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
      
      @scala.inline
      def apply(): SignerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SignerOptions]
      }
      
      @scala.inline
      implicit class SignerOptionsMutableBuilder[Self <: SignerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
        
        @scala.inline
        def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
  }
}
