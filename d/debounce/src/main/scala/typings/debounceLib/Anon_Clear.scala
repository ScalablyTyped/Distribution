package typings
package debounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(): scala.Unit
  def flush(): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(clear: js.Function0[scala.Unit], flush: js.Function0[scala.Unit]): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, flush = flush)
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

