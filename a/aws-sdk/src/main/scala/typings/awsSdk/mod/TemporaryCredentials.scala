package typings.awsSdk.mod

import typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "TemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
  */
class TemporaryCredentials ()
  extends typings.awsSdk.coreMod.TemporaryCredentials {
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
    */
  def this(options: TemporaryCredentialsOptions) = this()
  def this(options: TemporaryCredentialsOptions, masterCredentials: typings.awsSdk.credentialsMod.Credentials) = this()
}
// Needed to expose interfaces on the class
@JSImport("aws-sdk", "TemporaryCredentials")
@js.native
object TemporaryCredentials extends js.Object
