package typings.backstopjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeypressSelector extends js.Object {
  var keyPress: String
  var selector: String
}

object KeypressSelector {
  @scala.inline
  def apply(keyPress: String, selector: String): KeypressSelector = {
    val __obj = js.Dynamic.literal(keyPress = keyPress.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeypressSelector]
  }
}

