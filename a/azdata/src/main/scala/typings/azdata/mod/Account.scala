package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /**
  		 * Display information for the account
  		 */
  var displayInfo: AccountDisplayInfo
  /**
  		 * Indicates if the account needs refreshing
  		 */
  var isStale: Boolean
  /**
  		 * The key that identifies the account
  		 */
  var key: AccountKey
  /**
  		 * Custom properties stored with the account
  		 */
  var properties: js.Any
}

object Account {
  @scala.inline
  def apply(displayInfo: AccountDisplayInfo, isStale: Boolean, key: AccountKey, properties: js.Any): Account = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

