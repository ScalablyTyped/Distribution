package typings
package ckeditorLib.CKEDITORNs.fileToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools.uploadRepository")
@js.native
class uploadRepository protected ()
  extends ckeditorLib.CKEDITORNs.event {
  def this(editor: ckeditorLib.CKEDITORNs.editor) = this()
  val loaders: js.Array[fileLoader] = js.native
  def create(fileOrData: java.lang.String, fileName: java.lang.String): fileLoader = js.native
  def create(fileOrData: java.lang.String, fileName: java.lang.String, loaderType: js.Any): fileLoader = js.native
  def create(fileOrData: stdLib.Blob, fileName: java.lang.String): fileLoader = js.native
  def create(fileOrData: stdLib.Blob, fileName: java.lang.String, loaderType: js.Any): fileLoader = js.native
  def isFinished(): scala.Boolean = js.native
}

