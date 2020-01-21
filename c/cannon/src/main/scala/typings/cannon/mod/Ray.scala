package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Ray")
@js.native
class Ray ()
  extends typings.cannon.CANNON.Ray {
  def this(from: typings.cannon.CANNON.Vec3) = this()
  def this(from: typings.cannon.CANNON.Vec3, to: typings.cannon.CANNON.Vec3) = this()
}

