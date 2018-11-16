package typings
package ckeditorLib.CKEDITORNs.pluginsNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard.dataTransfer")
@js.native
class dataTransfer () extends js.Object {
  def this(nativeDataTransfer: stdLib.DataTransfer) = this()
  def this(nativeDataTransfer: stdLib.DataTransfer, editor: ckeditorLib.CKEDITORNs.editor) = this()
  @JSName("$")
  val $: stdLib.DataTransfer = js.native
  val id: java.lang.String = js.native
  val sourceEditor: ckeditorLib.CKEDITORNs.editor = js.native
  def cacheData(): scala.Unit = js.native
  def getData(`type`: java.lang.String): java.lang.String = js.native
  def getData(`type`: java.lang.String, getNative: scala.Boolean): java.lang.String = js.native
  def getFile(i: scala.Double): stdLib.File = js.native
  def getFilesCount(): scala.Double = js.native
  def getTransferType(targetEditor: ckeditorLib.CKEDITORNs.editor): scala.Double = js.native
  def isEmpty(): scala.Boolean = js.native
  def setData(`type`: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def storeId(): scala.Unit = js.native
}

