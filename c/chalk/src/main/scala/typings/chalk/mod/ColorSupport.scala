package typings.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Detect whether the terminal supports color.
	*/
@js.native
trait ColorSupport extends js.Object {
  /**
  		Return whether Chalk supports Truecolor 16 million colors.
  		*/
  var has16m: Boolean = js.native
  /**
  		Return whether Chalk supports ANSI 256 colors.
  		*/
  var has256: Boolean = js.native
  /**
  		Return whether Chalk supports basic 16 colors.
  		*/
  var hasBasic: Boolean = js.native
  /**
  		The color level used by Chalk.
  		*/
  var level: Level = js.native
}

object ColorSupport {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Level): ColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSupport]
  }
  @scala.inline
  implicit class ColorSupportOps[Self <: ColorSupport] (val x: Self) extends AnyVal {
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
    def setHas16m(value: Boolean): Self = this.set("has16m", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas256(value: Boolean): Self = this.set("has256", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBasic(value: Boolean): Self = this.set("hasBasic", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

