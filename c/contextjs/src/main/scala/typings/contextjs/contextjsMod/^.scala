package typings.contextjs.contextjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("contextjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attach(selector: js.Any, menuObjects: js.Array[MenuObject]): Unit = js.native
  def destroy(selector: js.Any): Unit = js.native
  def init(): Unit = js.native
  def init(settings: InitSettings): Unit = js.native
  def settings(settings: InitSettings): Unit = js.native
}

