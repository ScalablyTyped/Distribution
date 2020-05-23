package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xaxis extends js.Object {
  var `x-axis`: RootNodeNameString
  var `y-axis`: RootNodeNameString
}

object Xaxis {
  @scala.inline
  def apply(`x-axis`: RootNodeNameString, `y-axis`: RootNodeNameString): Xaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xaxis]
  }
}

