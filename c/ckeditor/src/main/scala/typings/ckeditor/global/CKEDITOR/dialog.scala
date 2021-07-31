package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dialog.IDialogDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.dialog")
@js.native
class dialog protected ()
  extends StObject
     with typings.ckeditor.CKEDITOR.dialog {
  def this(editor: typings.ckeditor.CKEDITOR.editor, dialogName: String) = this()
}
object dialog {
  
  @JSGlobal("CKEDITOR.dialog")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def add(name: String, dialogDefinition: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], dialogDefinition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def add(
    name: String,
    dialogDefinition: js.Function1[/* editor */ typings.ckeditor.CKEDITOR.editor, IDialogDefinition]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], dialogDefinition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def addIframe(name: String, title: String, minWidth: Double, minHeight: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIframe")(name.asInstanceOf[js.Any], title.asInstanceOf[js.Any], minWidth.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIframe")(name.asInstanceOf[js.Any], title.asInstanceOf[js.Any], minWidth.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], onContentLoad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit],
    userDefinition: StringDictionary[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIframe")(name.asInstanceOf[js.Any], title.asInstanceOf[js.Any], minWidth.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], onContentLoad.asInstanceOf[js.Any], userDefinition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: Unit,
    userDefinition: StringDictionary[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIframe")(name.asInstanceOf[js.Any], title.asInstanceOf[js.Any], minWidth.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], onContentLoad.asInstanceOf[js.Any], userDefinition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def addUIElement(typeName: String, builder: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUIElement")(typeName.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def cancelButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelButton")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def exists(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def exists(name: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  /* static member */
  @scala.inline
  def getCurrent(): typings.ckeditor.CKEDITOR.dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[typings.ckeditor.CKEDITOR.dialog]
  
  /* static member */
  @scala.inline
  def isTabEnabled(editor: typings.ckeditor.CKEDITOR.editor, dialogName: String, tabName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTabEnabled")(editor.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], tabName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def okButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("okButton")().asInstanceOf[Unit]
}
