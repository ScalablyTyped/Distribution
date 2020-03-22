package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewLayout extends FlexLayout {
  /**
  		 * Orientation of the views inside split
  		 */
  var orientation: String
  /**
  		 * SplitView height
  		 */
  var splitViewHeight: Double | String
}

object SplitViewLayout {
  @scala.inline
  def apply(
    orientation: String,
    splitViewHeight: Double | String,
    alignContent: AlignContentType = null,
    alignItems: AlignItemsType = null,
    flexFlow: String = null,
    flexWrap: FlexWrapType = null,
    height: Double | String = null,
    justifyContent: JustifyContentType = null,
    position: PositionType = null,
    textAlign: TextAlignType = null,
    width: Double | String = null
  ): SplitViewLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], splitViewHeight = splitViewHeight.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (flexFlow != null) __obj.updateDynamic("flexFlow")(flexFlow.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewLayout]
  }
}

