package typings.ckeditor.CKEDITOR.fileTools

import typings.ckeditor.CKEDITOR.event
import typings.std.Blob
import typings.std.FileReader
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fileLoader extends event {
  val data: String = js.native
  val file: Blob = js.native
  val fileName: String = js.native
  val id: Double = js.native
  val loaded: Double = js.native
  val message: String = js.native
  val reader: FileReader = js.native
  val responseData: js.Any = js.native
  var status: String = js.native
  val total: Double = js.native
  val uploadTotal: Double = js.native
  val uploadUrl: String = js.native
  val uploaded: String = js.native
  val url: String = js.native
  val xhr: XMLHttpRequest = js.native
  def abort(): Unit = js.native
  def isFinished(): Boolean = js.native
  def load(): Unit = js.native
  def loadAndUpload(url: String): Unit = js.native
  def loadAndUpload(url: String, additionalRequestParameters: js.Any): Unit = js.native
  def update(): Unit = js.native
  def upload(url: String): Unit = js.native
  def upload(url: String, additionalRequestParameters: js.Any): Unit = js.native
}

