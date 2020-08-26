package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OddColor extends js.Object {
  var evenColor: js.UndefOr[Property] = js.native
  var oddColor: js.UndefOr[Property] = js.native
  var offset: js.UndefOr[Property] = js.native
  var orientation: js.UndefOr[Property] = js.native
  var repeat: js.UndefOr[Property] = js.native
}

object OddColor {
  @scala.inline
  def apply(): OddColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OddColor]
  }
  @scala.inline
  implicit class OddColorOps[Self <: OddColor] (val x: Self) extends AnyVal {
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
    def setEvenColor(value: Property): Self = this.set("evenColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenColor: Self = this.set("evenColor", js.undefined)
    @scala.inline
    def setOddColor(value: Property): Self = this.set("oddColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOddColor: Self = this.set("oddColor", js.undefined)
    @scala.inline
    def setOffset(value: Property): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrientation(value: Property): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setRepeat(value: Property): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

