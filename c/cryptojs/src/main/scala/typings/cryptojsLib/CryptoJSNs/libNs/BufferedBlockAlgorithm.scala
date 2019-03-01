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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("mixIn")(mixIn)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[BufferedBlockAlgorithm]
  }
}

