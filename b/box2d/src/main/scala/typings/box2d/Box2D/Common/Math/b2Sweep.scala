package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Sweep extends js.Object {
  /**
    * World angle.
    **/
  var a: Double
  /**
    * World angle.
    **/
  var a0: Double
  /**
    * Center world position.
    **/
  var c: b2Vec2
  /**
    * Center world position.
    **/
  var c0: b2Vec2
  /**
    * Local center of mass position.
    **/
  var localCenter: b2Vec2
  /**
    * Time interval = [t0,1], where t0 is in [0,1].
    **/
  var t0: b2Vec2
  /**
    * Advance the sweep forward, yielding a new initial state.
    * @t The new initial time.
    **/
  def Advance(t: Double): Unit
  /**
    * Creates a copy of the sweep.
    **/
  def Copy(): b2Sweep
  /**
    * Get the interpolated transform at a specific time.
    * @param xf Transform at specified time, this is an out parameter.
    * @param alpha Is a factor in [0,1], where 0 indicates t0.
    **/
  def GetTransform(xf: b2Transform, alpha: Double): Unit
  /**
    * Sets the sweep from a sweep.
    * @param other Sweep values to copy from.
    **/
  def Set(other: b2Sweep): Unit
}

object b2Sweep {
  @scala.inline
  def apply(
    Advance: Double => Unit,
    Copy: () => b2Sweep,
    GetTransform: (b2Transform, Double) => Unit,
    Set: b2Sweep => Unit,
    a: Double,
    a0: Double,
    c: b2Vec2,
    c0: b2Vec2,
    localCenter: b2Vec2,
    t0: b2Vec2
  ): b2Sweep = {
    val __obj = js.Dynamic.literal(Advance = js.Any.fromFunction1(Advance), Copy = js.Any.fromFunction0(Copy), GetTransform = js.Any.fromFunction2(GetTransform), Set = js.Any.fromFunction1(Set), a = a.asInstanceOf[js.Any], a0 = a0.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], c0 = c0.asInstanceOf[js.Any], localCenter = localCenter.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Sweep]
  }
}

