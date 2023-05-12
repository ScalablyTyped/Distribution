package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ConstantProperty")
@js.native
open class ConstantProperty () extends StObject {
  def this(value: Any) = this()
  
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
    * Gets the value of the property.
    * @param [time] - The time for which to retrieve the value.  This parameter is unused since the value does not change with respect to time.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(): Any = js.native
  def getValue(time: Unit, result: Any): Any = js.native
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets a value indicating if this property is constant.
    * This property always returns <code>true</code>.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Sets the value of the property.
    * @param value - The property value.
    */
  def setValue(value: Any): Unit = js.native
}
