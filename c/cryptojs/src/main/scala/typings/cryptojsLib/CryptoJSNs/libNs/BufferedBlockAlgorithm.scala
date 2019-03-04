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
    clone: js.Function0[BufferedBlockAlgorithm],
    create: js.Function1[/* repeated */ js.Any, Base],
    extend: js.Function1[js.Object, js.Object],
    init: js.Function1[/* repeated */ js.Any, scala.Unit],
    mixIn: js.Function1[js.Object, scala.Unit],
    reset: js.Function0[scala.Unit]
  ): BufferedBlockAlgorithm = {
    val __obj = js.Dynamic.literal(clone = clone, create = create, extend = extend, init = init, mixIn = mixIn, reset = reset)
  
    __obj.asInstanceOf[BufferedBlockAlgorithm]
  }
}

