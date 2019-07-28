package typings.delay.delayMod

import typings.delay.Anon_Once
import typings.delay.delayStrings.abort
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
  val aborted: Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function0[Unit], options: Anon_Once): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
}

