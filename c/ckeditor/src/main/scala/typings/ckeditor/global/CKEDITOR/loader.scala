package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loader {
  
  @JSGlobal("CKEDITOR.loader")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(scriptName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def load(scriptName: String, defer: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptName.asInstanceOf[js.Any], defer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def loadPending(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPending")().asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.loader.loadedScripts")
  @js.native
  def loadedScripts: js.Array[String] = js.native
  @scala.inline
  def loadedScripts_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadedScripts")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CKEDITOR.loader.scripts")
  @js.native
  def scripts: js.Array[String] = js.native
  @scala.inline
  def scripts_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scripts")(x.asInstanceOf[js.Any])
}
