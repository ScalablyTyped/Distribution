package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.skin")
@js.native
object skinNs extends js.Object {
  // tslint:disable-next-line:no-duplicate-variable
  var name: java.lang.String = js.native
  var ua_dialog: java.lang.String = js.native
  var ua_editor: java.lang.String = js.native
  def addIcon(name: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def addIcon(name: java.lang.String, path: java.lang.String, offset: scala.Double): scala.Unit = js.native
  def addIcon(name: java.lang.String, path: java.lang.String, offset: scala.Double, bgsize: java.lang.String): scala.Unit = js.native
  def chameleon(editor: java.lang.String, part: java.lang.String): scala.Unit = js.native
  def getIconStyle(name: java.lang.String): js.Any = js.native
  def getIconStyle(name: java.lang.String, rtl: scala.Boolean): js.Any = js.native
  def getIconStyle(name: java.lang.String, rtl: scala.Boolean, overridePath: scala.Double): js.Any = js.native
  def getIconStyle(
    name: java.lang.String,
    rtl: scala.Boolean,
    overridePath: scala.Double,
    overrideBgsize: java.lang.String
  ): js.Any = js.native
  def getPath(part: java.lang.String): js.Any = js.native
  def loadPart(part: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def path(): java.lang.String = js.native
  @js.native
  object icons
    extends /* name */ ScalablyTyped.runtime.StringDictionary[ckeditorLib.Anon_Path]
  
  @js.native
  object ua
    extends /* name */ ScalablyTyped.runtime.StringDictionary[js.Any]
  
}

