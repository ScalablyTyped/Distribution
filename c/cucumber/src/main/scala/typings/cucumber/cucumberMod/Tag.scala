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
    val __obj = js.Dynamic.literal(line = line, name = name)
  
    __obj.asInstanceOf[Tag]
  }
}

