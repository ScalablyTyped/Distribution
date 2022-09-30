package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Polar")
@js.native
open class Polar protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Polar {
  /**
    * Creates a new Polar object
    * @param radius the radius of the vector
    * @param theta the angle of the vector
    */
  def this(radius: Double, theta: Double) = this()
  
  /**
    * Adds the current Polar and the given Polar
    * @param polar the polar to add
    * @returns the sum polar
    */
  /* CompleteClass */
  override def add(polar: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Adds the given polar to the current polar
    * @param polar the polar to add
    * @returns the current polar
    */
  /* CompleteClass */
  override def addInPlace(polar: typings.babylonjs.BABYLON.Polar): this.type = js.native
  
  /**
    * Adds the provided values to the current polar
    * @param radius the amount to add to the radius
    * @param theta the amount to add to the theta
    * @returns the current polar
    */
  /* CompleteClass */
  override def addInPlaceFromFloats(radius: Double, theta: Double): this.type = js.native
  
  /**
    * Adds the current Polar and the given Polar and stores the result
    * @param polar the polar to add
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def addToRef(polar: typings.babylonjs.BABYLON.Polar, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Converts the current polar to an array
    * @reutrns the current polar as an array
    */
  /* CompleteClass */
  override def asArray(): js.Array[Double] = js.native
  
  /**
    * Copies the source polar into the current polar
    * @param source the polar to copy from
    * @returns the current polar
    */
  /* CompleteClass */
  override def copyFrom(source: typings.babylonjs.BABYLON.Polar): this.type = js.native
  
  /**
    * Copies the given values into the current polar
    * @param radius the radius to use
    * @param theta the theta to use
    * @returns the current polar
    */
  /* CompleteClass */
  override def copyFromFloats(radius: Double, theta: Double): this.type = js.native
  
  /**
    * Divides the current Polar by the given Polar
    * @param polar the polar to divide
    * @returns the quotient polar
    */
  /* CompleteClass */
  override def divide(polar: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Divides the current Polar by the given Polar
    * @param polar the polar to divide
    * @returns the current polar
    */
  /* CompleteClass */
  override def divideInPlace(polar: typings.babylonjs.BABYLON.Polar): this.type = js.native
  
  /**
    * Divides the current Polar by the given Polar and stores the result
    * @param polar the polar to divide
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def divideToRef(polar: typings.babylonjs.BABYLON.Polar, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Gets the class name
    * @returns the string "Polar"
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  
  /**
    * Multiplies the given Polar with the current Polar
    * @param polar the polar to multiply
    * @returns the product polar
    */
  /* CompleteClass */
  override def multiply(polar: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Multiplies the given Polar with the current Polar
    * @param polar the polar to multiply
    * @returns the current polar
    */
  /* CompleteClass */
  override def multiplyInPlace(polar: typings.babylonjs.BABYLON.Polar): this.type = js.native
  
  /**
    * Multiplies the given Polar with the current Polar and stores the result
    * @param polar the polar to multiply
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def multiplyToRef(polar: typings.babylonjs.BABYLON.Polar, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * Scales the current polar and returns a new polar with the scaled coordinates
    * @param scale defines the multiplication factor
    * @returns the scaled polar
    */
  /* CompleteClass */
  override def scale(scale: Double): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Scales the current polar
    * @param scale defines the multiplication factor
    * @returns the current polar
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): this.type = js.native
  
  /**
    * Scales the current polar and stores the result
    * @param scale defines the multiplication factor
    * @param ref where to store the result
    * @returns the updated ref
    */
  /* CompleteClass */
  override def scaleToRef(scale: Double, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Sets the values of the current polar
    * @param radius the new radius
    * @param theta the new theta
    * @returns the current polar
    */
  /* CompleteClass */
  override def set(radius: Double, theta: Double): this.type = js.native
  
  /**
    * Sets the values of the current polar
    * @param value the new values
    * @returns the current polar
    */
  /* CompleteClass */
  override def setAll(value: Double): this.type = js.native
  
  /**
    * Subtracts the given Polar from the current Polar
    * @param polar the polar to subtract
    * @returns the difference polar
    */
  /* CompleteClass */
  override def subtract(polar: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Subtracts the given floats from the current polar
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @returns the difference polar
    */
  /* CompleteClass */
  override def subtractFromFloats(radius: Double, theta: Double): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Subtracts the given floats from the current polar
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def subtractFromFloatsToRef(radius: Double, theta: Double, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /**
    * Subtracts the given Polar from the current Polar
    * @param polar the polar to subtract
    * @returns the current polar
    */
  /* CompleteClass */
  override def subtractInPlace(polar: typings.babylonjs.BABYLON.Polar): this.type = js.native
  
  /**
    * Subtracts the given Polar from the current Polar and stores the result
    * @param polar the polar to subtract
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  /* CompleteClass */
  override def subtractToRef(polar: typings.babylonjs.BABYLON.Polar, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = js.native
  
  /* CompleteClass */
  var theta: Double = js.native
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @returns the rectangular coordinates
    */
  /* CompleteClass */
  override def toVector2(): typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  /* CompleteClass */
  override def toVector2ToRef(ref: typings.babylonjs.BABYLON.Vector2): typings.babylonjs.BABYLON.Vector2 = js.native
}
/* static members */
object Polar {
  
  @JSGlobal("BABYLON.Polar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of floats to a polar
    * @param array the array to convert
    * @returns the converted polar
    */
  inline def FromArray(array: js.Array[Double]): typings.babylonjs.BABYLON.Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Polar]
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @returns a Polar
    */
  inline def FromVector2(v: typings.babylonjs.BABYLON.Vector2): typings.babylonjs.BABYLON.Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2")(v.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Polar]
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  inline def FromVector2ToRef(v: typings.babylonjs.BABYLON.Vector2, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2ToRef")(v.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Polar]
}
