package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostIssueParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var actualHours: js.UndefOr[Double] = js.undefined
  var assigneeId: js.UndefOr[Double] = js.undefined
  var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
  var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dueDate: js.UndefOr[String] = js.undefined
  var estimatedHours: js.UndefOr[Double] = js.undefined
  var issueTypeId: Double
  var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var parentIssueId: js.UndefOr[Double] = js.undefined
  var priorityId: Double
  var projectId: Double
  var startDate: js.UndefOr[String] = js.undefined
  var summary: String
  var versionId: js.UndefOr[js.Array[Double]] = js.undefined
}

object PostIssueParams {
  @scala.inline
  def apply(
    issueTypeId: Double,
    priorityId: Double,
    projectId: Double,
    summary: String,
    StringDictionary: /* customField_ */ StringDictionary[js.Any] = null,
    actualHours: Int | Double = null,
    assigneeId: Int | Double = null,
    attachmentId: js.Array[Double] = null,
    categoryId: js.Array[Double] = null,
    description: String = null,
    dueDate: String = null,
    estimatedHours: Int | Double = null,
    milestoneId: js.Array[Double] = null,
    notifiedUserId: js.Array[Double] = null,
    parentIssueId: Int | Double = null,
    startDate: String = null,
    versionId: js.Array[Double] = null
  ): PostIssueParams = {
    val __obj = js.Dynamic.literal(issueTypeId = issueTypeId.asInstanceOf[js.Any], priorityId = priorityId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actualHours != null) __obj.updateDynamic("actualHours")(actualHours.asInstanceOf[js.Any])
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate.asInstanceOf[js.Any])
    if (estimatedHours != null) __obj.updateDynamic("estimatedHours")(estimatedHours.asInstanceOf[js.Any])
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId.asInstanceOf[js.Any])
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId.asInstanceOf[js.Any])
    if (parentIssueId != null) __obj.updateDynamic("parentIssueId")(parentIssueId.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostIssueParams]
  }
}

