package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Number - https://github.com/zloirock/core-js/#number
// Modules: core.number.iterator
// #############################################################################################
trait Number extends js.Object {
  /**
    * Non-standard.
    */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.IterableIterator[scala.Double]]
}

object Number {
  @scala.inline
  def apply(iterator: js.Function0[nodeLib.IterableIterator[scala.Double]]): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iterator")(iterator)
    __obj.asInstanceOf[Number]
  }
}

