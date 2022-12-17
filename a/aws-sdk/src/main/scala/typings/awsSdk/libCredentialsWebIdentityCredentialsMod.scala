package typings.awsSdk

import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typings.awsSdk.libConfigBaseMod.ConfigurationOptions
import typings.awsSdk.libCredentialsMod.Credentials
import typings.awsSdk.libCredentialsWebIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsWebIdentityCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/web_identity_credentials", "WebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  open class WebIdentityCredentials () extends Credentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(options: WebIdentityCredentialsOptions, clientConfig: ConfigurationOptions) = this()
    
    var data: AssumeRoleWithWebIdentityResponse = js.native
    
    var params: AssumeRoleWithWebIdentityRequest = js.native
  }
  // Needed to expose interfaces on the class
  object WebIdentityCredentials {
    
    type ClientConfiguration = ConfigurationOptions
    
    type WebIdentityCredentialsOptions = AssumeRoleWithWebIdentityRequest
  }
}
