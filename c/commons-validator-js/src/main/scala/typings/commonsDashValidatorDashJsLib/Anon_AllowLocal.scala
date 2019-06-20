package typings
package commonsDashValidatorDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowLocal extends js.Object {
  var allowLocal: scala.Boolean
  var allowTld: scala.Boolean
}

object Anon_AllowLocal {
  @scala.inline
  def apply(allowLocal: scala.Boolean, allowTld: scala.Boolean): Anon_AllowLocal = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal, allowTld = allowTld)
  
    __obj.asInstanceOf[Anon_AllowLocal]
  }
}

