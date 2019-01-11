package typings
package concatDashStreamLib.concatDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("concat-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(cb: js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]): nodeLib.streamMod.Writable = js.native
  def apply(
    opts: concatDashStreamLib.concatDashStreamMod.ConcatOpts,
    cb: js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
}

