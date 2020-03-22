package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "accounts")
@js.native
object accounts extends js.Object {
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  def accountUpdated(updatedAccount: Account): Unit = js.native
  def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = js.native
  def endAutoOAuthDeviceCode(): Unit = js.native
  def getAllAccounts(): Thenable[js.Array[Account]] = js.native
  def getSecurityToken(account: Account): Thenable[js.Object] = js.native
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[js.Object] = js.native
  def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = js.native
}

