package typings.carlo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOptions extends js.Object {
  /**
    * Background color using hex notation, defaults to '#ffffff'.
    */
  var bgcolor: js.UndefOr[String] = js.native
  /**
    * App window height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * App window left offset in pixels.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * App window top offset in pixels.
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * App window width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object WindowOptions {
  @scala.inline
  def apply(): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

