package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedBlockAlgorithm extends Base {
  def reset(): scala.Unit
}

object BufferedBlockAlgorithm {
  @scala.inline
  def apply(
    clone: () => BufferedBlockAlgorithm,
    create: /* repeated */ js.Any => Base,
    extend: js.Object => js.Object,
    init: /* repeated */ js.Any => scala.Unit,
    mixIn: js.Object => scala.Unit,
    reset: () => scala.Unit
  ): BufferedBlockAlgorithm = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[BufferedBlockAlgorithm]
  }
}

