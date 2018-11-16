package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2GearJoint")
@js.native
class b2GearJoint () extends b2Joint {
  /**
  		* Get the gear ratio.
  		* @return Gear ratio.
  		**/
  def GetRatio(): scala.Double = js.native
  /**
  		* Set the gear ratio.
  		* @param force New gear ratio.
  		**/
  def SetRatio(ratio: scala.Double): scala.Unit = js.native
}

