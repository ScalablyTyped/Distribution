package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.fileTools.uploadWidgetDefinition
import typings.std.Blob
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTools {
  
  @JSGlobal("CKEDITOR.fileTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CKEDITOR.fileTools.addUploadWidget")
  @js.native
  def addUploadWidget(editor: typings.ckeditor.CKEDITOR.editor, name: String, `def`: uploadWidgetDefinition): Unit = js.native
  
  @JSGlobal("CKEDITOR.fileTools.bindNotification")
  @js.native
  def bindNotification(
    editor: typings.ckeditor.CKEDITOR.editor,
    fileLoader: typings.ckeditor.CKEDITOR.fileTools.fileLoader
  ): Unit = js.native
  
  @JSGlobal("CKEDITOR.fileTools.fileLoader")
  @js.native
  class fileLoader protected ()
    extends typings.ckeditor.CKEDITOR.fileTools.fileLoader {
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
  }
  
  @JSGlobal("CKEDITOR.fileTools.getUploadUrl")
  @js.native
  def getUploadUrl(config: StringDictionary[js.Any]): String = js.native
  @JSGlobal("CKEDITOR.fileTools.getUploadUrl")
  @js.native
  def getUploadUrl(config: StringDictionary[js.Any], `type`: String): String = js.native
  
  @JSGlobal("CKEDITOR.fileTools.isFileUploadSupported")
  @js.native
  def isFileUploadSupported: Boolean = js.native
  @scala.inline
  def isFileUploadSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFileUploadSupported")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CKEDITOR.fileTools.isTypeSupported")
  @js.native
  def isTypeSupported(file: Blob, supportedTypes: RegExp): Boolean = js.native
  
  @JSGlobal("CKEDITOR.fileTools.markElement")
  @js.native
  def markElement(element: element, widgetName: String, loaderId: Double): Unit = js.native
  
  @JSGlobal("CKEDITOR.fileTools.uploadRepository")
  @js.native
  class uploadRepository protected ()
    extends typings.ckeditor.CKEDITOR.fileTools.uploadRepository {
    def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
}
