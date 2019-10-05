package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.observer

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutatedText extends js.Object {
  var newText: String
  var node: Text
  var oldText: String
  var `type`: String
}

object MutatedText {
  @scala.inline
  def apply(newText: String, node: Text, oldText: String, `type`: String): MutatedText = {
    val __obj = js.Dynamic.literal(newText = newText, node = node, oldText = oldText)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MutatedText]
  }
}

