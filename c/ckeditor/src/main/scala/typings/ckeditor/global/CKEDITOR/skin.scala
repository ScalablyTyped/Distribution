package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.skin")
@js.native
object skin extends js.Object {
  
  def addIcon(name: String, path: String): Unit = js.native
  def addIcon(name: String, path: String, offset: js.UndefOr[scala.Nothing], bgsize: String): Unit = js.native
  def addIcon(name: String, path: String, offset: Double): Unit = js.native
  def addIcon(name: String, path: String, offset: Double, bgsize: String): Unit = js.native
  
  def chameleon(editor: String, part: String): Unit = js.native
  
  def getIconStyle(name: String): js.Any = js.native
  def getIconStyle(
    name: String,
    rtl: js.UndefOr[scala.Nothing],
    overridePath: js.UndefOr[scala.Nothing],
    overrideBgsize: String
  ): js.Any = js.native
  def getIconStyle(name: String, rtl: js.UndefOr[scala.Nothing], overridePath: Double): js.Any = js.native
  def getIconStyle(name: String, rtl: js.UndefOr[scala.Nothing], overridePath: Double, overrideBgsize: String): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: js.UndefOr[scala.Nothing], overrideBgsize: String): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double): js.Any = js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double, overrideBgsize: String): js.Any = js.native
  
  def getPath(part: String): js.Any = js.native
  
  def loadPart(part: String, fn: js.Function0[Unit]): Unit = js.native
  
  // tslint:disable-next-line:no-duplicate-variable
  var name: String = js.native
  
  def path(): String = js.native
  
  @JSName("ua_dialog")
  var uaDialog: String = js.native
  
  @JSName("ua_editor")
  var uaEditor: String = js.native
  
  @js.native
  object icons extends /* name */ StringDictionary[Path]
  
  @js.native
  object ua
    extends /* name */ StringDictionary[js.Any]
}
