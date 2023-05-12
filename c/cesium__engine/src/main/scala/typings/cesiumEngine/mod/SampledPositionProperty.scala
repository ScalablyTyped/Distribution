package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "SampledPositionProperty")
@js.native
open class SampledPositionProperty () extends StObject {
  def this(referenceFrame: ReferenceFrame) = this()
  def this(referenceFrame: Unit, numberOfDerivatives: Double) = this()
  def this(referenceFrame: ReferenceFrame, numberOfDerivatives: Double) = this()
  
  /**
    * Adds a new sample.
    * @param time - The sample time.
    * @param position - The position at the provided time.
    * @param [derivatives] - The array of derivative values at the provided time.
    */
  def addSample(time: JulianDate, position: Cartesian3): Unit = js.native
  def addSample(time: JulianDate, position: Cartesian3, derivatives: js.Array[Cartesian3]): Unit = js.native
  
  /**
    * Adds multiple samples via parallel arrays.
    * @param times - An array of JulianDate instances where each index is a sample time.
    * @param positions - An array of Cartesian3 position instances, where each value corresponds to the provided time index.
    * @param [derivatives] - An array where each value is another array containing derivatives for the corresponding time index.
    */
  def addSamples(times: js.Array[JulianDate], positions: js.Array[Cartesian3]): Unit = js.native
  def addSamples(times: js.Array[JulianDate], positions: js.Array[Cartesian3], derivatives: js.Array[js.Array[Any]]): Unit = js.native
  
  /**
    * Adds samples as a single packed array where each new sample is represented as a date,
    * followed by the packed representation of the corresponding value and derivatives.
    * @param packedSamples - The array of packed samples.
    * @param [epoch] - If any of the dates in packedSamples are numbers, they are considered an offset from this epoch, in seconds.
    */
  def addSamplesPackedArray(packedSamples: js.Array[Double]): Unit = js.native
  def addSamplesPackedArray(packedSamples: js.Array[Double], epoch: JulianDate): Unit = js.native
  
  /**
    * Gets or sets the amount of time to extrapolate backward
    * before the property becomes undefined.  A value of 0 will extrapolate forever.
    */
  var backwardExtrapolationDuration: Double = js.native
  
  /**
    * Gets or sets the type of extrapolation to perform when a value
    * is requested at a time before any available samples.
    */
  var backwardExtrapolationType: ExtrapolationType = js.native
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is considered to have changed if a call to getValue would return
    * a different result for the same time.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Compares this property to the provided property and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The other property.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  /**
    * Gets or sets the amount of time to extrapolate forward before
    * the property becomes undefined.  A value of 0 will extrapolate forever.
    */
  var forwardExtrapolationDuration: Double = js.native
  
  /**
    * Gets or sets the type of extrapolation to perform when a value
    * is requested at a time after any available samples.
    */
  var forwardExtrapolationType: ExtrapolationType = js.native
  
  /**
    * Gets the position at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): js.UndefOr[Cartesian3] = js.native
  def getValue(time: JulianDate, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the position at the provided time and in the provided reference frame.
    * @param time - The time for which to retrieve the value.
    * @param referenceFrame - The desired referenceFrame of the result.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): js.UndefOr[Cartesian3] = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the interpolation algorithm to use when retrieving a value. Call <code>setInterpolationOptions</code> to set this.
    */
  val interpolationAlgorithm: InterpolationAlgorithm = js.native
  
  /**
    * Gets the degree of interpolation to perform when retrieving a value. Call <code>setInterpolationOptions</code> to set this.
    */
  val interpolationDegree: Double = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * The number of derivatives contained by this property; i.e. 0 for just position, 1 for velocity, etc.
    */
  var numberOfDerivatives: Double = js.native
  
  /**
    * Gets the reference frame in which the position is defined.
    */
  var referenceFrame: ReferenceFrame = js.native
  
  /**
    * Removes a sample at the given time, if present.
    * @param time - The sample time.
    * @returns <code>true</code> if a sample at time was removed, <code>false</code> otherwise.
    */
  def removeSample(time: JulianDate): Boolean = js.native
  
  /**
    * Removes all samples for the given time interval.
    * @param time - The time interval for which to remove all samples.
    */
  def removeSamples(time: TimeInterval): Unit = js.native
  
  /**
    * Sets the algorithm and degree to use when interpolating a position.
    * @param [options] - Object with the following properties:
    * @param [options.interpolationAlgorithm] - The new interpolation algorithm.  If undefined, the existing property will be unchanged.
    * @param [options.interpolationDegree] - The new interpolation degree.  If undefined, the existing property will be unchanged.
    */
  def setInterpolationOptions(): Unit = js.native
  def setInterpolationOptions(options: typings.cesiumEngine.anon.InterpolationAlgorithm): Unit = js.native
}
