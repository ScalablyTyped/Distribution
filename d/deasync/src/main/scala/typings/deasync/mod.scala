package typings.deasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deasync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, _] = js.native
  def loopWhile(pred: js.Function0[Boolean]): Unit = js.native
  def runLoopOnce(): Unit = js.native
  def sleep(ms: Double): Unit = js.native
}

