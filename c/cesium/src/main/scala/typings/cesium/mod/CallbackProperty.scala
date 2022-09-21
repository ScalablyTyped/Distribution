package typings.cesium.mod

import typings.cesium.mod.CallbackProperty.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CallbackProperty")
@js.native
open class CallbackProperty protected () extends StObject {
  def this(callback: Callback, isConstant: Boolean) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is changed whenever setCallback is called.
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
    * @returns The modified result parameter or a new instance if the result parameter was not supplied or is unsupported.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets a value indicating if this property is constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Sets the callback to be used.
    * @param callback - The function to be called when the property is evaluated.
    * @param isConstant - <code>true</code> when the callback function returns the same value every time, <code>false</code> if the value will change.
    */
  def setCallback(callback: Callback, isConstant: Boolean): Unit = js.native
}
object CallbackProperty {
  
  /**
    * A function that returns the value of the property.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into. If omitted, the function must create and return a new instance.
    */
  type Callback = js.Function2[/* time */ JulianDate, /* result */ js.UndefOr[Any], Any]
}
