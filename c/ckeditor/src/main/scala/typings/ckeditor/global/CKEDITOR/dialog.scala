package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dialog.IDialogDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.dialog")
@js.native
class dialog protected ()
  extends typings.ckeditor.CKEDITOR.dialog {
  def this(editor: typings.ckeditor.CKEDITOR.editor, dialogName: String) = this()
}
object dialog {
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.add")
  @js.native
  def add(name: String, dialogDefinition: String): Unit = js.native
  @JSGlobal("CKEDITOR.dialog.add")
  @js.native
  def add(
    name: String,
    dialogDefinition: js.Function1[/* editor */ typings.ckeditor.CKEDITOR.editor, IDialogDefinition]
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.addIframe")
  @js.native
  def addIframe(name: String, title: String, minWidth: Double, minHeight: Double): Unit = js.native
  @JSGlobal("CKEDITOR.dialog.addIframe")
  @js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.UndefOr[scala.Nothing],
    userDefinition: StringDictionary[js.Any]
  ): Unit = js.native
  @JSGlobal("CKEDITOR.dialog.addIframe")
  @js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit]
  ): Unit = js.native
  @JSGlobal("CKEDITOR.dialog.addIframe")
  @js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit],
    userDefinition: StringDictionary[js.Any]
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.addUIElement")
  @js.native
  def addUIElement(typeName: String, builder: js.Function0[Unit]): Unit = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.cancelButton")
  @js.native
  def cancelButton(): Unit = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.exists")
  @js.native
  def exists(name: String): Unit = js.native
  @JSGlobal("CKEDITOR.dialog.exists")
  @js.native
  def exists(name: Double): Unit = js.native
  
  // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  /* static member */
  @JSGlobal("CKEDITOR.dialog.getCurrent")
  @js.native
  def getCurrent(): typings.ckeditor.CKEDITOR.dialog = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.isTabEnabled")
  @js.native
  def isTabEnabled(editor: typings.ckeditor.CKEDITOR.editor, dialogName: String, tabName: String): Boolean = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.dialog.okButton")
  @js.native
  def okButton(): Unit = js.native
}
