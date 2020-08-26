package typings.dagreLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  var name: js.UndefOr[String] = js.native
  var v: String = js.native
  var w: String = js.native
}

object Edge {
  @scala.inline
  def apply(v: String, w: String): Edge = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
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
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

