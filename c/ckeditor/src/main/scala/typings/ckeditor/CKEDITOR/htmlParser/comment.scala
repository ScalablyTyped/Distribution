package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait comment extends node {
  var `type`: Double = js.native
  var value: String = js.native
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

