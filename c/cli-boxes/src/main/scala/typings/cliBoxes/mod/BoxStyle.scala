package typings.cliBoxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Style of the box border.
	*/
trait BoxStyle extends js.Object {
  val bottomLeft: String
  val bottomRight: String
  val horizontal: String
  val topLeft: String
  val topRight: String
  val vertical: String
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
}

