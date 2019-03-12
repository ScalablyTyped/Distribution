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
  var iterator: js.Function0[stdLib.IterableIterator[scala.Double]]
}

object Number {
  @scala.inline
  def apply(iterator: () => stdLib.IterableIterator[scala.Double]): Number = {
    val __obj = js.Dynamic.literal(iterator = js.Any.fromFunction0(iterator))
  
    __obj.asInstanceOf[Number]
  }
}

