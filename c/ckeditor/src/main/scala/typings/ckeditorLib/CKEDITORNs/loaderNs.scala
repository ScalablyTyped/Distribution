package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.loader")
@js.native
object loaderNs extends js.Object {
  var loadedScripts: js.Array[java.lang.String] = js.native
  var scripts: js.Array[java.lang.String] = js.native
  def load(scriptName: java.lang.String): scala.Unit = js.native
  def load(scriptName: java.lang.String, defer: scala.Boolean): scala.Unit = js.native
  def loadPending(): scala.Unit = js.native
}

