package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loader {
  
  @JSGlobal("CKEDITOR.loader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CKEDITOR.loader.load")
  @js.native
  def load(scriptName: String): Unit = js.native
  @JSGlobal("CKEDITOR.loader.load")
  @js.native
  def load(scriptName: String, defer: Boolean): Unit = js.native
  
  @JSGlobal("CKEDITOR.loader.loadPending")
  @js.native
  def loadPending(): Unit = js.native
  
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
