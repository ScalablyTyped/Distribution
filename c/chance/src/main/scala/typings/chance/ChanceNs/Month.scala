package typings.chance.ChanceNs

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
    val __obj = js.Dynamic.literal(name = name, numeric = numeric, short_name = short_name)
  
    __obj.asInstanceOf[Month]
  }
}

