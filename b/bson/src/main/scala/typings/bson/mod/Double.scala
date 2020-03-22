package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Double")
@js.native
class Double protected () extends js.Object {
  /**
    * @param value The number we want to represent as a double.
    */
  def this(value: scala.Double) = this()
  /**
    * https://github.com/mongodb/js-bson/blob/master/lib/double.js#L17
    */
  var value: scala.Double = js.native
}

