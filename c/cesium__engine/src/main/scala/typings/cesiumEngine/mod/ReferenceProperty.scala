package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ReferenceProperty")
@js.native
open class ReferenceProperty protected () extends StObject {
  def this(targetCollection: EntityCollection, targetId: String, targetPropertyNames: js.Array[String]) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is changed whenever the referenced property's definition is changed.
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
    * Gets the {@link Material} type at the provided time.
    * This method is only valid if the property being referenced is a {@link MaterialProperty}.
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
    * Gets the value of the property at the provided time and in the provided reference frame.
    * This method is only valid if the property being referenced is a {@link PositionProperty}.
    * @param time - The time for which to retrieve the value.
    * @param referenceFrame - The desired referenceFrame of the result.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Gets a value indicating if this property is constant.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets the reference frame that the position is defined in.
    * This property is only valid if the referenced property is a {@link PositionProperty}.
    */
  val referenceFrame: ReferenceFrame = js.native
  
  /**
    * Gets the resolved instance of the underlying referenced property.
    */
  val resolvedProperty: js.UndefOr[Property] = js.native
  
  /**
    * Gets the collection containing the entity being referenced.
    */
  val targetCollection: EntityCollection = js.native
  
  /**
    * Gets the id of the entity being referenced.
    */
  val targetId: String = js.native
  
  /**
    * Gets the array of property names used to retrieve the referenced property.
    */
  val targetPropertyNames: Any = js.native
}
/* static members */
object ReferenceProperty {
  
  @JSImport("@cesium/engine", "ReferenceProperty")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance given the entity collection that will
    * be used to resolve it and a string indicating the target entity id and property.
    * The format of the string is "objectId#foo.bar", where # separates the id from
    * property path and . separates sub-properties.  If the reference identifier or
    * or any sub-properties contains a # . or \ they must be escaped.
    * @returns A new instance of ReferenceProperty.
    */
  inline def fromString(targetCollection: EntityCollection, referenceString: String): ReferenceProperty = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(targetCollection.asInstanceOf[js.Any], referenceString.asInstanceOf[js.Any])).asInstanceOf[ReferenceProperty]
}
