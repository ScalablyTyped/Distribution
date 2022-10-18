package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Spherical")
@js.native
open class Spherical protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Spherical {
  /**
    * @param radius spherical radius
    * @param theta angle from positive y axis to radial line from 0 to PI (vertical)
    * @param phi angle from positive x axis measured anticlockwise from -PI to PI (horizontal)
    */
  def this(radius: Double, theta: Double, phi: Double) = this()
  
  /**
    * Adds the current Spherical and the given Spherical
    * @param spherical the spherical to add
    * @returns the sum spherical
    */
  /* CompleteClass */
  override def add(spherical: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Adds the given spherical to the current spherical
    * @param spherical the spherical to add
    * @returns the current spherical
    */
  /* CompleteClass */
  override def addInPlace(spherical: typings.babylonjs.BABYLON.Spherical): this.type = js.native
  
  /**
    * Adds the provided values to the current spherical
    * @param radius the amount to add to the radius
    * @param theta the amount to add to the theta
    * @param phi the amount to add to the phi
    * @returns the current spherical
    */
  /* CompleteClass */
  override def addInPlaceFromFloats(radius: Double, theta: Double, phi: Double): this.type = js.native
  
  /**
    * Adds the current Spherical and the given Spherical and stores the result
    * @param spherical the spherical to add
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def addToRef(spherical: typings.babylonjs.BABYLON.Spherical, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Converts the current spherical to an array
    * @reutrns the current spherical as an array
    */
  /* CompleteClass */
  override def asArray(): js.Array[Double] = js.native
  
  /**
    * Copies the source spherical into the current spherical
    * @param source the spherical to copy from
    * @returns the current spherical
    */
  /* CompleteClass */
  override def copyFrom(source: typings.babylonjs.BABYLON.Spherical): this.type = js.native
  
  /**
    * Copies the given values into the current spherical
    * @param radius the radius to use
    * @param theta the theta to use
    * @param phi the phi to use
    * @returns the current spherical
    */
  /* CompleteClass */
  override def copyFromFloats(radius: Double, theta: Double, phi: Double): this.type = js.native
  
  /**
    * Divides the current Spherical by the given Spherical
    * @param spherical the spherical to divide
    * @returns the quotient spherical
    */
  /* CompleteClass */
  override def divide(spherical: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Divides the current Spherical by the given Spherical
    * @param spherical the spherical to divide
    * @returns the current spherical
    */
  /* CompleteClass */
  override def divideInPlace(spherical: typings.babylonjs.BABYLON.Spherical): this.type = js.native
  
  /**
    * Divides the current Spherical by the given Spherical and stores the result
    * @param spherical the spherical to divide
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def divideToRef(spherical: typings.babylonjs.BABYLON.Spherical, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Gets the class name
    * @returns the string "Spherical"
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  
  /**
    * Multiplies the given Spherical with the current Spherical
    * @param spherical the spherical to multiply
    * @returns the product spherical
    */
  /* CompleteClass */
  override def multiply(spherical: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Multiplies the given Spherical with the current Spherical
    * @param spherical the spherical to multiply
    * @returns the current spherical
    */
  /* CompleteClass */
  override def multiplyInPlace(spherical: typings.babylonjs.BABYLON.Spherical): this.type = js.native
  
  /**
    * Multiplies the given Spherical with the current Spherical and stores the result
    * @param spherical the spherical to multiply
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def multiplyToRef(spherical: typings.babylonjs.BABYLON.Spherical, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /* CompleteClass */
  var phi: Double = js.native
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * Scales the current spherical and returns a new spherical with the scaled coordinates
    * @param scale defines the multiplication factor
    * @returns the scaled spherical
    */
  /* CompleteClass */
  override def scale(scale: Double): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Scales the current spherical
    * @param scale defines the multiplication factor
    * @returns the current spherical
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): this.type = js.native
  
  /**
    * Scales the current spherical and stores the result
    * @param scale defines the multiplication factor
    * @param ref where to store the result
    * @returns the updated ref
    */
  /* CompleteClass */
  override def scaleToRef(scale: Double, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Sets the values of the current spherical
    * @param radius the new radius
    * @param theta the new theta
    * @param phi the new phi
    * @returns the current spherical
    */
  /* CompleteClass */
  override def set(radius: Double, theta: Double, phi: Double): this.type = js.native
  
  /**
    * Sets the values of the current spherical
    * @param value the new values
    * @returns the current spherical
    */
  /* CompleteClass */
  override def setAll(value: Double): this.type = js.native
  
  /**
    * Subtracts the given Spherical from the current Spherical
    * @param spherical the spherical to subtract
    * @returns the difference spherical
    */
  /* CompleteClass */
  override def subtract(spherical: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Subtracts the given floats from the current spherical
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param phi the amount to subtract from the phi
    * @returns the difference spherical
    */
  /* CompleteClass */
  override def subtractFromFloats(radius: Double, theta: Double, phi: Double): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Subtracts the given floats from the current spherical
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param phi the amount to subtract from the phi
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def subtractFromFloatsToRef(radius: Double, theta: Double, phi: Double, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /**
    * Subtracts the given Spherical from the current Spherical
    * @param spherical the spherical to subtract
    * @returns the current spherical
    */
  /* CompleteClass */
  override def subtractInPlace(spherical: typings.babylonjs.BABYLON.Spherical): this.type = js.native
  
  /**
    * Subtracts the given Spherical from the current Spherical and stores the result
    * @param spherical the spherical to subtract
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def subtractToRef(spherical: typings.babylonjs.BABYLON.Spherical, ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = js.native
  
  /* CompleteClass */
  var theta: Double = js.native
  
  /**
    * Gets a Vector3 from the current spherical coordinates
    * @returns the (x, y,z) form of the current Spherical
    */
  /* CompleteClass */
  override def toVector3(): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Assigns the rectangular coordinates of the current Spherical to a Vector3
    * @param ref the Vector3 to update
    * @returns the updated Vector3
    */
  /* CompleteClass */
  override def toVector3ToRef(ref: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Vector3 = js.native
}
/* static members */
object Spherical {
  
  @JSGlobal("BABYLON.Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of floats to a spherical
    * @param array the array to convert
    * @returns the converted spherical
    */
  inline def FromArray(array: js.Array[Double]): typings.babylonjs.BABYLON.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Spherical]
  
  /**
    * Gets a Spherical from a Vector3
    * @param vector defines the vector in (x, y, z) coordinate space
    * @returns a new Spherical
    */
  inline def FromVector3(vector: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Spherical]
  
  /**
    * Assigns the spherical coordinates from a Vector3
    * @param vector the vector to convert
    * @param ref the Spherical to update
    * @returns the updated ref
    */
  inline def FromVector3ToRef(vector: DeepImmutable[typings.babylonjs.BABYLON.Vector3], ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Spherical]
}
