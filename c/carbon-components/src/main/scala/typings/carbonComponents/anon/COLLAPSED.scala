package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait COLLAPSED extends js.Object {
  var COLLAPSED: String = js.native
  var EXPANDED: String = js.native
}

object COLLAPSED {
  @scala.inline
  def apply(COLLAPSED: String, EXPANDED: String): COLLAPSED = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[COLLAPSED]
  }
  @scala.inline
  implicit class COLLAPSEDOps[Self <: COLLAPSED] (val x: Self) extends AnyVal {
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
    def setCOLLAPSED(value: String): Self = this.set("COLLAPSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXPANDED(value: String): Self = this.set("EXPANDED", value.asInstanceOf[js.Any])
  }
  
}

