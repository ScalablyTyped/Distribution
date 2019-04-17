package typings
package cliDashBoxesLib.cliDashBoxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Style of the box border.
	*/
trait BoxStyle extends js.Object {
  val bottomLeft: java.lang.String
  val bottomRight: java.lang.String
  val horizontal: java.lang.String
  val topLeft: java.lang.String
  val topRight: java.lang.String
  val vertical: java.lang.String
}

object BoxStyle {
  @scala.inline
  def apply(
    bottomLeft: java.lang.String,
    bottomRight: java.lang.String,
    horizontal: java.lang.String,
    topLeft: java.lang.String,
    topRight: java.lang.String,
    vertical: java.lang.String
  ): BoxStyle = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft, bottomRight = bottomRight, horizontal = horizontal, topLeft = topLeft, topRight = topRight, vertical = vertical)
  
    __obj.asInstanceOf[BoxStyle]
  }
}

