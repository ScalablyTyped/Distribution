package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParams extends js.Object {
  def end(`this`: nodeLib.streamMod.Readable): js.Any
  def error(err: nodeLib.Error): js.Any
  def readable(`this`: nodeLib.streamMod.Readable): js.Any
}

object StreamParams {
  @scala.inline
  def apply(
    end: js.Function1[nodeLib.streamMod.Readable, js.Any],
    error: js.Function1[nodeLib.Error, js.Any],
    readable: js.Function1[nodeLib.streamMod.Readable, js.Any]
  ): StreamParams = {
    val __obj = js.Dynamic.literal(end = end, error = error, readable = readable)
  
    __obj.asInstanceOf[StreamParams]
  }
}

