package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ConstantPositionProperty")
@js.native
open class ConstantPositionProperty () extends StObject {
  def this(value: Cartesian3) = this()
  def this(value: Unit, referenceFrame: ReferenceFrame) = this()
  def this(value: Cartesian3, referenceFrame: ReferenceFrame) = this()
  
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
    * Gets the value of the property at the provided time in the fixed frame.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets the value of the property at the provided time and in the provided reference frame.
    * @param time - The time for which to retrieve the value.
    * @param referenceFrame - The desired referenceFrame of the result.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets the reference frame in which the position is defined.
    */
  var referenceFrame: ReferenceFrame = js.native
  
  /**
    * Sets the value of the property.
    * @param value - The property value.
    * @param [referenceFrame = this.referenceFrame] - The reference frame in which the position is defined.
    */
  def setValue(value: Cartesian3): Unit = js.native
  def setValue(value: Cartesian3, referenceFrame: ReferenceFrame): Unit = js.native
}
