package typings.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 32. */
trait AccountInfo extends js.Object {
  /**
    * A unique identifier for the account.
    * This ID will not change for the lifetime of the account.
    */
  var id: String
}

object AccountInfo {
  @scala.inline
  def apply(id: String): AccountInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfo]
  }
}

