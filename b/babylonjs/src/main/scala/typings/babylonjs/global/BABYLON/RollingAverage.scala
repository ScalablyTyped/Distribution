package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RollingAverage")
@js.native
open class RollingAverage protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RollingAverage {
  /**
    * constructor
    * @param length The number of samples required to saturate the sliding window
    */
  def this(length: Double) = this()
  
  /* protected */ /* CompleteClass */
  var _m2: Double = js.native
  
  /* protected */ /* CompleteClass */
  var _pos: Double = js.native
  
  /* protected */ /* CompleteClass */
  var _sampleCount: Double = js.native
  
  /* protected */ /* CompleteClass */
  var _samples: js.Array[Double] = js.native
  
  /**
    * Wraps a value around the sample range boundaries
    * @param i Position in sample range, for example if the sample length is 5, and i is -3, then 2 will be returned.
    * @returns Wrapped position in sample range
    */
  /* protected */ /* CompleteClass */
  override def _wrapPosition(i: Double): Double = js.native
  
  /**
    * Adds a sample to the sample set
    * @param v The sample value
    */
  /* CompleteClass */
  override def add(v: Double): Unit = js.native
  
  /**
    * Current average
    */
  /* CompleteClass */
  var average: Double = js.native
  
  /**
    * Returns previously added values or null if outside of history or outside the sliding window domain
    * @param i Index in history. For example, pass 0 for the most recent value and 1 for the value before that
    * @returns Value previously recorded with add() or null if outside of range
    */
  /* CompleteClass */
  override def history(i: Double): Double = js.native
  
  /**
    * Returns true if enough samples have been taken to completely fill the sliding window
    * @returns true if sample-set saturated
    */
  /* CompleteClass */
  override def isSaturated(): Boolean = js.native
  
  /**
    * Resets the rolling average (equivalent to 0 samples taken so far)
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * Current variance
    */
  /* CompleteClass */
  var variance: Double = js.native
}
