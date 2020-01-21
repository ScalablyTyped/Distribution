package typings.baseui

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveKey extends js.Object {
  var activeKey: Key
}

object AnonActiveKey {
  @scala.inline
  def apply(activeKey: Key): AnonActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveKey]
  }
}

