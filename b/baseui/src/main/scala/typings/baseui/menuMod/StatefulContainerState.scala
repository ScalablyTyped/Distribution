package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerState extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.undefined
  var highlightedIndex: Double
  var isFocused: Boolean
}

object StatefulContainerState {
  @scala.inline
  def apply(highlightedIndex: Double, isFocused: Boolean, activedescendantId: String = null): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerState]
  }
}

