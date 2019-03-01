package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Month extends js.Object {
  var name: java.lang.String
  var numeric: java.lang.String
  var short_name: java.lang.String
}

object Month {
  @scala.inline
  def apply(name: java.lang.String, numeric: java.lang.String, short_name: java.lang.String): Month = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("numeric")(numeric)
    __obj.updateDynamic("short_name")(short_name)
    __obj.asInstanceOf[Month]
  }
}

