package typings.ckeditor.CKEDITORNs.pluginsNs.clipboardNs

import typings.ckeditor.CKEDITORNs.editor
import typings.std.DataTransfer
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard.dataTransfer")
@js.native
class dataTransfer () extends js.Object {
  def this(nativeDataTransfer: DataTransfer) = this()
  def this(nativeDataTransfer: DataTransfer, editor: editor) = this()
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

