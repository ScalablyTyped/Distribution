package typings.chrome.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  /** A unique identifier for the account. This ID will not change for the lifetime of the account. */
  var id: String
}

object AccountInfo {
  @scala.inline
  def apply(id: String): AccountInfo = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[AccountInfo]
  }
}

