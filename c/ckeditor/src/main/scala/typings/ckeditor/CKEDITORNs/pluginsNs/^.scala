package typings.ckeditor.CKEDITORNs.pluginsNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.pluginDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins")
@js.native
object ^ extends js.Object {
  def add(name: String): Unit = js.native
  def add(name: String, definition: pluginDefinition): Unit = js.native
  def addExternal(name: String, path: String): Unit = js.native
  def addExternal(name: String, path: String, fileName: String): Unit = js.native
  def get(name: String): js.Any = js.native
  def getFilePath(name: String): String = js.native
  def getPath(name: String): String = js.native
  def load(name: String, callback: js.Function1[/* plugins */ js.Array[String], Unit]): Unit = js.native
  def load(
    name: String,
    callback: js.Function1[/* plugins */ js.Array[String], Unit],
    scope: StringDictionary[js.Any]
  ): Unit = js.native
  def setLang(pluginName: String, languageCode: String, languageEntries: js.Any): Unit = js.native
}

