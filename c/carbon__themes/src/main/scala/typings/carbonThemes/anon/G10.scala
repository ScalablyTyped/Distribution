package typings.carbonThemes.anon

import typings.carbonThemes.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait G10 extends js.Object {
  var g10: Theme = js.native
  var g100: Theme = js.native
  var g90: Theme = js.native
  var white: Theme = js.native
}

object G10 {
  @scala.inline
  def apply(g10: Theme, g100: Theme, g90: Theme, white: Theme): G10 = {
    val __obj = js.Dynamic.literal(g10 = g10.asInstanceOf[js.Any], g100 = g100.asInstanceOf[js.Any], g90 = g90.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[G10]
  }
  @scala.inline
  implicit class G10Ops[Self <: G10] (val x: Self) extends AnyVal {
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
    def setG10(value: Theme): Self = this.set("g10", value.asInstanceOf[js.Any])
    @scala.inline
    def setG100(value: Theme): Self = this.set("g100", value.asInstanceOf[js.Any])
    @scala.inline
    def setG90(value: Theme): Self = this.set("g90", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhite(value: Theme): Self = this.set("white", value.asInstanceOf[js.Any])
  }
  
}

