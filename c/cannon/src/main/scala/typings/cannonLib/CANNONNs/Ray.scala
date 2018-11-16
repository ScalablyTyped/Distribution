package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Ray")
@js.native
class Ray () extends js.Object {
  def this(from: Vec3) = this()
  def this(from: Vec3, to: Vec3) = this()
  var checkCollisionResponse: scala.Boolean = js.native
  var from: Vec3 = js.native
  var precision: scala.Double = js.native
  var to: Vec3 = js.native
  def getAABB(result: RaycastResult): scala.Unit = js.native
}

