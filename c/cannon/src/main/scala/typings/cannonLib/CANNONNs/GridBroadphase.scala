package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.GridBroadphase")
@js.native
class GridBroadphase () extends BroadPhase {
  def this(aabbMin: Vec3) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: scala.Double) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: scala.Double, ny: scala.Double) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: scala.Double, ny: scala.Double, nz: scala.Double) = this()
  var aabbMax: Vec3 = js.native
  var aabbMin: Vec3 = js.native
  var bins: js.Array[_] = js.native
  var nx: scala.Double = js.native
  var ny: scala.Double = js.native
  var nz: scala.Double = js.native
}

