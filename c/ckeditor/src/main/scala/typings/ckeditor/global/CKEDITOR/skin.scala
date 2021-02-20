package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skin {
  
  @JSGlobal("CKEDITOR.skin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CKEDITOR.skin.addIcon")
  @js.native
  def addIcon(name: String, path: String): Unit = js.native
  @JSGlobal("CKEDITOR.skin.addIcon")
  @js.native
  def addIcon(name: String, path: String, offset: js.UndefOr[scala.Nothing], bgsize: String): Unit = js.native
  @JSGlobal("CKEDITOR.skin.addIcon")
  @js.native
  def addIcon(name: String, path: String, offset: Double): Unit = js.native
  @JSGlobal("CKEDITOR.skin.addIcon")
  @js.native
  def addIcon(name: String, path: String, offset: Double, bgsize: String): Unit = js.native
  
  @JSGlobal("CKEDITOR.skin.chameleon")
  @js.native
  def chameleon(editor: String, part: String): Unit = js.native
  
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(
    name: String,
    rtl: js.UndefOr[scala.Nothing],
    overridePath: js.UndefOr[scala.Nothing],
    overrideBgsize: String
  ): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: js.UndefOr[scala.Nothing], overridePath: Double): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: js.UndefOr[scala.Nothing], overridePath: Double, overrideBgsize: String): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: Boolean): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: js.UndefOr[scala.Nothing], overrideBgsize: String): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double): js.Any = js.native
  @JSGlobal("CKEDITOR.skin.getIconStyle")
  @js.native
  def getIconStyle(name: String, rtl: Boolean, overridePath: Double, overrideBgsize: String): js.Any = js.native
  
  @JSGlobal("CKEDITOR.skin.getPath")
  @js.native
  def getPath(part: String): js.Any = js.native
  
  @JSGlobal("CKEDITOR.skin.loadPart")
  @js.native
  def loadPart(part: String, fn: js.Function0[Unit]): Unit = js.native
  
  // tslint:disable-next-line:no-duplicate-variable
  @JSGlobal("CKEDITOR.skin.name")
  @js.native
  def name: String = js.native
  @scala.inline
  def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CKEDITOR.skin.path")
  @js.native
  def path(): String = js.native
  
  @JSGlobal("CKEDITOR.skin.ua_dialog")
  @js.native
  def uaDialog: String = js.native
  
  @scala.inline
  def uaDialog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ua_dialog")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CKEDITOR.skin.ua_editor")
  @js.native
  def uaEditor: String = js.native
  
  @scala.inline
  def uaEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ua_editor")(x.asInstanceOf[js.Any])
}
