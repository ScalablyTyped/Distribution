package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.skin")
@js.native
object skinNs extends js.Object {
  // tslint:disable-next-line:no-duplicate-variable
  var name: String = js.native
  var ua_dialog: String = js.native
  var ua_editor: String = js.native
  def addIcon(name: String, path: String): Unit = js.native
  def addIcon(name: String, path: String, offset: Double): Unit = js.native
  def addIcon(name: String, path: String, offset: Double, bgsize: String): Unit = js.native
  def chameleon(editor: String, part: String): Unit = js.native
  def getIconStyle(name: String): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double, overrideBgsize: String): js.Any = js.native
  def getPath(part: String): js.Any = js.native
  def loadPart(part: String, fn: js.Function0[Unit]): Unit = js.native
  def path(): String = js.native
  @js.native
  object icons extends /* name */ StringDictionary[Anon_Path]
  
  @js.native
  object ua
    extends /* name */ StringDictionary[js.Any]
  
}

