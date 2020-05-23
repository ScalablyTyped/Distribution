package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.ui.panel.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait panel_ extends js.Object {
  def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
  def getBlock(name: String): block = js.native
  def render(editor: editor): Unit = js.native
  def render(editor: editor, output: js.Array[String]): Unit = js.native
  def showBlock(name: String): Unit = js.native
}

