package typings.cucumber.cucumberMod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var location: Location
  var value: String
}

object Cell {
  @scala.inline
  def apply(location: Location, value: String): Cell = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cell]
  }
}

