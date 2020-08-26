package typings.cathoQuantum.colorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsTones extends js.Object {
  var `100`: String = js.native
  var `300`: String = js.native
  var `500`: String = js.native
  var `700`: String = js.native
  var `900`: String = js.native
}

object ColorsTones {
  @scala.inline
  def apply(`100`: String, `300`: String, `500`: String, `700`: String, `900`: String): ColorsTones = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsTones]
  }
  @scala.inline
  implicit class ColorsTonesOps[Self <: ColorsTones] (val x: Self) extends AnyVal {
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
    def set100(value: String): Self = this.set("100", value.asInstanceOf[js.Any])
    @scala.inline
    def set300(value: String): Self = this.set("300", value.asInstanceOf[js.Any])
    @scala.inline
    def set500(value: String): Self = this.set("500", value.asInstanceOf[js.Any])
    @scala.inline
    def set700(value: String): Self = this.set("700", value.asInstanceOf[js.Any])
    @scala.inline
    def set900(value: String): Self = this.set("900", value.asInstanceOf[js.Any])
  }
  
}

