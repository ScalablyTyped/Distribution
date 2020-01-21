package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectUsersParams extends js.Object {
  var userId: Double
}

object DeleteProjectUsersParams {
  @scala.inline
  def apply(userId: Double): DeleteProjectUsersParams = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProjectUsersParams]
  }
}

