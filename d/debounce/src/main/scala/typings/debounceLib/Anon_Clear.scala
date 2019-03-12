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
  def apply(clear: () => scala.Unit, flush: () => scala.Unit): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

