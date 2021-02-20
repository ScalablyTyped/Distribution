package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.anon.Token
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accounts {
  
  @JSImport("azdata", "accounts.accountUpdated")
  @js.native
  def accountUpdated(updatedAccount: Account): Unit = js.native
  
  @JSImport("azdata", "accounts.beginAutoOAuthDeviceCode")
  @js.native
  def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = js.native
  
  @JSImport("azdata", "accounts.endAutoOAuthDeviceCode")
  @js.native
  def endAutoOAuthDeviceCode(): Unit = js.native
  
  @JSImport("azdata", "accounts.getAccountSecurityToken")
  @js.native
  def getAccountSecurityToken(account: Account, tenant: String, resource: AzureResource): Thenable[js.UndefOr[Token]] = js.native
  
  @JSImport("azdata", "accounts.getAllAccounts")
  @js.native
  def getAllAccounts(): Thenable[js.Array[Account]] = js.native
  
  @JSImport("azdata", "accounts.getSecurityToken")
  @js.native
  def getSecurityToken(account: Account): Thenable[StringDictionary[_]] = js.native
  @JSImport("azdata", "accounts.getSecurityToken")
  @js.native
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[StringDictionary[_]] = js.native
  
  @JSImport("azdata", "accounts.onDidChangeAccounts")
  @js.native
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  
  @JSImport("azdata", "accounts.registerAccountProvider")
  @js.native
  def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = js.native
}
