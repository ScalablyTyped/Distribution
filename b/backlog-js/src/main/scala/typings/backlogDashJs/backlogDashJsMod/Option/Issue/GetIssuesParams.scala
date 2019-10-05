package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import typings.backlogDashJs.backlogDashJsMod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIssuesParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var assigneeId: js.UndefOr[js.Array[Double]] = js.undefined
  var attachment: js.UndefOr[Boolean] = js.undefined
  var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var createdSince: js.UndefOr[String] = js.undefined
  var createdUntil: js.UndefOr[String] = js.undefined
  var createdUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var dueDateSince: js.UndefOr[String] = js.undefined
  var dueDateUntil: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[js.Array[Double]] = js.undefined
  var issueTypeId: js.UndefOr[js.Array[Double]] = js.undefined
  var keyword: String
  var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
  var parentChild: js.UndefOr[ParentChildType] = js.undefined
  var parentIssueId: js.UndefOr[js.Array[Double]] = js.undefined
  var priorityId: js.UndefOr[js.Array[Double]] = js.undefined
  var projectId: js.UndefOr[js.Array[Double]] = js.undefined
  var resolutionId: js.UndefOr[js.Array[Double]] = js.undefined
  var sharedFile: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[SortKey] = js.undefined
  var startDateSince: js.UndefOr[String] = js.undefined
  var startDateUntil: js.UndefOr[String] = js.undefined
  var statusId: js.UndefOr[js.Array[Double]] = js.undefined
  var updatedSince: js.UndefOr[String] = js.undefined
  var updatedUntil: js.UndefOr[String] = js.undefined
  var versionId: js.UndefOr[js.Array[Double]] = js.undefined
}

object GetIssuesParams {
  @scala.inline
  def apply(
    keyword: String,
    StringDictionary: /* customField_ */ StringDictionary[js.Any] = null,
    assigneeId: js.Array[Double] = null,
    attachment: js.UndefOr[Boolean] = js.undefined,
    categoryId: js.Array[Double] = null,
    count: Int | Double = null,
    createdSince: String = null,
    createdUntil: String = null,
    createdUserId: js.Array[Double] = null,
    dueDateSince: String = null,
    dueDateUntil: String = null,
    id: js.Array[Double] = null,
    issueTypeId: js.Array[Double] = null,
    milestoneId: js.Array[Double] = null,
    offset: Int | Double = null,
    order: Order = null,
    parentChild: ParentChildType = null,
    parentIssueId: js.Array[Double] = null,
    priorityId: js.Array[Double] = null,
    projectId: js.Array[Double] = null,
    resolutionId: js.Array[Double] = null,
    sharedFile: js.UndefOr[Boolean] = js.undefined,
    sort: SortKey = null,
    startDateSince: String = null,
    startDateUntil: String = null,
    statusId: js.Array[Double] = null,
    updatedSince: String = null,
    updatedUntil: String = null,
    versionId: js.Array[Double] = null
  ): GetIssuesParams = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId)
    if (!js.isUndefined(attachment)) __obj.updateDynamic("attachment")(attachment)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (createdSince != null) __obj.updateDynamic("createdSince")(createdSince)
    if (createdUntil != null) __obj.updateDynamic("createdUntil")(createdUntil)
    if (createdUserId != null) __obj.updateDynamic("createdUserId")(createdUserId)
    if (dueDateSince != null) __obj.updateDynamic("dueDateSince")(dueDateSince)
    if (dueDateUntil != null) __obj.updateDynamic("dueDateUntil")(dueDateUntil)
    if (id != null) __obj.updateDynamic("id")(id)
    if (issueTypeId != null) __obj.updateDynamic("issueTypeId")(issueTypeId)
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (parentChild != null) __obj.updateDynamic("parentChild")(parentChild)
    if (parentIssueId != null) __obj.updateDynamic("parentIssueId")(parentIssueId)
    if (priorityId != null) __obj.updateDynamic("priorityId")(priorityId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (resolutionId != null) __obj.updateDynamic("resolutionId")(resolutionId)
    if (!js.isUndefined(sharedFile)) __obj.updateDynamic("sharedFile")(sharedFile)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (startDateSince != null) __obj.updateDynamic("startDateSince")(startDateSince)
    if (startDateUntil != null) __obj.updateDynamic("startDateUntil")(startDateUntil)
    if (statusId != null) __obj.updateDynamic("statusId")(statusId)
    if (updatedSince != null) __obj.updateDynamic("updatedSince")(updatedSince)
    if (updatedUntil != null) __obj.updateDynamic("updatedUntil")(updatedUntil)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[GetIssuesParams]
  }
}

