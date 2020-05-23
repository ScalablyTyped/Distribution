package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexItemLayout extends js.Object {
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Matches the flex CSS property and its available values.
    * Default is "1 1 auto".
    */
  var flex: js.UndefOr[String] = js.undefined
  /**
    * Matches the order CSS property and its available values.
    */
  var order: js.UndefOr[Double] = js.undefined
}

object FlexItemLayout {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    flex: String = null,
    order: js.UndefOr[Double] = js.undefined
  ): FlexItemLayout = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexItemLayout]
  }
}

