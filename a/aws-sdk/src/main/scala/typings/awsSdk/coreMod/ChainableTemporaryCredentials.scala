package typings.awsSdk.coreMod

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials ()
  extends typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("aws-sdk/lib/core", "ChainableTemporaryCredentials")
@js.native
object ChainableTemporaryCredentials extends js.Object

