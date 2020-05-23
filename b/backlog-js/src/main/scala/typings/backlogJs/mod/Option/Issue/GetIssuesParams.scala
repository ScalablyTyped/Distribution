package typings.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import typings.backlogJs.mod.Option.Order
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    assigneeId: js.Array[Double] = null,
    attachment: js.UndefOr[Boolean] = js.undefined,
    categoryId: js.Array[Double] = null,
    count: js.UndefOr[Double] = js.undefined,
    createdSince: String = null,
    createdUntil: String = null,
    createdUserId: js.Array[Double] = null,
    dueDateSince: String = null,
    dueDateUntil: String = null,
    id: js.Array[Double] = null,
    issueTypeId: js.Array[Double] = null,
    milestoneId: js.Array[Double] = null,
    offset: js.UndefOr[Double] = js.undefined,
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
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId.asInstanceOf[js.Any])
    if (!js.isUndefined(attachment)) __obj.updateDynamic("attachment")(attachment.get.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (createdSince != null) __obj.updateDynamic("createdSince")(createdSince.asInstanceOf[js.Any])
    if (createdUntil != null) __obj.updateDynamic("createdUntil")(createdUntil.asInstanceOf[js.Any])
    if (createdUserId != null) __obj.updateDynamic("createdUserId")(createdUserId.asInstanceOf[js.Any])
    if (dueDateSince != null) __obj.updateDynamic("dueDateSince")(dueDateSince.asInstanceOf[js.Any])
    if (dueDateUntil != null) __obj.updateDynamic("dueDateUntil")(dueDateUntil.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (issueTypeId != null) __obj.updateDynamic("issueTypeId")(issueTypeId.asInstanceOf[js.Any])
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parentChild != null) __obj.updateDynamic("parentChild")(parentChild.asInstanceOf[js.Any])
    if (parentIssueId != null) __obj.updateDynamic("parentIssueId")(parentIssueId.asInstanceOf[js.Any])
    if (priorityId != null) __obj.updateDynamic("priorityId")(priorityId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (resolutionId != null) __obj.updateDynamic("resolutionId")(resolutionId.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedFile)) __obj.updateDynamic("sharedFile")(sharedFile.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (startDateSince != null) __obj.updateDynamic("startDateSince")(startDateSince.asInstanceOf[js.Any])
    if (startDateUntil != null) __obj.updateDynamic("startDateUntil")(startDateUntil.asInstanceOf[js.Any])
    if (statusId != null) __obj.updateDynamic("statusId")(statusId.asInstanceOf[js.Any])
    if (updatedSince != null) __obj.updateDynamic("updatedSince")(updatedSince.asInstanceOf[js.Any])
    if (updatedUntil != null) __obj.updateDynamic("updatedUntil")(updatedUntil.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIssuesParams]
  }
}

