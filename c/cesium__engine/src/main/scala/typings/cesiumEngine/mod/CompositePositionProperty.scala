package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CompositePositionProperty")
@js.native
open class CompositePositionProperty () extends StObject {
  def this(referenceFrame: ReferenceFrame) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is changed whenever setValue is called with data different
    * than the current value.
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
    * Gets the value of the property at the provided time in the fixed frame.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): js.UndefOr[Cartesian3] = js.native
  def getValue(time: JulianDate, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the value of the property at the provided time and in the provided reference frame.
    * @param time - The time for which to retrieve the value.
    * @param referenceFrame - The desired referenceFrame of the result.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): js.UndefOr[Cartesian3] = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the interval collection.
    */
  var intervals: TimeIntervalCollection = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets or sets the reference frame which this position presents itself as.
    * Each PositionProperty making up this object has it's own reference frame,
    * so this property merely exposes a "preferred" reference frame for clients
    * to use.
    */
  var referenceFrame: ReferenceFrame = js.native
}
