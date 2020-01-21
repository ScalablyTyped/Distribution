package typings.awsSdk.coreMod

import typings.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials ()
  extends typings.awsSdk.ecsCredentialsMod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

