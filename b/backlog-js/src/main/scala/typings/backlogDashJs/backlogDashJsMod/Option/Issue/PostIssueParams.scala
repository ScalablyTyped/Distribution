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
    val __obj = js.Dynamic.literal(issueTypeId = issueTypeId, priorityId = priorityId, projectId = projectId, summary = summary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actualHours != null) __obj.updateDynamic("actualHours")(actualHours.asInstanceOf[js.Any])
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate)
    if (estimatedHours != null) __obj.updateDynamic("estimatedHours")(estimatedHours.asInstanceOf[js.Any])
    if (milestoneId != null) __obj.updateDynamic("milestoneId")(milestoneId)
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId)
    if (parentIssueId != null) __obj.updateDynamic("parentIssueId")(parentIssueId.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[PostIssueParams]
  }
}

