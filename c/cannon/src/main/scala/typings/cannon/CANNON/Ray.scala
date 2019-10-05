package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Ray")
@js.native
class Ray () extends js.Object {
  def this(from: Vec3) = this()
  def this(from: Vec3, to: Vec3) = this()
  var checkCollisionResponse: Boolean = js.native
  var from: Vec3 = js.native
  var precision: Double = js.native
  var to: Vec3 = js.native
  def getAABB(result: RaycastResult): Unit = js.native
}

