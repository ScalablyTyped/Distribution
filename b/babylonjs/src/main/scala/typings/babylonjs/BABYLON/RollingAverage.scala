package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollingAverage extends js.Object {
  var _m2: Double
  var _pos: Double
  var _sampleCount: Double
  var _samples: js.Array[Double]
  /**
    * Current average
    */
  var average: Double
  /**
    * Current variance
    */
  var variance: Double
  /**
    * Wraps a value around the sample range boundaries
    * @param i Position in sample range, for example if the sample length is 5, and i is -3, then 2 will be returned.
    * @return Wrapped position in sample range
    */
  /* protected */ def _wrapPosition(i: Double): Double
  /**
    * Adds a sample to the sample set
    * @param v The sample value
    */
  def add(v: Double): Unit
  /**
    * Returns previously added values or null if outside of history or outside the sliding window domain
    * @param i Index in history. For example, pass 0 for the most recent value and 1 for the value before that
    * @return Value previously recorded with add() or null if outside of range
    */
  def history(i: Double): Double
  /**
    * Returns true if enough samples have been taken to completely fill the sliding window
    * @return true if sample-set saturated
    */
  def isSaturated(): Boolean
  /**
    * Resets the rolling average (equivalent to 0 samples taken so far)
    */
  def reset(): Unit
}

object RollingAverage {
  @scala.inline
  def apply(
    _m2: Double,
    _pos: Double,
    _sampleCount: Double,
    _samples: js.Array[Double],
    _wrapPosition: Double => Double,
    add: Double => Unit,
    average: Double,
    history: Double => Double,
    isSaturated: () => Boolean,
    reset: () => Unit,
    variance: Double
  ): RollingAverage = {
    val __obj = js.Dynamic.literal(_m2 = _m2.asInstanceOf[js.Any], _pos = _pos.asInstanceOf[js.Any], _sampleCount = _sampleCount.asInstanceOf[js.Any], _samples = _samples.asInstanceOf[js.Any], _wrapPosition = js.Any.fromFunction1(_wrapPosition), add = js.Any.fromFunction1(add), average = average.asInstanceOf[js.Any], history = js.Any.fromFunction1(history), isSaturated = js.Any.fromFunction0(isSaturated), reset = js.Any.fromFunction0(reset), variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingAverage]
  }
}

