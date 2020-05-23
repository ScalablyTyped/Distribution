package typings.ckeditor.global.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ajax")
@js.native
object ajax extends js.Object {
  def load(url: String): String = js.native
  def load(url: String, callback: js.Function1[/* data */ js.Any, Unit]): String = js.native
  def loadXml(url: String): typings.ckeditor.CKEDITOR.xml = js.native
  def loadXml(url: String, callback: js.Function1[/* data */ js.Any, Unit]): typings.ckeditor.CKEDITOR.xml = js.native
  def post(url: String, data: js.Any): Unit = js.native
  def post(url: String, data: js.Any, contentType: String): Unit = js.native
  def post(url: String, data: js.Any, contentType: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
}

