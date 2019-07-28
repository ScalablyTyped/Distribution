package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.elementPath
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
  var fakeKeystroke_command: Double = js.native
  var previousState: Double = js.native
  var state: Double = js.native
  var uiItems: js.Array[_] = js.native
  def checkAllowed(noCache: Boolean): Boolean = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def exec(): Boolean = js.native
  def exec(data: StringDictionary[js.Any]): Boolean = js.native
  @JSName("refresh")
  def refresh_Mcommand(editor: editor, path: elementPath): Unit = js.native
  def setState(newState: Double): Boolean = js.native
  def toggleState(): Unit = js.native
}

