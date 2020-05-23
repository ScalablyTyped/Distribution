package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountProvider extends js.Object {
  /**
    * Called from the account management service when the user has cancelled an auto OAuth
    * authorization process. Implementations should use this to cancel any polling process
    * and call the end OAuth method.
    */
  def autoOAuthCancelled(): Thenable[Unit]
  /**
    * Clears sensitive information for an account. To be called when account is removed
    * @param accountKey - Key that uniquely identifies the account to clear
    */
  def clear(accountKey: AccountKey): Thenable[Unit]
  /**
    * Generates a security token for the provided account
    * @param account The account to generate a security token for
    * @param resource The resource to get the token for
    * @return Promise to return a security token object
    */
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[js.Object]
  /**
    * Initializes the account provider with the accounts restored from the memento,
    * @param storedAccounts Accounts restored from the memento
    * @return Account objects after being rehydrated (if necessary)
    */
  def initialize(storedAccounts: js.Array[Account]): Thenable[js.Array[Account]]
  /**
    * Prompts the user to enter account information.
    * Returns an error if the user canceled the operation.
    */
  def prompt(): Thenable[Account | PromptFailedResult]
  /**
    * Refreshes a stale account.
    * Returns an error if the user canceled the operation.
    * Otherwise, returns a new updated account instance.
    * @param account - An account.
    */
  def refresh(account: Account): Thenable[Account | PromptFailedResult]
}

object AccountProvider {
  @scala.inline
  def apply(
    autoOAuthCancelled: () => Thenable[Unit],
    clear: AccountKey => Thenable[Unit],
    getSecurityToken: (Account, AzureResource) => Thenable[js.Object],
    initialize: js.Array[Account] => Thenable[js.Array[Account]],
    prompt: () => Thenable[Account | PromptFailedResult],
    refresh: Account => Thenable[Account | PromptFailedResult]
  ): AccountProvider = {
    val __obj = js.Dynamic.literal(autoOAuthCancelled = js.Any.fromFunction0(autoOAuthCancelled), clear = js.Any.fromFunction1(clear), getSecurityToken = js.Any.fromFunction2(getSecurityToken), initialize = js.Any.fromFunction1(initialize), prompt = js.Any.fromFunction0(prompt), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[AccountProvider]
  }
}

