package typings.ckeditor.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.loader")
@js.native
object loaderNs extends js.Object {
  var loadedScripts: js.Array[String] = js.native
  var scripts: js.Array[String] = js.native
  def load(scriptName: String): Unit = js.native
  def load(scriptName: String, defer: Boolean): Unit = js.native
  def loadPending(): Unit = js.native
}

