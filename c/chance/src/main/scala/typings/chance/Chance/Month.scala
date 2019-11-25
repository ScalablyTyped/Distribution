package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Month extends js.Object {
  var name: String
  var numeric: String
  var short_name: String
}

object Month {
  @scala.inline
  def apply(name: String, numeric: String, short_name: String): Month = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Month]
  }
}

