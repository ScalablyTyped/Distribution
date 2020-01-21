package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/temporary_credentials", JSImport.Namespace)
@js.native
object temporaryCredentialsMod extends js.Object {
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class TemporaryCredentials () extends Credentials {
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
  @js.native
  object TemporaryCredentials extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typings.awsSdk.stsMod.AssumeRoleRequest
      - typings.awsSdk.stsMod.GetSessionTokenRequest
    */
    trait TemporaryCredentialsOptions extends js.Object
    
  }
  
}

