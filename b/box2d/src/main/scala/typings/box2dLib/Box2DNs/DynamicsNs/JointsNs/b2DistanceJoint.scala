package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2DistanceJoint")
@js.native
class b2DistanceJoint () extends b2Joint {
  /**
  		* Gets the damping ratio.
  		* @return Damping ratio.
  		**/
  def GetDampingRatio(): scala.Double = js.native
  /**
  		* Gets the frequency.
  		* @return Frequency.
  		**/
  def GetFrequency(): scala.Double = js.native
  /**
  		* Gets the length of distance between the two bodies.
  		* @return Length.
  		**/
  def GetLength(): scala.Double = js.native
  /**
  		* Sets the damping ratio.
  		* @param ratio New damping ratio.
  		**/
  def SetDampingRatio(ratio: scala.Double): scala.Unit = js.native
  /**
  		* Sets the frequency.
  		* @param hz New frequency (hertz).
  		**/
  def SetFrequency(hz: scala.Double): scala.Unit = js.native
  /**
  		* Sets the length of distance between the two bodies.
  		* @param length New length.
  		**/
  def SetLength(length: scala.Double): scala.Unit = js.native
}

