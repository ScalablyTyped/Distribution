package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loader {
  
  @JSGlobal("CKEDITOR.loader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(scriptName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def load(scriptName: String, defer: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptName.asInstanceOf[js.Any], defer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadPending(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPending")().asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.loader.loadedScripts")
  @js.native
  val loadedScripts: js.Array[String] = js.native
  
  @JSGlobal("CKEDITOR.loader.scripts")
  @js.native
  val scripts: js.Array[String] = js.native
}
