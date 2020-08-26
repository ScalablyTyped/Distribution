package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferedBlockAlgorithm extends Base {
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class BufferedBlockAlgorithmOps[Self <: BufferedBlockAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

