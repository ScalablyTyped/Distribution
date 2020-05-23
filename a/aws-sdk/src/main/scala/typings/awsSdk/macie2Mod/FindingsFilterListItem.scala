package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingsFilterListItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the filter.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the filter.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The custom name of the filter.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object FindingsFilterListItem {
  @scala.inline
  def apply(arn: string = null, id: string = null, name: string = null, tags: TagMap = null): FindingsFilterListItem = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingsFilterListItem]
  }
}

