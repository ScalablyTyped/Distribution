package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "SampledProperty")
@js.native
open class SampledProperty protected () extends StObject {
  def this(`type`: Double) = this()
  def this(`type`: Packable) = this()
  def this(`type`: Double, derivativeTypes: js.Array[Packable]) = this()
  def this(`type`: Packable, derivativeTypes: js.Array[Packable]) = this()
  
  /**
    * Adds a new sample.
    * @param time - The sample time.
    * @param value - The value at the provided time.
    * @param [derivatives] - The array of derivatives at the provided time.
    */
  def addSample(time: JulianDate, value: Packable): Unit = js.native
  def addSample(time: JulianDate, value: Packable, derivatives: js.Array[Packable]): Unit = js.native
  
  /**
    * Adds an array of samples.
    * @param times - An array of JulianDate instances where each index is a sample time.
    * @param values - The array of values, where each value corresponds to the provided times index.
    * @param [derivativeValues] - An array where each item is the array of derivatives at the equivalent time index.
    */
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable]): Unit = js.native
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable], derivativeValues: js.Array[js.Array[Any]]): Unit = js.native
  
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
    * Gets the derivative types used by this property.
    */
  var derivativeTypes: js.Array[Packable] = js.native
  
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
    * Gets the value of the property at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets the interpolation algorithm to use when retrieving a value.
    */
  var interpolationAlgorithm: InterpolationAlgorithm = js.native
  
  /**
    * Gets the degree of interpolation to perform when retrieving a value.
    */
  var interpolationDegree: Double = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
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
    * Sets the algorithm and degree to use when interpolating a value.
    * @param [options] - Object with the following properties:
    * @param [options.interpolationAlgorithm] - The new interpolation algorithm.  If undefined, the existing property will be unchanged.
    * @param [options.interpolationDegree] - The new interpolation degree.  If undefined, the existing property will be unchanged.
    */
  def setInterpolationOptions(): Unit = js.native
  def setInterpolationOptions(options: typings.cesiumEngine.anon.InterpolationAlgorithm): Unit = js.native
  
  /**
    * Gets the type of property.
    */
  var `type`: Any = js.native
}
