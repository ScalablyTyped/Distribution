package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var line: Double
  var name: String
}

object Tag {
  @scala.inline
  def apply(line: Double, name: String): Tag = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

