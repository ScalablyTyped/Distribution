package typings.axeCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String
  var help: String
}

object AnonDescription {
  @scala.inline
  def apply(description: String, help: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescription]
  }
}

