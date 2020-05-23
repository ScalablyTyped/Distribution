package typings.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchIssueParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var actualHours: js.UndefOr[Double] = js.undefined
  var assigneeId: js.UndefOr[Double] = js.undefined
  var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
  var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dueDate: js.UndefOr[String] = js.undefined
  var estimatedHours: js.UndefOr[Double] = js.undefined
  var issueTypeId: js.UndefOr[Double] = js.undefined
  var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var parentIssueId: js.UndefOr[Double] = js.undefined
  var priorityId: js.UndefOr[Double] = js.undefined
  var resolutionId: js.UndefOr[Double] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var statusId: js.UndefOr[Double] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var versionId: js.UndefOr[js.Array[Double]] = js.undefined
}

object PatchIssueParams {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    actualHours: js.UndefOr[Double] = js.undefined,
    assigneeId: js.UndefOr[Double] = js.undefined,
    attachmentId: js.Array[Double] = null,
    categoryId: js.Array[Double] = null,
    comment: String = null,
    description: String = null,
    dueDate: String = null,
    estimatedHours: js.UndefOr[Double] = js.undefined,
    issueTypeId: js.UndefOr[Double] = js.undefined,
    milestoneId: js.Array[Double] = null,
    notifiedUserId: js.Array[Double] = null,
    parentIssueId: js.UndefOr[Double] = js.undefined,
    priorityId: js.UndefOr[Double] = js.undefined,
    resolutionId: js.UndefOr[Double] = js.undefined,
    startDate: String = null,
    statusId: js.UndefOr[Double] = js.undefined,
    summary: String = null,
    versionId: js.Array[Double] = null
  ): PatchIssueParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(actualHours)) __obj.updateDynamic("actualHours")(actualHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(assigneeId)) __obj.updateDynamic("assigneeId")(assigneeId.get.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedHours)) __obj.updateDynamic("estimatedHours")(estimatedHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(issueTypeId)) __obj.updateDynamic("issueTypeId")(issueTypeId.get.asInstanceOf[js.Any])
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId.asInstanceOf[js.Any])
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId.asInstanceOf[js.Any])
    if (!js.isUndefined(parentIssueId)) __obj.updateDynamic("parentIssueId")(parentIssueId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priorityId)) __obj.updateDynamic("priorityId")(priorityId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolutionId)) __obj.updateDynamic("resolutionId")(resolutionId.get.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(statusId)) __obj.updateDynamic("statusId")(statusId.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchIssueParams]
  }
}

