package typings
package chromeDashAppsLib.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInformation extends js.Object {
  /** The specific token that should be removed from the cache. */
  var token: java.lang.String
}

object TokenInformation {
  @scala.inline
  def apply(token: java.lang.String): TokenInformation = {
    val __obj = js.Dynamic.literal(token = token)
  
    __obj.asInstanceOf[TokenInformation]
  }
}

