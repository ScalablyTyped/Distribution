package typings
package delayLib.delayMod.delayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Minimal subset of `AbortSignal` that delay will use if passed.
	This avoids a dependency on dom.d.ts.
	The dom.d.ts `AbortSignal` is compatible with this one.
	*/
@js.native
trait AbortSignal extends js.Object {
  val aborted: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: delayLib.delayLibStrings.abort, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: delayLib.delayLibStrings.abort,
    listener: js.Function0[scala.Unit],
    options: delayLib.Anon_Once
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: delayLib.delayLibStrings.abort, listener: js.Function0[scala.Unit]): scala.Unit = js.native
}

