package typings.axeCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var help: String
}

object Description {
  @scala.inline
  def apply(description: String, help: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

