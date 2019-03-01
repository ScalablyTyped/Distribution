package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frozen extends js.Object {
  var frozen: scala.Boolean
  var reversed: scala.Boolean
}

object Anon_Frozen {
  @scala.inline
  def apply(frozen: scala.Boolean, reversed: scala.Boolean): Anon_Frozen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frozen")(frozen)
    __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_Frozen]
  }
}

