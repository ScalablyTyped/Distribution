package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.anon.Token
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "accounts")
@js.native
object accounts extends js.Object {
  
  def accountUpdated(updatedAccount: Account): Unit = js.native
  
  def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = js.native
  
  def endAutoOAuthDeviceCode(): Unit = js.native
  
  def getAccountSecurityToken(account: Account, tenant: String, resource: AzureResource): Thenable[js.UndefOr[Token]] = js.native
  
  def getAllAccounts(): Thenable[js.Array[Account]] = js.native
  
  def getSecurityToken(account: Account): Thenable[StringDictionary[_]] = js.native
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[StringDictionary[_]] = js.native
  
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  
  def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = js.native
}
