package typings.ckeditorCkeditor5Engine.mod.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/text
@JSImport("@ckeditor/ckeditor5-engine", "view.Text")
@js.native
class Text protected () extends Node {
  protected def this(data: String) = this()
  var _data: String = js.native
  var _textData: String = js.native
  val data: String = js.native
  def isSimilar(otherNode: Text): Boolean = js.native
}

