package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skin {
  
  @JSGlobal("CKEDITOR.skin")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIcon(name: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIcon")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addIcon(name: String, path: String, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIcon")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addIcon(name: String, path: String, offset: Double, bgsize: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIcon")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bgsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addIcon(name: String, path: String, offset: Unit, bgsize: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIcon")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bgsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chameleon(editor: String, part: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chameleon")(editor.asInstanceOf[js.Any], part.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getIconStyle(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Boolean, overridePath: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Boolean, overridePath: Double, overrideBgsize: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any], overrideBgsize.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Boolean, overridePath: Unit, overrideBgsize: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any], overrideBgsize.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Unit, overridePath: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Unit, overridePath: Double, overrideBgsize: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any], overrideBgsize.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIconStyle(name: String, rtl: Unit, overridePath: Unit, overrideBgsize: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconStyle")(name.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any], overridePath.asInstanceOf[js.Any], overrideBgsize.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getPath(part: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(part.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def loadPart(part: String, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPart")(part.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // tslint:disable-next-line:no-duplicate-variable
  @JSGlobal("CKEDITOR.skin.name")
  @js.native
  def name: String = js.native
  inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  inline def path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[String]
  
  @JSGlobal("CKEDITOR.skin.ua_dialog")
  @js.native
  def uaDialog: String = js.native
  
  inline def uaDialog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ua_dialog")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CKEDITOR.skin.ua_editor")
  @js.native
  def uaEditor: String = js.native
  
  inline def uaEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ua_editor")(x.asInstanceOf[js.Any])
}
