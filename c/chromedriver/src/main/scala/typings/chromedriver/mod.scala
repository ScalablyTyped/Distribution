package typings.chromedriver

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chromedriver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var defaultInstance: js.UndefOr[ChildProcess] = js.native
  val path: String = js.native
  val version: String = js.native
  def start(): ChildProcess = js.native
  def start(args: js.Array[String]): ChildProcess = js.native
  def stop(): Unit = js.native
}

