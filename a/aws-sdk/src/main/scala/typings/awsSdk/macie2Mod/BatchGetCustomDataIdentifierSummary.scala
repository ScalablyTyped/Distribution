package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCustomDataIdentifierSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
    */
  var deleted: js.UndefOr[boolean] = js.native
  /**
    * The custom description of the custom data identifier.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the custom data identifier.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The custom name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.native
}

object BatchGetCustomDataIdentifierSummary {
  @scala.inline
  def apply(
    arn: string = null,
    createdAt: timestampIso8601 = null,
    deleted: js.UndefOr[boolean] = js.undefined,
    description: string = null,
    id: string = null,
    name: string = null
  ): BatchGetCustomDataIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCustomDataIdentifierSummary]
  }
}

