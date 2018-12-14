package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins")
@js.native
object pluginsNsMembers extends js.Object {
  def add(name: java.lang.String): scala.Unit = js.native
  def add(name: java.lang.String, definition: ckeditorLib.CKEDITORNs.pluginDefinition): scala.Unit = js.native
  def addExternal(name: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def addExternal(name: java.lang.String, path: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def getFilePath(name: java.lang.String): java.lang.String = js.native
  def getPath(name: java.lang.String): java.lang.String = js.native
  def load(
    name: java.lang.String,
    callback: js.Function1[/* plugins */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def load(
    name: java.lang.String,
    callback: js.Function1[/* plugins */ js.Array[java.lang.String], scala.Unit],
    scope: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def setLang(pluginName: java.lang.String, languageCode: java.lang.String, languageEntries: js.Any): scala.Unit = js.native
}

