package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Cylinder")
@js.native
class Cylinder protected ()
  extends typings.cannon.CANNON.Shape {
  def this(radiusTop: Double, radiusBottom: Double, height: Double, numSegments: Double) = this()
}

