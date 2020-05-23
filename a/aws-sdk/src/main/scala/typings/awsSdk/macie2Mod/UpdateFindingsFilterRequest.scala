package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsFilterRequest extends js.Object {
  /**
    * The action to perform on findings that meet the filter criteria (findingCriteria). Valid values are: ARCHIVE, automatically archive the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.native
  /**
    * A custom description of the filter. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a filter. Other users might be able to see the filter's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The criteria to use to filter findings.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string = js.native
  /**
    * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. We strongly recommend that you avoid including any sensitive data in the name of a filter. Other users might be able to see the filter's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.native
}

object UpdateFindingsFilterRequest {
  @scala.inline
  def apply(
    id: string,
    action: FindingsFilterAction = null,
    description: string = null,
    findingCriteria: FindingCriteria = null,
    name: string = null,
    position: js.UndefOr[integer] = js.undefined
  ): UpdateFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (findingCriteria != null) __obj.updateDynamic("findingCriteria")(findingCriteria.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFilterRequest]
  }
}

