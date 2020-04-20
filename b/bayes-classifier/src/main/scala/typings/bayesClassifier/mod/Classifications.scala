package typings.bayesClassifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classifications extends js.Object {
  var label: String
  var value: Double
}

object Classifications {
  @scala.inline
  def apply(label: String, value: Double): Classifications = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
}

