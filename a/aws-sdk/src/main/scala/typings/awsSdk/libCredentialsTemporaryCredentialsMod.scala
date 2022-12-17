package typings.awsSdk

import typings.awsSdk.clientsStsMod.arnType
import typings.awsSdk.clientsStsMod.roleSessionNameType
import typings.awsSdk.libCredentialsMod.Credentials
import typings.awsSdk.libCredentialsTemporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsTemporaryCredentialsMod {
  
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
      - typings.awsSdk.clientsStsMod.AssumeRoleRequest
      - typings.awsSdk.clientsStsMod.GetSessionTokenRequest
    */
    trait TemporaryCredentialsOptions extends StObject
    object TemporaryCredentialsOptions {
      
      inline def AssumeRoleRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType): typings.awsSdk.clientsStsMod.AssumeRoleRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.clientsStsMod.AssumeRoleRequest]
      }
      
      inline def GetSessionTokenRequest(): typings.awsSdk.clientsStsMod.GetSessionTokenRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.awsSdk.clientsStsMod.GetSessionTokenRequest]
      }
    }
  }
}
