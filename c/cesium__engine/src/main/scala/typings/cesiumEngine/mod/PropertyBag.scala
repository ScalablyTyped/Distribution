package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any}
- Dropped {[ P in string ]: any} */ @JSImport("@cesium/engine", "PropertyBag")
@js.native
open class PropertyBag () extends StObject {
  def this(value: Any) = this()
  def this(value: Any, createPropertyCallback: js.Function1[/* repeated */ Any, Any]) = this()
  def this(value: Unit, createPropertyCallback: js.Function1[/* repeated */ Any, Any]) = this()
  
  /**
    * Adds a property to this object.
    * @param propertyName - The name of the property to add.
    * @param [value] - The value of the new property, if provided.
    * @param [createPropertyCallback] - A function that will be called when the value of this new property is set to a value that is not a Property.
    */
  def addProperty(propertyName: String): Unit = js.native
  def addProperty(propertyName: String, value: Any): Unit = js.native
  def addProperty(propertyName: String, value: Any, createPropertyCallback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  def addProperty(propertyName: String, value: Unit, createPropertyCallback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  /**
    * Gets the event that is raised whenever the set of properties contained in this
    * object changes, or one of the properties itself changes.
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
    * Gets the value of this property.  Each contained property will be evaluated at the given time, and the overall
    * result will be an object, mapping property names to those values.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * Note that any properties in result which are not part of this PropertyBag will be left as-is.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Determines if this object has defined a property with the given name.
    * @param propertyName - The name of the property to check for.
    * @returns True if this object has defined a property with the given name, false otherwise.
    */
  def hasProperty(propertyName: String): Boolean = js.native
  
  /**
    * Gets a value indicating if this property is constant.  This property
    * is considered constant if all property items in this object are constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    * @param [createPropertyCallback] - A function that will be called when the value of any of the properties in value are not a Property.
    */
  def merge(source: Any): Unit = js.native
  def merge(source: Any, createPropertyCallback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  /**
    * Gets the names of all properties registered on this instance.
    */
  var propertyNames: js.Array[Any] = js.native
  
  /**
    * Removed a property previously added with addProperty.
    * @param propertyName - The name of the property to remove.
    */
  def removeProperty(propertyName: String): Unit = js.native
}
