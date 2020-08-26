package typings.blockies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockiesConfig extends js.Object {
  var bgcolor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
  var seed: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var spotcolor: js.UndefOr[String] = js.native
}

object BlockiesConfig {
  @scala.inline
  def apply(): BlockiesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockiesConfig]
  }
  @scala.inline
  implicit class BlockiesConfigOps[Self <: BlockiesConfig] (val x: Self) extends AnyVal {
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
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpotcolor(value: String): Self = this.set("spotcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotcolor: Self = this.set("spotcolor", js.undefined)
  }
  
}

