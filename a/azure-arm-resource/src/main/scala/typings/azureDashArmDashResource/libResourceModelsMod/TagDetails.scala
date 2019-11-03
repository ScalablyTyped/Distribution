package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDetails extends js.Object {
  /**
    * The total number of resources that use the resource tag. When a tag is initially created and
    * has no associated resources, the value is 0.
    */
  var count: js.UndefOr[TagCount] = js.undefined
  /**
    * The tag ID.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.undefined
  /**
    * The list of tag values.
    */
  var values: js.UndefOr[js.Array[TagValue]] = js.undefined
}

object TagDetails {
  @scala.inline
  def apply(
    count: TagCount = null,
    id: String = null,
    tagName: String = null,
    values: js.Array[TagValue] = null
  ): TagDetails = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TagDetails]
  }
}

