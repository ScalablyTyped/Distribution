package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParams extends js.Object {
  def end(`this`: nodeLib.streamMod.Readable): js.Any
  def error(err: stdLib.Error): js.Any
  def readable(`this`: nodeLib.streamMod.Readable): js.Any
}

object StreamParams {
  @scala.inline
  def apply(
    end: nodeLib.streamMod.Readable => js.Any,
    error: stdLib.Error => js.Any,
    readable: nodeLib.streamMod.Readable => js.Any
  ): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction1(readable))
  
    __obj.asInstanceOf[StreamParams]
  }
}

