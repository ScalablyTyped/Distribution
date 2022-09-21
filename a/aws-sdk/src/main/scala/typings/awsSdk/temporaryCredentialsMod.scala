package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.stsMod.arnType
import typings.awsSdk.stsMod.roleSessionNameType
import typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object temporaryCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/temporary_credentials", "TemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  open class TemporaryCredentials () extends Credentials {
    /**
      * Creates a new temporary credentials object.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
      */
    def this(options: TemporaryCredentialsOptions) = this()
    def this(options: TemporaryCredentialsOptions, masterCredentials: Credentials) = this()
    
    /**
      * The master (non-temporary) credentials used to get and refresh temporary credentials from AWS STS.
      */
    var masterCredentials: Credentials = js.native
  }
  // Needed to expose interfaces on the class
  object TemporaryCredentials {
    
    /* Rewritten from type alias, can be one of: 
      - typings.awsSdk.stsMod.AssumeRoleRequest
      - typings.awsSdk.stsMod.GetSessionTokenRequest
    */
    trait TemporaryCredentialsOptions extends StObject
    object TemporaryCredentialsOptions {
      
      inline def AssumeRoleRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType): typings.awsSdk.stsMod.AssumeRoleRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.stsMod.AssumeRoleRequest]
      }
      
      inline def GetSessionTokenRequest(): typings.awsSdk.stsMod.GetSessionTokenRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.awsSdk.stsMod.GetSessionTokenRequest]
      }
    }
  }
}
