package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Vec3")
@js.native
class Vec3 ()
  extends cannonLib.CANNONNs.Vec3 {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
}

/* static members */
@JSImport("cannon", "Vec3")
@js.native
object Vec3 extends js.Object {
  var ZERO: cannonLib.CANNONNs.Vec3 = js.native
}

