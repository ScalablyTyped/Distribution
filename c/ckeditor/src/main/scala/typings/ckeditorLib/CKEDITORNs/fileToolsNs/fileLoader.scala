package typings
package ckeditorLib.CKEDITORNs.fileToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools.fileLoader")
@js.native
class fileLoader protected ()
  extends ckeditorLib.CKEDITORNs.event {
  def this(editor: ckeditorLib.CKEDITORNs.editor, fileOrData: java.lang.String) = this()
  def this(editor: ckeditorLib.CKEDITORNs.editor, fileOrData: stdLib.Blob) = this()
  def this(editor: ckeditorLib.CKEDITORNs.editor, fileOrData: java.lang.String, fileName: java.lang.String) = this()
  def this(editor: ckeditorLib.CKEDITORNs.editor, fileOrData: stdLib.Blob, fileName: java.lang.String) = this()
  val data: java.lang.String = js.native
  val file: stdLib.Blob = js.native
  val fileName: java.lang.String = js.native
  val id: scala.Double = js.native
  val loaded: scala.Double = js.native
  val message: java.lang.String = js.native
  val reader: stdLib.FileReader = js.native
  val responseData: js.Any = js.native
  var status: java.lang.String = js.native
  val total: scala.Double = js.native
  val uploadTotal: scala.Double = js.native
  val uploadUrl: java.lang.String = js.native
  val uploaded: java.lang.String = js.native
  val url: java.lang.String = js.native
  val xhr: stdLib.XMLHttpRequest = js.native
  def abort(): scala.Unit = js.native
  def isFinished(): scala.Boolean = js.native
  def load(): scala.Unit = js.native
  def loadAndUpload(url: java.lang.String): scala.Unit = js.native
  def loadAndUpload(url: java.lang.String, additionalRequestParameters: js.Any): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def upload(url: java.lang.String): scala.Unit = js.native
  def upload(url: java.lang.String, additionalRequestParameters: js.Any): scala.Unit = js.native
}

