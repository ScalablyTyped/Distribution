package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullNameOptions extends js.Object {
  var middle: scala.Boolean
  var middle_initial: scala.Boolean
  var prefix: scala.Boolean
  var suffix: scala.Boolean
}

object FullNameOptions {
  @scala.inline
  def apply(middle: scala.Boolean, middle_initial: scala.Boolean, prefix: scala.Boolean, suffix: scala.Boolean): FullNameOptions = {
    val __obj = js.Dynamic.literal(middle = middle, middle_initial = middle_initial, prefix = prefix, suffix = suffix)
  
    __obj.asInstanceOf[FullNameOptions]
  }
}

