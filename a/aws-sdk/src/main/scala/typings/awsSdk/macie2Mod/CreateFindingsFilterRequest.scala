package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFindingsFilterRequest extends js.Object {
  /**
    * The action to perform on findings that meet the filter criteria (findingCriteria). Valid values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: FindingsFilterAction = js.native
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
  /**
    * A custom description of the filter. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a filter. Other users of your account might be able to see the filter's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The criteria to use to filter findings.
    */
  var findingCriteria: FindingCriteria = js.native
  /**
    * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. We strongly recommend that you avoid including any sensitive data in the name of a filter. Other users of your account might be able to see the filter's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: string = js.native
  /**
    * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
    */
  var position: js.UndefOr[integer] = js.native
  /**
    * A map of key-value pairs that specifies the tags to associate with the filter. A findings filter can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateFindingsFilterRequest {
  @scala.inline
  def apply(
    action: FindingsFilterAction,
    findingCriteria: FindingCriteria,
    name: string,
    clientToken: string = null,
    description: string = null,
    position: js.UndefOr[integer] = js.undefined,
    tags: TagMap = null
  ): CreateFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], findingCriteria = findingCriteria.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFindingsFilterRequest]
  }
}

