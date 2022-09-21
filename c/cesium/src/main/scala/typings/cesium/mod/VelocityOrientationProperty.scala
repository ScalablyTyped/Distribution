package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VelocityOrientationProperty")
@js.native
open class VelocityOrientationProperty () extends StObject {
  def this(position: PositionProperty) = this()
  def this(position: Unit, ellipsoid: Ellipsoid) = this()
  def this(position: PositionProperty, ellipsoid: Ellipsoid) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the ellipsoid used to determine which way is up.
    */
  var ellipsoid: js.UndefOr[Property] = js.native
  
  /**
    * Compares this property to the provided property and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The other property.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  /**
    * Gets the value of the property at the provided time.
    * @param [time] - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(): Quaternion = js.native
  def getValue(time: Unit, result: Quaternion): Quaternion = js.native
  def getValue(time: JulianDate): Quaternion = js.native
  def getValue(time: JulianDate, result: Quaternion): Quaternion = js.native
  
  /**
    * Gets a value indicating if this property is constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets or sets the position property used to compute orientation.
    */
  var position: js.UndefOr[Property] = js.native
}
