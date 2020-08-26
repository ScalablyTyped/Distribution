package typings.dagre.mod

import typings.dagre.dagreStrings.c
import typings.dagre.dagreStrings.l
import typings.dagre.dagreStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeConfig extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var labeloffest: js.UndefOr[Double] = js.native
  var lablepos: js.UndefOr[l | c | r] = js.native
  var minlen: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object EdgeConfig {
  @scala.inline
  def apply(): EdgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeConfig]
  }
  @scala.inline
  implicit class EdgeConfigOps[Self <: EdgeConfig] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLabeloffest(value: Double): Self = this.set("labeloffest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabeloffest: Self = this.set("labeloffest", js.undefined)
    @scala.inline
    def setLablepos(value: l | c | r): Self = this.set("lablepos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLablepos: Self = this.set("lablepos", js.undefined)
    @scala.inline
    def setMinlen(value: Double): Self = this.set("minlen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinlen: Self = this.set("minlen", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

