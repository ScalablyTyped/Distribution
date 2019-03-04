package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait position extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object position {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[position]
  }
}

