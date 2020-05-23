package typings.convertUnits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: Singular
  var to_anchor: Double
}

object Name {
  @scala.inline
  def apply(name: Singular, to_anchor: Double): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], to_anchor = to_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

