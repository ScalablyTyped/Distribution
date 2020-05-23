package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait text extends node {
  var `type`: Double = js.native
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

