package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupFilter extends js.Object {
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.undefined
  /**
    * The tag value.
    */
  var tagValue: js.UndefOr[String] = js.undefined
}

object ResourceGroupFilter {
  @scala.inline
  def apply(tagName: String = null, tagValue: String = null): ResourceGroupFilter = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (tagValue != null) __obj.updateDynamic("tagValue")(tagValue)
    __obj.asInstanceOf[ResourceGroupFilter]
  }
}

