package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.fileTools.uploadWidgetDefinition
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTools {
  
  @JSGlobal("CKEDITOR.fileTools")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUploadWidget(editor: typings.ckeditor4.CKEDITOR.editor, name: String, `def`: uploadWidgetDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUploadWidget")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bindNotification(
    editor: typings.ckeditor4.CKEDITOR.editor,
    fileLoader: typings.ckeditor4.CKEDITOR.fileTools.fileLoader
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNotification")(editor.asInstanceOf[js.Any], fileLoader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.fileTools.fileLoader")
  @js.native
  open class fileLoader protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.fileTools.fileLoader {
    def this(editor: typings.ckeditor4.CKEDITOR.editor, fileOrData: String) = this()
    def this(editor: typings.ckeditor4.CKEDITOR.editor, fileOrData: Blob) = this()
    def this(editor: typings.ckeditor4.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
    def this(editor: typings.ckeditor4.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
  }
  
  inline def getUploadUrl(config: StringDictionary[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUploadUrl(config: StringDictionary[Any], `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSGlobal("CKEDITOR.fileTools.isFileUploadSupported")
  @js.native
  val isFileUploadSupported: Boolean = js.native
  
  inline def isTypeSupported(file: Blob, supportedTypes: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(file.asInstanceOf[js.Any], supportedTypes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def markElement(element: element, widgetName: String, loaderId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markElement")(element.asInstanceOf[js.Any], widgetName.asInstanceOf[js.Any], loaderId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.fileTools.uploadRepository")
  @js.native
  open class uploadRepository protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.fileTools.uploadRepository {
    def this(editor: typings.ckeditor4.CKEDITOR.editor) = this()
  }
}
