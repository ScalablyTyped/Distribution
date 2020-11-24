package typings.ckeditor.global.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.loader")
@js.native
object loader extends js.Object {
  
  def load(scriptName: String): Unit = js.native
  def load(scriptName: String, defer: Boolean): Unit = js.native
  
  def loadPending(): Unit = js.native
  
  var loadedScripts: js.Array[String] = js.native
  
  var scripts: js.Array[String] = js.native
}
