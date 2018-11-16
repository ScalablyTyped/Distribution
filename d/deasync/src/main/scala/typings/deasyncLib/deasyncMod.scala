package typings
package deasyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deasync", JSImport.Namespace)
@js.native
object deasyncMod extends js.Object {
  def apply(fn: js.Function1[/* repeated */js.Any, scala.Unit]): js.Function1[/* repeated */js.Any, _] = js.native
  def loopWhile(pred: js.Function0[scala.Boolean]): scala.Unit = js.native
  def runLoopOnce(): scala.Unit = js.native
  def sleep(ms: scala.Double): scala.Unit = js.native
}

