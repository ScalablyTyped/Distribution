package typings.box2d.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Sweep")
@js.native
class b2Sweep () extends js.Object {
  /**
  		* World angle.
  		**/
  var a: Double = js.native
  /**
  		* World angle.
  		**/
  var a0: Double = js.native
  /**
  		* Center world position.
  		**/
  var c: b2Vec2 = js.native
  /**
  		* Center world position.
  		**/
  var c0: b2Vec2 = js.native
  /**
  		* Local center of mass position.
  		**/
  var localCenter: b2Vec2 = js.native
  /**
  		* Time interval = [t0,1], where t0 is in [0,1].
  		**/
  var t0: b2Vec2 = js.native
  /**
  		* Advance the sweep forward, yielding a new initial state.
  		* @t The new initial time.
  		**/
  def Advance(t: Double): Unit = js.native
  /**
  		* Creates a copy of the sweep.
  		**/
  def Copy(): b2Sweep = js.native
  /**
  		* Get the interpolated transform at a specific time.
  		* @param xf Transform at specified time, this is an out parameter.
  		* @param alpha Is a factor in [0,1], where 0 indicates t0.
  		**/
  def GetTransform(xf: b2Transform, alpha: Double): Unit = js.native
  /**
  		* Sets the sweep from a sweep.
  		* @param other Sweep values to copy from.
  		**/
  def Set(other: b2Sweep): Unit = js.native
}

