package typings.builderDashUtil.outLogMod

import typings.builderDashUtil.builderDashUtilNumbers.`2`
import typings.debug.debugMod.Debugger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PADDING: `2` = js.native
  val debug: Debugger = js.native
  val log: Logger = js.native
  def setPrinter(): Unit = js.native
  def setPrinter(value: js.Function1[/* message */ String, Unit]): Unit = js.native
}

