package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountAliasRequest extends js.Object {
  /**
    * The account alias to create. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType = js.native
}

object CreateAccountAliasRequest {
  @scala.inline
  def apply(AccountAlias: accountAliasType): CreateAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAccountAliasRequest]
  }
}

