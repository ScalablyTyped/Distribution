package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.anon.Token
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accounts {
  
  @JSImport("azdata", "accounts")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def accountUpdated(updatedAccount: Account): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accountUpdated")(updatedAccount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("beginAutoOAuthDeviceCode")(providerId.asInstanceOf[js.Any], title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], userCode.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Thenable[Unit]]
  
  @scala.inline
  def endAutoOAuthDeviceCode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endAutoOAuthDeviceCode")().asInstanceOf[Unit]
  
  @scala.inline
  def getAccountSecurityToken(account: Account, tenant: String, resource: AzureResource): Thenable[js.UndefOr[Token]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccountSecurityToken")(account.asInstanceOf[js.Any], tenant.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[Token]]]
  
  @scala.inline
  def getAllAccounts(): Thenable[js.Array[Account]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAccounts")().asInstanceOf[Thenable[js.Array[Account]]]
  
  @scala.inline
  def getSecurityToken(account: Account): Thenable[StringDictionary[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityToken")(account.asInstanceOf[js.Any]).asInstanceOf[Thenable[StringDictionary[js.Any]]]
  @scala.inline
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityToken")(account.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[Thenable[StringDictionary[js.Any]]]
  
  @JSImport("azdata", "accounts.onDidChangeAccounts")
  @js.native
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  
  @scala.inline
  def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAccountProvider")(providerMetadata.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
