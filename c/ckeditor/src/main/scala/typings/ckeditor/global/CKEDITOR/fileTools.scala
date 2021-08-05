package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.fileTools.uploadWidgetDefinition
import typings.std.Blob
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTools {
  
  @JSGlobal("CKEDITOR.fileTools")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUploadWidget(editor: typings.ckeditor.CKEDITOR.editor, name: String, `def`: uploadWidgetDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUploadWidget")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bindNotification(
    editor: typings.ckeditor.CKEDITOR.editor,
    fileLoader: typings.ckeditor.CKEDITOR.fileTools.fileLoader
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNotification")(editor.asInstanceOf[js.Any], fileLoader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.fileTools.fileLoader")
  @js.native
  class fileLoader protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.fileTools.fileLoader {
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
  }
  
  inline def getUploadUrl(config: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUploadUrl(config: StringDictionary[js.Any], `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSGlobal("CKEDITOR.fileTools.isFileUploadSupported")
  @js.native
  def isFileUploadSupported: Boolean = js.native
  inline def isFileUploadSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFileUploadSupported")(x.asInstanceOf[js.Any])
  
  inline def isTypeSupported(file: Blob, supportedTypes: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(file.asInstanceOf[js.Any], supportedTypes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def markElement(element: element, widgetName: String, loaderId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markElement")(element.asInstanceOf[js.Any], widgetName.asInstanceOf[js.Any], loaderId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.fileTools.uploadRepository")
  @js.native
  class uploadRepository protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.fileTools.uploadRepository {
    def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
}
