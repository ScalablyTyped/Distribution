package typings.azureArmResource.resourceModelsMod

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
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDetails]
  }
}

