package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.editor
import typings.std.DataTransfer
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object clipboard extends js.Object {
  @js.native
  trait dataTransfer extends js.Object {
    @JSName("$")
    val $: DataTransfer = js.native
    val id: String = js.native
    val sourceEditor: editor = js.native
    def cacheData(): Unit = js.native
    def getData(`type`: String): String = js.native
    def getData(`type`: String, getNative: Boolean): String = js.native
    def getFile(i: Double): File = js.native
    def getFilesCount(): Double = js.native
    def getTransferType(targetEditor: editor): Double = js.native
    def isEmpty(): Boolean = js.native
    def setData(`type`: String, value: String): Unit = js.native
    def storeId(): Unit = js.native
  }
  
  @js.native
  trait fallbackDataTransfer extends js.Object {
    def getData(`type`: String): String = js.native
    def getData(`type`: String, getNative: Boolean): String = js.native
    def isRequired(): Boolean = js.native
    def setData(`type`: String, value: String): String = js.native
  }
  
}

