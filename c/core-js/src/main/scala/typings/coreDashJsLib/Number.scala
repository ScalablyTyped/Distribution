package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Number - https://github.com/zloirock/core-js/#number
// Modules: core.number.iterator
// #############################################################################################
@js.native
trait Number extends js.Object {
  /**
    * Non-standard.
    */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[stdLib.IterableIterator[scala.Double]] = js.native
}

