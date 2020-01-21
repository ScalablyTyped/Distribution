package typings.bufferhelper.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferHelper extends js.Object {
  def concat(buffer: js.Any): BufferHelper
  def empty(): BufferHelper
  def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, _]): Unit
  def toBuffer(): Buffer
  def toString(encoding: encoding): String
}

object BufferHelper {
  @scala.inline
  def apply(
    concat: js.Any => BufferHelper,
    empty: () => BufferHelper,
    load: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit,
    toBuffer: () => Buffer,
    toString: encoding => String
  ): BufferHelper = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = js.Any.fromFunction0(empty), load = js.Any.fromFunction2(load), toBuffer = js.Any.fromFunction0(toBuffer), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[BufferHelper]
  }
}

