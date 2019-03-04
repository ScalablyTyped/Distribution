package typings
package cliDashBoxesLib.cliDashBoxesMod.boxesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxDefinition extends js.Object {
  var bottomLeft: java.lang.String
  var bottomRight: java.lang.String
  var horizontal: java.lang.String
  var topLeft: java.lang.String
  var topRight: java.lang.String
  var vertical: java.lang.String
}

object BoxDefinition {
  @scala.inline
  def apply(
    bottomLeft: java.lang.String,
    bottomRight: java.lang.String,
    horizontal: java.lang.String,
    topLeft: java.lang.String,
    topRight: java.lang.String,
    vertical: java.lang.String
  ): BoxDefinition = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft, bottomRight = bottomRight, horizontal = horizontal, topLeft = topLeft, topRight = topRight, vertical = vertical)
  
    __obj.asInstanceOf[BoxDefinition]
  }
}

