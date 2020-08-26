package typings.behavior3.anon

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxLoop extends js.Object {
  var child: js.UndefOr[BaseNode] = js.native
  var maxLoop: js.UndefOr[Double] = js.native
}

object MaxLoop {
  @scala.inline
  def apply(): MaxLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxLoop]
  }
  @scala.inline
  implicit class MaxLoopOps[Self <: MaxLoop] (val x: Self) extends AnyVal {
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
    def setChild(value: BaseNode): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setMaxLoop(value: Double): Self = this.set("maxLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLoop: Self = this.set("maxLoop", js.undefined)
  }
  
}

