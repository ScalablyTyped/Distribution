package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXaxis extends js.Object {
  var `x-axis`: AnonRootNodeNameString
  var `y-axis`: AnonRootNodeNameString
}

object AnonXaxis {
  @scala.inline
  def apply(`x-axis`: AnonRootNodeNameString, `y-axis`: AnonRootNodeNameString): AnonXaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXaxis]
  }
}

