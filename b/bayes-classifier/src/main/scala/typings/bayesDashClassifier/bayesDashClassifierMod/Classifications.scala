package typings.bayesDashClassifier.bayesDashClassifierMod

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
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[Classifications]
  }
}

