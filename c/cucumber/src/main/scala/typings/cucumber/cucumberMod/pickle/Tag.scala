package typings.cucumber.cucumberMod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var location: Location
  var name: String
}

object Tag {
  @scala.inline
  def apply(location: Location, name: String): Tag = {
    val __obj = js.Dynamic.literal(location = location, name = name)
  
    __obj.asInstanceOf[Tag]
  }
}

