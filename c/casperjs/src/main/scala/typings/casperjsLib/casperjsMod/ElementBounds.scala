package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementBounds extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object ElementBounds {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): ElementBounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ElementBounds]
  }
}

