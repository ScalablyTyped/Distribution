package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvenColor extends js.Object {
  var evenColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var oddColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var repeat: js.UndefOr[Property] = js.native
}

object EvenColor {
  @scala.inline
  def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  @scala.inline
  implicit class EvenColorOps[Self <: EvenColor] (val x: Self) extends AnyVal {
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
    def setEvenColor(value: typings.cesium.mod.Color): Self = this.set("evenColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenColor: Self = this.set("evenColor", js.undefined)
    @scala.inline
    def setOddColor(value: typings.cesium.mod.Color): Self = this.set("oddColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOddColor: Self = this.set("oddColor", js.undefined)
    @scala.inline
    def setRepeat(value: Property): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

