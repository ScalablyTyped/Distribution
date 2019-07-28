package typings.browserDashResolve

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserDashResolveMod {
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function2[/* err */ js.UndefOr[Error], /* resolved */ js.UndefOr[String], Unit]
}
