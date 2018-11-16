package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait commandDefinition extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.native
  var canUndo: js.UndefOr[scala.Boolean] = js.native
  var context: js.UndefOr[scala.Boolean] = js.native
  var contextSensitive: js.UndefOr[scala.Boolean] = js.native
  var editorFocus: js.UndefOr[scala.Boolean] = js.native
  var fakeKeystroke: js.UndefOr[scala.Double] = js.native
  var modes: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
  var readOnly: js.UndefOr[scala.Boolean] = js.native
  var refresh: js.UndefOr[
    js.Function2[/* editor */ editor, /* path */ ckeditorLib.CKEDITORNs.domNs.elementPath, scala.Unit]
  ] = js.native
  var startDisabled: js.UndefOr[scala.Boolean] = js.native
  def exec(editor: editor): scala.Boolean = js.native
  def exec(editor: editor, data: js.Any): scala.Boolean = js.native
}

