package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobCategory extends js.Object {
  var id: String
  var name: String
}

object AgentJobCategory {
  @scala.inline
  def apply(id: String, name: String): AgentJobCategory = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobCategory]
  }
}

