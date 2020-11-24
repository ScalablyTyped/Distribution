package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait comment extends node {
  
  def filter(filter: typings.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  
  var `type`: Double = js.native
  
  var value: String = js.native
  
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}
