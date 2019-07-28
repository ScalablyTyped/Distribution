package typings.commonsDashValidatorDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowLocal extends js.Object {
  var allowLocal: Boolean
  var allowTld: Boolean
}

object Anon_AllowLocal {
  @scala.inline
  def apply(allowLocal: Boolean, allowTld: Boolean): Anon_AllowLocal = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal, allowTld = allowTld)
  
    __obj.asInstanceOf[Anon_AllowLocal]
  }
}

