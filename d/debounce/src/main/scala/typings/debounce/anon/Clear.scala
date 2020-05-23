package typings.debounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clear extends js.Object {
  def clear(): Unit
  def flush(): Unit
}

object Clear {
  @scala.inline
  def apply(clear: () => Unit, flush: () => Unit): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[Clear]
  }
}

