package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivItemLayout extends js.Object {
  /**
  		 * Matches the CSS style key and its available values.
  		 */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * Matches the order CSS property and its available values.
  		 */
  var order: js.UndefOr[Double] = js.undefined
}

object DivItemLayout {
  @scala.inline
  def apply(CSSStyles: StringDictionary[String] = null, order: Int | Double = null): DivItemLayout = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivItemLayout]
  }
}

