package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDataIdentifierSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
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

object CustomDataIdentifierSummary {
  @scala.inline
  def apply(
    arn: string = null,
    createdAt: timestampIso8601 = null,
    description: string = null,
    id: string = null,
    name: string = null
  ): CustomDataIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataIdentifierSummary]
  }
}

