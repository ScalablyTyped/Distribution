package typings.d3pie.anon

import typings.d3pie.d3pieStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  location :'left' | undefined} & d3pie.d3pie.ID3PieTextOptions */
@js.native
trait locationleftundefinedID3P extends js.Object {
  var color: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var location: js.UndefOr[left] = js.native
  var text: js.UndefOr[String] = js.native
}

object locationleftundefinedID3P {
  @scala.inline
  def apply(): locationleftundefinedID3P = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[locationleftundefinedID3P]
  }
  @scala.inline
  implicit class locationleftundefinedID3POps[Self <: locationleftundefinedID3P] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setLocation(value: left): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

