package typings.box2d.Box2D.Dynamics.Joints

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
  def GetDampingRatio(): Double = js.native
  /**
  		* Gets the frequency.
  		* @return Frequency.
  		**/
  def GetFrequency(): Double = js.native
  /**
  		* Gets the length of distance between the two bodies.
  		* @return Length.
  		**/
  def GetLength(): Double = js.native
  /**
  		* Sets the damping ratio.
  		* @param ratio New damping ratio.
  		**/
  def SetDampingRatio(ratio: Double): Unit = js.native
  /**
  		* Sets the frequency.
  		* @param hz New frequency (hertz).
  		**/
  def SetFrequency(hz: Double): Unit = js.native
  /**
  		* Sets the length of distance between the two bodies.
  		* @param length New length.
  		**/
  def SetLength(length: Double): Unit = js.native
}

