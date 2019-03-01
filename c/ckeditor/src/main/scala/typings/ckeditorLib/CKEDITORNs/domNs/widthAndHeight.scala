package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait widthAndHeight extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object widthAndHeight {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): widthAndHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[widthAndHeight]
  }
}

