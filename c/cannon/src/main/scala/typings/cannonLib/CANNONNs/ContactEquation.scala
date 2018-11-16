package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ContactEquation")
@js.native
class ContactEquation protected () extends Equation {
  def this(bi: Body, bj: Body) = this()
  var biInvInertiaTimesRixn: Vec3 = js.native
  var bjInvInertiaTimesRjxn: Vec3 = js.native
  var invIi: Mat3 = js.native
  var invIj: Mat3 = js.native
  var ni: Vec3 = js.native
  var penetrationVec: Vec3 = js.native
  var restitution: scala.Double = js.native
  var ri: Vec3 = js.native
  var rixn: Vec3 = js.native
  var rj: Vec3 = js.native
  var rjxn: Vec3 = js.native
}

