package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<bem-cn.bem-cn.BemStatePrefix, bem-cn.bem-cn.BemState> */
trait BemStates extends js.Object {
  var `has-`: BemState
  var `is-`: BemState
}

object BemStates {
  @scala.inline
  def apply(`has-`: BemState, `is-`: BemState): BemStates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has-")(`has-`.asInstanceOf[js.Any])
    __obj.updateDynamic("is-")(`is-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemStates]
  }
}

