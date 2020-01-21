package typings.awsSdk.rdsSignerMod

import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.rdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/rds/signer", "Signer")
@js.native
/**
  * A signer object can be used to generate an auth token to a database.
  */
class Signer_ () extends js.Object {
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

