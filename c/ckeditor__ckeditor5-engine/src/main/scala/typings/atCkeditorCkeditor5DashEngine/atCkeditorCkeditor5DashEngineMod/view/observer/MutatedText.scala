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
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatedText]
  }
}

