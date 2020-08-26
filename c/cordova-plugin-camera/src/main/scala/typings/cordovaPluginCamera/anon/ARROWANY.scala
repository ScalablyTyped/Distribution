package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARROWANY extends js.Object {
  var ARROW_ANY: Double = js.native
  var ARROW_DOWN: Double = js.native
  var ARROW_LEFT: Double = js.native
  var ARROW_RIGHT: Double = js.native
  var ARROW_UP: Double = js.native
}

object ARROWANY {
  @scala.inline
  def apply(ARROW_ANY: Double, ARROW_DOWN: Double, ARROW_LEFT: Double, ARROW_RIGHT: Double, ARROW_UP: Double): ARROWANY = {
    val __obj = js.Dynamic.literal(ARROW_ANY = ARROW_ANY.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARROWANY]
  }
  @scala.inline
  implicit class ARROWANYOps[Self <: ARROWANY] (val x: Self) extends AnyVal {
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
    def setARROW_ANY(value: Double): Self = this.set("ARROW_ANY", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_DOWN(value: Double): Self = this.set("ARROW_DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_LEFT(value: Double): Self = this.set("ARROW_LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_RIGHT(value: Double): Self = this.set("ARROW_RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_UP(value: Double): Self = this.set("ARROW_UP", value.asInstanceOf[js.Any])
  }
  
}

