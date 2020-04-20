package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostIssueTypeParams extends js.Object {
  var color: IssueTypeColor
  var name: String
}

object PostIssueTypeParams {
  @scala.inline
  def apply(color: IssueTypeColor, name: String): PostIssueTypeParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostIssueTypeParams]
  }
}

