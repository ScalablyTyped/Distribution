package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dataProcessor extends js.Object {
  def toDataFormat(html: String, fixForBody: String): Unit = js.native
  def toHtml(data: String): Unit = js.native
  def toHtml(data: String, fixForBody: String): Unit = js.native
}

