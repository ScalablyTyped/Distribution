package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCount extends js.Object {
  /**
    * Type of count.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Value of count.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object TagCount {
  @scala.inline
  def apply(`type`: String = null, value: js.UndefOr[Double] = js.undefined): TagCount = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCount]
  }
}

