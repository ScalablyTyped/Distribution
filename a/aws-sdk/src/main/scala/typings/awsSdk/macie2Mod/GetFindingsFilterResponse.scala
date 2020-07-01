package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsFilterResponse extends js.Object {
  /**
    * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.native
  /**
    * The Amazon Resource Name (ARN) of the filter.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The custom description of the filter.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The criteria that's used to filter findings.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  /**
    * The unique identifier for the filter.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The custom name of the filter.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.native
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object GetFindingsFilterResponse {
  @scala.inline
  def apply(
    action: FindingsFilterAction = null,
    arn: string = null,
    description: string = null,
    findingCriteria: FindingCriteria = null,
    id: string = null,
    name: string = null,
    position: js.UndefOr[integer] = js.undefined,
    tags: TagMap = null
  ): GetFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (findingCriteria != null) __obj.updateDynamic("findingCriteria")(findingCriteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsFilterResponse]
  }
}

