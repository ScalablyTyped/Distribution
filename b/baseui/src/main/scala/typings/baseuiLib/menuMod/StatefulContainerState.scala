package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerState extends js.Object {
  var activedescendantId: js.UndefOr[java.lang.String] = js.undefined
  var highlightedIndex: scala.Double
  var isFocused: scala.Boolean
}

object StatefulContainerState {
  @scala.inline
  def apply(
    highlightedIndex: scala.Double,
    isFocused: scala.Boolean,
    activedescendantId: java.lang.String = null
  ): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex, isFocused = isFocused)
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId)
    __obj.asInstanceOf[StatefulContainerState]
  }
}

