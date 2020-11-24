package typings.awsSdkSignatureV4

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4/dist/cjs/credentialDerivation", JSImport.Namespace)
@js.native
object credentialDerivationMod extends js.Object {
  
  def createScope(shortDate: String, region: String, service: String): String = js.native
  
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[Uint8Array] = js.native
}
