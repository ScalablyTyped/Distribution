package typings.ckeditor.CKEDITOR.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dialog")
@js.native
object ^ extends js.Object {
  def add(name: String, dialogDefinition: String): Unit = js.native
  def add(name: String, dialogDefinition: js.Function1[/* editor */ editor, IDialogDefinition]): Unit = js.native
  def addIframe(name: String, title: String, minWidth: Double, minHeight: Double): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit]
  ): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit],
    userDefinition: StringDictionary[js.Any]
  ): Unit = js.native
  def addUIElement(typeName: String, builder: js.Function0[Unit]): Unit = js.native
  def cancelButton(): Unit = js.native
  def exists(name: String): Unit = js.native
  def exists(name: Double): Unit = js.native
   // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  def getCurrent(): typings.ckeditor.CKEDITOR.dialog = js.native
  def isTabEnabled(editor: editor, dialogName: String, tabName: String): Boolean = js.native
  def okButton(): Unit = js.native
}

