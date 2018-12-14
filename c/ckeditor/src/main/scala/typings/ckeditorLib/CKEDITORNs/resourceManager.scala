package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.resourceManager")
@js.native
class resourceManager protected () extends js.Object {
  def this(basePath: java.lang.String, fileName: java.lang.String) = this()
  var basePath: java.lang.String = js.native
  var externals: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var fileName: java.lang.String = js.native
  var loaded: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var registered: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def add(name: java.lang.String): scala.Unit = js.native
  def add(name: java.lang.String, definition: pluginDefinition): scala.Unit = js.native
  def addExternal(names: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def addExternal(names: java.lang.String, path: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def get(name: java.lang.String): pluginDefinition = js.native
  def getFilePath(name: java.lang.String): java.lang.String = js.native
  def getPath(name: java.lang.String): java.lang.String = js.native
  def load(
    name: java.lang.String,
    callback: js.Function1[/* loaded */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def load(
    name: java.lang.String,
    callback: js.Function1[/* loaded */ js.Array[java.lang.String], scala.Unit],
    scope: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def load(
    name: js.Array[java.lang.String],
    callback: js.Function1[/* loaded */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def load(
    name: js.Array[java.lang.String],
    callback: js.Function1[/* loaded */ js.Array[java.lang.String], scala.Unit],
    scope: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
}

