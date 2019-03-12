package typings
package contextjsLib.contextjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("contextjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attach(selector: js.Any, menuObjects: js.Array[MenuObject]): scala.Unit = js.native
  def destroy(selector: js.Any): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def init(settings: InitSettings): scala.Unit = js.native
  def settings(settings: InitSettings): scala.Unit = js.native
}

