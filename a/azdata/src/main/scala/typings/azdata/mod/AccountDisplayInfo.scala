package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountDisplayInfo extends js.Object {
  /**
  		 * account provider (eg, Work/School vs Microsoft Account)
  		 */
  var accountType: String
  /**
  		 * A display name that offers context for the account, such as "Contoso".
  		 */
  var contextualDisplayName: String
  /**
  		 * A display name that identifies the account, such as "User Name".
  		 */
  var displayName: String
  /**
  		 * User id that identifies the account, such as "user@contoso.com".
  		 */
  var userId: String
}

object AccountDisplayInfo {
  @scala.inline
  def apply(accountType: String, contextualDisplayName: String, displayName: String, userId: String): AccountDisplayInfo = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], contextualDisplayName = contextualDisplayName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountDisplayInfo]
  }
}

