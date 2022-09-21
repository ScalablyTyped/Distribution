package typings.cesium.mod

import typings.cesium.anon.OddColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "StripeMaterialProperty")
@js.native
open class StripeMaterialProperty () extends StObject {
  def this(options: OddColor) = this()
  
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
    * Gets or sets the Property specifying the first {@link Color}.
    */
  var evenColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets the {@link Material} type at the provided time.
    * @param time - The time for which to retrieve the type.
    * @returns The type of material.
    */
  def getType(time: JulianDate): String = js.native
  
  /**
    * Gets the value of the property at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets or sets the Property specifying the second {@link Color}.
    */
  var oddColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the point into the pattern
    * to begin drawing; with 0.0 being the beginning of the even color, 1.0 the beginning
    * of the odd color, 2.0 being the even color again, and any multiple or fractional values
    * being in between.
    */
  var offset: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link StripeOrientation}/
    */
  var orientation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying how many times the stripes repeat.
    */
  var repeat: js.UndefOr[Property] = js.native
}
