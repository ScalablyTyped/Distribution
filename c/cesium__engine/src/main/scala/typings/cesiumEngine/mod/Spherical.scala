package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Spherical")
@js.native
open class Spherical () extends StObject {
  def this(clock: Double) = this()
  def this(clock: Double, cone: Double) = this()
  def this(clock: Unit, cone: Double) = this()
  def this(clock: Double, cone: Double, magnitude: Double) = this()
  def this(clock: Double, cone: Unit, magnitude: Double) = this()
  def this(clock: Unit, cone: Double, magnitude: Double) = this()
  def this(clock: Unit, cone: Unit, magnitude: Double) = this()
  
  /**
    * The clock component.
    */
  var clock: Double = js.native
  
  def clone(result: Spherical): Spherical = js.native
  
  /**
    * The cone component.
    */
  var cone: Double = js.native
  
  /**
    * Returns true if this spherical is equal to the provided spherical, false otherwise.
    * @param other - The Spherical to be compared.
    * @returns true if this spherical is equal to the provided spherical, false otherwise.
    */
  def equals(other: Spherical): Boolean = js.native
  
  /**
    * Returns true if this spherical is within the provided epsilon of the provided spherical, false otherwise.
    * @param other - The Spherical to be compared.
    * @param epsilon - The epsilon to compare against.
    * @returns true if this spherical is within the provided epsilon of the provided spherical, false otherwise.
    */
  def equalsEpsilon(other: Spherical, epsilon: Double): Boolean = js.native
  
  /**
    * The magnitude component.
    */
  var magnitude: Double = js.native
}
/* static members */
object Spherical {
  
  @JSImport("@cesium/engine", "Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a duplicate of a Spherical.
    * @param spherical - The spherical to clone.
    * @param [result] - The object to store the result into, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined. (Returns undefined if spherical is undefined)
    */
  inline def clone(spherical: Spherical): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def clone(spherical: Spherical, result: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  
  /**
    * Returns true if the first spherical is equal to the second spherical, false otherwise.
    * @param left - The first Spherical to be compared.
    * @param right - The second Spherical to be compared.
    * @returns true if the first spherical is equal to the second spherical, false otherwise.
    */
  inline def equals(left: Spherical, right: Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true if the first spherical is within the provided epsilon of the second spherical, false otherwise.
    * @param left - The first Spherical to be compared.
    * @param right - The second Spherical to be compared.
    * @param [epsilon = 0.0] - The epsilon to compare against.
    * @returns true if the first spherical is within the provided epsilon of the second spherical, false otherwise.
    */
  inline def equalsEpsilon(left: Spherical, right: Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Spherical, right: Spherical, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts the provided Cartesian3 into Spherical coordinates.
    * @param cartesian3 - The Cartesian3 to be converted to Spherical.
    * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
    * @returns The modified result parameter, or a new instance if one was not provided.
    */
  inline def fromCartesian3(cartesian3: Cartesian3): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def fromCartesian3(cartesian3: Cartesian3, result: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  
  /**
    * Computes the normalized version of the provided spherical.
    * @param spherical - The spherical to be normalized.
    * @param [result] - The object to store the result into, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined.
    */
  inline def normalize(spherical: Spherical): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def normalize(spherical: Spherical, result: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Spherical]
}
