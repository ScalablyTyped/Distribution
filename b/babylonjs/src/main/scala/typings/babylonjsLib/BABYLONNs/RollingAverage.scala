package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * RollingAverage
     *
     * Utility to efficiently compute the rolling average and variance over a sliding window of samples
     */
@JSGlobal("BABYLON.RollingAverage")
@js.native
class RollingAverage protected () extends js.Object {
  /**
           * constructor
           * @param length The number of samples required to saturate the sliding window
           */
  def this(length: scala.Double) = this()
  var _m2: scala.Double = js.native
  var _pos: scala.Double = js.native
  var _sampleCount: scala.Double = js.native
  var _samples: js.Array[scala.Double] = js.native
  /**
           * Current average
           */
  var average: scala.Double = js.native
  /**
           * Current variance
           */
  var variance: scala.Double = js.native
  /**
           * Wraps a value around the sample range boundaries
           * @param i Position in sample range, for example if the sample length is 5, and i is -3, then 2 will be returned.
           * @return Wrapped position in sample range
           */
  /* protected */ def _wrapPosition(i: scala.Double): scala.Double = js.native
  /**
           * Adds a sample to the sample set
           * @param v The sample value
           */
  def add(v: scala.Double): scala.Unit = js.native
  /**
           * Returns previously added values or null if outside of history or outside the sliding window domain
           * @param i Index in history. For example, pass 0 for the most recent value and 1 for the value before that
           * @return Value previously recorded with add() or null if outside of range
           */
  def history(i: scala.Double): scala.Double = js.native
  /**
           * Returns true if enough samples have been taken to completely fill the sliding window
           * @return true if sample-set saturated
           */
  def isSaturated(): scala.Boolean = js.native
  /**
           * Resets the rolling average (equivalent to 0 samples taken so far)
           */
  def reset(): scala.Unit = js.native
}

