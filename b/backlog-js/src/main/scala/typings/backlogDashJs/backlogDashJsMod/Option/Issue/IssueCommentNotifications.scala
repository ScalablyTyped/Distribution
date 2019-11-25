package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueCommentNotifications extends js.Object {
  var notifiedUserId: js.Array[Double]
}

object IssueCommentNotifications {
  @scala.inline
  def apply(notifiedUserId: js.Array[Double]): IssueCommentNotifications = {
    val __obj = js.Dynamic.literal(notifiedUserId = notifiedUserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueCommentNotifications]
  }
}

