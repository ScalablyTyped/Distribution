package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntentMetadata extends js.Object {
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The date that the intent was updated. When you create an intent, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}

object IntentMetadata {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: IntentName = null,
    version: Version = null
  ): IntentMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentMetadata]
  }
}

