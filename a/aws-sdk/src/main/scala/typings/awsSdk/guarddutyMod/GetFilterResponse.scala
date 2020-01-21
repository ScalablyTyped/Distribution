package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFilterResponse extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: FilterAction = js.native
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.native
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: typings.awsSdk.guarddutyMod.FindingCriteria = js.native
  /**
    * The name of the filter.
    */
  var Name: FilterName = js.native
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.native
  /**
    * The tags of the filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object GetFilterResponse {
  @scala.inline
  def apply(
    Action: FilterAction,
    FindingCriteria: FindingCriteria,
    Name: FilterName,
    Description: FilterDescription = null,
    Rank: Int | scala.Double = null,
    Tags: TagMap = null
  ): GetFilterResponse = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FindingCriteria = FindingCriteria.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Rank != null) __obj.updateDynamic("Rank")(Rank.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFilterResponse]
  }
}

