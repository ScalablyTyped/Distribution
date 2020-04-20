package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedBlockAlgorithm extends Base {
  def reset(): Unit
}

object BufferedBlockAlgorithm {
  @scala.inline
  def apply(
    create: /* repeated */ js.Any => Base,
    extend: js.Object => js.Object,
    init: /* repeated */ js.Any => Unit,
    mixIn: js.Object => Unit,
    reset: () => Unit
  ): BufferedBlockAlgorithm = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[BufferedBlockAlgorithm]
  }
}

