package typings.cliDashBoxes.cliDashBoxesMod

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
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft, bottomRight = bottomRight, horizontal = horizontal, topLeft = topLeft, topRight = topRight, vertical = vertical)
  
    __obj.asInstanceOf[BoxStyle]
  }
}

