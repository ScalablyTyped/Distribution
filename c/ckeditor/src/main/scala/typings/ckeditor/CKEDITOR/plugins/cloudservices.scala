package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.cloudservices")
@js.native
object cloudservices extends js.Object {
  @js.native
  class cloudServicesLoader protected () extends fileLoader {
    def this(editor: editor, fileOrData: String) = this()
    def this(editor: editor, fileOrData: Blob) = this()
    def this(editor: editor, fileOrData: String, fileName: String) = this()
    def this(editor: editor, fileOrData: Blob, fileName: String) = this()
    def this(editor: editor, fileOrData: String, fileName: String, token: String) = this()
    def this(editor: editor, fileOrData: Blob, fileName: String, token: String) = this()
    var customToken: String = js.native
    def loadAndUpload(): Unit = js.native
    def upload(): Unit = js.native
  }
  
}

