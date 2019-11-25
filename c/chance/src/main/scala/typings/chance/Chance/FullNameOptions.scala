package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullNameOptions extends js.Object {
  var middle: Boolean
  var middle_initial: Boolean
  var prefix: Boolean
  var suffix: Boolean
}

object FullNameOptions {
  @scala.inline
  def apply(middle: Boolean, middle_initial: Boolean, prefix: Boolean, suffix: Boolean): FullNameOptions = {
    val __obj = js.Dynamic.literal(middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullNameOptions]
  }
}

