package typings.awsSdk.globalMod

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/global", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials ()
  extends typings.awsSdk.coreMod.ChainableTemporaryCredentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
}
// Needed to expose interfaces on the class
@JSImport("aws-sdk/global", "ChainableTemporaryCredentials")
@js.native
object ChainableTemporaryCredentials extends js.Object
