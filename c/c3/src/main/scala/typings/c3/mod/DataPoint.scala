package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  var id: String
  var index: Double
  var value: Double
  var x: Double
}

object DataPoint {
  @scala.inline
  def apply(id: String, index: Double, value: Double, x: Double): DataPoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataPoint]
  }
}

