package typings
package chromeLib.chromeNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorDetails extends js.Object {
  /** Additional details about the error such as a JavaScript runtime error. */
  var details: java.lang.String
  /** The error description. */
  var error: java.lang.String
  /** If true, the error was fatal and the network transaction was aborted. Otherwise, a direct connection is used instead. */
  var fatal: scala.Boolean
}

