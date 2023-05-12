package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PropertyArray")
@js.native
open class PropertyArray () extends StObject {
  def this(value: js.Array[Property]) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is changed whenever setValue is called with data different
    * than the current value or one of the properties in the array also changes.
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
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter, which is an array of values produced by evaluating each of the contained properties at the given time or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): js.Array[js.Object] = js.native
  def getValue(time: JulianDate, result: js.Array[js.Object]): js.Array[js.Object] = js.native
  
  /**
    * Gets a value indicating if this property is constant.  This property
    * is considered constant if all property items in the array are constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Sets the value of the property.
    * @param value - An array of Property instances.
    */
  def setValue(value: js.Array[Property]): Unit = js.native
}
