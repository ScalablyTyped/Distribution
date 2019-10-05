package typings.backlogDashJs.backlogDashJsMod.Option.Issue

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
    StringDictionary: /* customField_ */ StringDictionary[js.Any] = null,
    actualHours: Int | Double = null,
    assigneeId: Int | Double = null,
    attachmentId: js.Array[Double] = null,
    categoryId: js.Array[Double] = null,
    comment: String = null,
    description: String = null,
    dueDate: String = null,
    estimatedHours: Int | Double = null,
    issueTypeId: Int | Double = null,
    milestoneId: js.Array[Double] = null,
    notifiedUserId: js.Array[Double] = null,
    parentIssueId: Int | Double = null,
    priorityId: Int | Double = null,
    resolutionId: Int | Double = null,
    startDate: String = null,
    statusId: Int | Double = null,
    summary: String = null,
    versionId: js.Array[Double] = null
  ): PatchIssueParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actualHours != null) __obj.updateDynamic("actualHours")(actualHours.asInstanceOf[js.Any])
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate)
    if (estimatedHours != null) __obj.updateDynamic("estimatedHours")(estimatedHours.asInstanceOf[js.Any])
    if (issueTypeId != null) __obj.updateDynamic("issueTypeId")(issueTypeId.asInstanceOf[js.Any])
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId)
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId)
    if (parentIssueId != null) __obj.updateDynamic("parentIssueId")(parentIssueId.asInstanceOf[js.Any])
    if (priorityId != null) __obj.updateDynamic("priorityId")(priorityId.asInstanceOf[js.Any])
    if (resolutionId != null) __obj.updateDynamic("resolutionId")(resolutionId.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (statusId != null) __obj.updateDynamic("statusId")(statusId.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[PatchIssueParams]
  }
}

