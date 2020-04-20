package typings.convertUnits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: AnonSingular
  var to_anchor: Double
}

object AnonName {
  @scala.inline
  def apply(name: AnonSingular, to_anchor: Double): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], to_anchor = to_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

