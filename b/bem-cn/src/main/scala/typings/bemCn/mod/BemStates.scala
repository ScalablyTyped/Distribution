package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<bem-cn.bem-cn.BemStatePrefix, bem-cn.bem-cn.BemState> */
@js.native
trait BemStates extends js.Object {
  var `has-`: BemState = js.native
  var `is-`: BemState = js.native
}

object BemStates {
  @scala.inline
  def apply(`has-`: BemState, `is-`: BemState): BemStates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has-")(`has-`.asInstanceOf[js.Any])
    __obj.updateDynamic("is-")(`is-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemStates]
  }
  @scala.inline
  implicit class BemStatesOps[Self <: BemStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setHas-`(value: BemState): Self = this.set("has-", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIs-`(value: BemState): Self = this.set("is-", value.asInstanceOf[js.Any])
  }
  
}

