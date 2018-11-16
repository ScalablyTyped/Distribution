package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.command")
@js.native
class command protected ()
  extends event
     with commandDefinition {
  // Methods
  def this(editor: editor, commandDefinition: commandDefinition) = this()
  @JSName("fakeKeystroke")
  var fakeKeystroke_command: scala.Double = js.native
  var previousState: scala.Double = js.native
  var state: scala.Double = js.native
  var uiItems: js.Array[_] = js.native
  def checkAllowed(noCache: scala.Boolean): scala.Boolean = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def exec(): scala.Boolean = js.native
  def exec(data: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
  @JSName("refresh")
  def refresh_Mcommand(editor: editor, path: ckeditorLib.CKEDITORNs.domNs.elementPath): scala.Unit = js.native
  def setState(newState: scala.Double): scala.Boolean = js.native
  def toggleState(): scala.Unit = js.native
}

