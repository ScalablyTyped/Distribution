package typings.cliBoxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Style of the box border.
	*/
@js.native
trait BoxStyle extends js.Object {
  val bottomLeft: String = js.native
  val bottomRight: String = js.native
  val horizontal: String = js.native
  val topLeft: String = js.native
  val topRight: String = js.native
  val vertical: String = js.native
}

object BoxStyle {
  @scala.inline
  def apply(
    bottomLeft: String,
    bottomRight: String,
    horizontal: String,
    topLeft: String,
    topRight: String,
    vertical: String
  ): BoxStyle = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxStyle]
  }
  @scala.inline
  implicit class BoxStyleOps[Self <: BoxStyle] (val x: Self) extends AnyVal {
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
    def setBottomLeft(value: String): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomRight(value: String): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: String): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRight(value: String): Self = this.set("topRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

