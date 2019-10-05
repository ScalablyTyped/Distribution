package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostVersionsParams extends js.Object {
  var description: String
  var name: String
  var releaseDueDate: String
  var startDate: String
}

object PostVersionsParams {
  @scala.inline
  def apply(description: String, name: String, releaseDueDate: String, startDate: String): PostVersionsParams = {
    val __obj = js.Dynamic.literal(description = description, name = name, releaseDueDate = releaseDueDate, startDate = startDate)
  
    __obj.asInstanceOf[PostVersionsParams]
  }
}

