package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathPolarMod {
  
  @JSImport("babylonjs/Maths/math.polar", "Polar")
  @js.native
  open class Polar protected () extends StObject {
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
    def add(polar: Polar): Polar = js.native
    
    /**
      * Adds the given polar to the current polar
      * @param polar the polar to add
      * @returns the current polar
      */
    def addInPlace(polar: Polar): this.type = js.native
    
    /**
      * Adds the provided values to the current polar
      * @param radius the amount to add to the radius
      * @param theta the amount to add to the theta
      * @returns the current polar
      */
    def addInPlaceFromFloats(radius: Double, theta: Double): this.type = js.native
    
    /**
      * Adds the current Polar and the given Polar and stores the result
      * @param polar the polar to add
      * @param ref the polar to store the result in
      * @returns the updated ref
      */
    def addToRef(polar: Polar, ref: Polar): Polar = js.native
    
    /**
      * Converts the current polar to an array
      * @reutrns the current polar as an array
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Copies the source polar into the current polar
      * @param source the polar to copy from
      * @returns the current polar
      */
    def copyFrom(source: Polar): this.type = js.native
    
    /**
      * Copies the given values into the current polar
      * @param radius the radius to use
      * @param theta the theta to use
      * @returns the current polar
      */
    def copyFromFloats(radius: Double, theta: Double): this.type = js.native
    
    /**
      * Divides the current Polar by the given Polar
      * @param polar the polar to divide
      * @returns the quotient polar
      */
    def divide(polar: Polar): Polar = js.native
    
    /**
      * Divides the current Polar by the given Polar
      * @param polar the polar to divide
      * @returns the current polar
      */
    def divideInPlace(polar: Polar): this.type = js.native
    
    /**
      * Divides the current Polar by the given Polar and stores the result
      * @param polar the polar to divide
      * @param ref the polar to store the result in
      * @returns the updated ref
      */
    def divideToRef(polar: Polar, ref: Polar): Polar = js.native
    
    /**
      * Gets the class name
      * @returns the string "Polar"
      */
    def getClassName(): String = js.native
    
    /**
      * Multiplies the given Polar with the current Polar
      * @param polar the polar to multiply
      * @returns the product polar
      */
    def multiply(polar: Polar): Polar = js.native
    
    /**
      * Multiplies the given Polar with the current Polar
      * @param polar the polar to multiply
      * @returns the current polar
      */
    def multiplyInPlace(polar: Polar): this.type = js.native
    
    /**
      * Multiplies the given Polar with the current Polar and stores the result
      * @param polar the polar to multiply
      * @param ref the polar to store the result in
      * @returns the updated ref
      */
    def multiplyToRef(polar: Polar, ref: Polar): Polar = js.native
    
    var radius: Double = js.native
    
    /**
      * Scales the current polar and returns a new polar with the scaled coordinates
      * @param scale defines the multiplication factor
      * @returns the scaled polar
      */
    def scale(scale: Double): Polar = js.native
    
    /**
      * Scales the current polar
      * @param scale defines the multiplication factor
      * @returns the current polar
      */
    def scaleInPlace(scale: Double): this.type = js.native
    
    /**
      * Scales the current polar and stores the result
      * @param scale defines the multiplication factor
      * @param ref where to store the result
      * @returns the updated ref
      */
    def scaleToRef(scale: Double, ref: Polar): Polar = js.native
    
    /**
      * Sets the values of the current polar
      * @param radius the new radius
      * @param theta the new theta
      * @returns the current polar
      */
    def set(radius: Double, theta: Double): this.type = js.native
    
    /**
      * Sets the values of the current polar
      * @param value the new values
      * @returns the current polar
      */
    def setAll(value: Double): this.type = js.native
    
    /**
      * Subtracts the given Polar from the current Polar
      * @param polar the polar to subtract
      * @returns the difference polar
      */
    def subtract(polar: Polar): Polar = js.native
    
    /**
      * Subtracts the given floats from the current polar
      * @param radius the amount to subtract from the radius
      * @param theta the amount to subtract from the theta
      * @returns the difference polar
      */
    def subtractFromFloats(radius: Double, theta: Double): Polar = js.native
    
    /**
      * Subtracts the given floats from the current polar
      * @param radius the amount to subtract from the radius
      * @param theta the amount to subtract from the theta
      * @param ref the polar to store the result in
      * @returns the updated ref
      */
    def subtractFromFloatsToRef(radius: Double, theta: Double, ref: Polar): Polar = js.native
    
    /**
      * Subtracts the given Polar from the current Polar
      * @param polar the polar to subtract
      * @returns the current polar
      */
    def subtractInPlace(polar: Polar): this.type = js.native
    
    /**
      * Subtracts the given Polar from the current Polar and stores the result
      * @param polar the polar to subtract
      * @param ref the polar to store the result in
      * @returns the updated ref
      */
    def subtractToRef(polar: Polar, ref: Polar): Polar = js.native
    
    var theta: Double = js.native
    
    /**
      * Gets the rectangular coordinates of the current Polar
      * @returns the rectangular coordinates
      */
    def toVector2(): Vector2 = js.native
    
    /**
      * Gets the rectangular coordinates of the current Polar
      * @param ref the reference to assign the result
      * @returns the updated reference
      */
    def toVector2ToRef(ref: Vector2): Vector2 = js.native
  }
  /* static members */
  object Polar {
    
    @JSImport("babylonjs/Maths/math.polar", "Polar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts an array of floats to a polar
      * @param array the array to convert
      * @returns the converted polar
      */
    inline def FromArray(array: js.Array[Double]): Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Polar]
    
    /**
      * Converts a given Vector2 to its polar coordinates
      * @param v the Vector2 to convert
      * @returns a Polar
      */
    inline def FromVector2(v: Vector2): Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2")(v.asInstanceOf[js.Any]).asInstanceOf[Polar]
    
    /**
      * Converts a given Vector2 to its polar coordinates
      * @param v the Vector2 to convert
      * @param ref the reference to assign the result
      * @returns the updated reference
      */
    inline def FromVector2ToRef(v: Vector2, ref: Polar): Polar = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2ToRef")(v.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Polar]
  }
  
  @JSImport("babylonjs/Maths/math.polar", "Spherical")
  @js.native
  open class Spherical protected () extends StObject {
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
    def add(spherical: Spherical): Spherical = js.native
    
    /**
      * Adds the given spherical to the current spherical
      * @param spherical the spherical to add
      * @returns the current spherical
      */
    def addInPlace(spherical: Spherical): this.type = js.native
    
    /**
      * Adds the provided values to the current spherical
      * @param radius the amount to add to the radius
      * @param theta the amount to add to the theta
      * @param phi the amount to add to the phi
      * @returns the current spherical
      */
    def addInPlaceFromFloats(radius: Double, theta: Double, phi: Double): this.type = js.native
    
    /**
      * Adds the current Spherical and the given Spherical and stores the result
      * @param spherical the spherical to add
      * @param ref the spherical to store the result in
      * @returns the updated ref
      */
    def addToRef(spherical: Spherical, ref: Spherical): Spherical = js.native
    
    /**
      * Converts the current spherical to an array
      * @reutrns the current spherical as an array
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Copies the source spherical into the current spherical
      * @param source the spherical to copy from
      * @returns the current spherical
      */
    def copyFrom(source: Spherical): this.type = js.native
    
    /**
      * Copies the given values into the current spherical
      * @param radius the radius to use
      * @param theta the theta to use
      * @param phi the phi to use
      * @returns the current spherical
      */
    def copyFromFloats(radius: Double, theta: Double, phi: Double): this.type = js.native
    
    /**
      * Divides the current Spherical by the given Spherical
      * @param spherical the spherical to divide
      * @returns the quotient spherical
      */
    def divide(spherical: Spherical): Spherical = js.native
    
    /**
      * Divides the current Spherical by the given Spherical
      * @param spherical the spherical to divide
      * @returns the current spherical
      */
    def divideInPlace(spherical: Spherical): this.type = js.native
    
    /**
      * Divides the current Spherical by the given Spherical and stores the result
      * @param spherical the spherical to divide
      * @param ref the spherical to store the result in
      * @returns the updated ref
      */
    def divideToRef(spherical: Spherical, ref: Spherical): Spherical = js.native
    
    /**
      * Gets the class name
      * @returns the string "Spherical"
      */
    def getClassName(): String = js.native
    
    /**
      * Multiplies the given Spherical with the current Spherical
      * @param spherical the spherical to multiply
      * @returns the product spherical
      */
    def multiply(spherical: Spherical): Spherical = js.native
    
    /**
      * Multiplies the given Spherical with the current Spherical
      * @param spherical the spherical to multiply
      * @returns the current spherical
      */
    def multiplyInPlace(spherical: Spherical): this.type = js.native
    
    /**
      * Multiplies the given Spherical with the current Spherical and stores the result
      * @param spherical the spherical to multiply
      * @param ref the spherical to store the result in
      * @returns the updated ref
      */
    def multiplyToRef(spherical: Spherical, ref: Spherical): Spherical = js.native
    
    var phi: Double = js.native
    
    var radius: Double = js.native
    
    /**
      * Scales the current spherical and returns a new spherical with the scaled coordinates
      * @param scale defines the multiplication factor
      * @returns the scaled spherical
      */
    def scale(scale: Double): Spherical = js.native
    
    /**
      * Scales the current spherical
      * @param scale defines the multiplication factor
      * @returns the current spherical
      */
    def scaleInPlace(scale: Double): this.type = js.native
    
    /**
      * Scales the current spherical and stores the result
      * @param scale defines the multiplication factor
      * @param ref where to store the result
      * @returns the updated ref
      */
    def scaleToRef(scale: Double, ref: Spherical): Spherical = js.native
    
    /**
      * Sets the values of the current spherical
      * @param radius the new radius
      * @param theta the new theta
      * @param phi the new phi
      * @returns the current spherical
      */
    def set(radius: Double, theta: Double, phi: Double): this.type = js.native
    
    /**
      * Sets the values of the current spherical
      * @param value the new values
      * @returns the current spherical
      */
    def setAll(value: Double): this.type = js.native
    
    /**
      * Subtracts the given Spherical from the current Spherical
      * @param spherical the spherical to subtract
      * @returns the difference spherical
      */
    def subtract(spherical: Spherical): Spherical = js.native
    
    /**
      * Subtracts the given floats from the current spherical
      * @param radius the amount to subtract from the radius
      * @param theta the amount to subtract from the theta
      * @param phi the amount to subtract from the phi
      * @returns the difference spherical
      */
    def subtractFromFloats(radius: Double, theta: Double, phi: Double): Spherical = js.native
    
    /**
      * Subtracts the given floats from the current spherical
      * @param radius the amount to subtract from the radius
      * @param theta the amount to subtract from the theta
      * @param phi the amount to subtract from the phi
      * @param ref the spherical to store the result in
      * @returns the updated ref
      */
    def subtractFromFloatsToRef(radius: Double, theta: Double, phi: Double, ref: Spherical): Spherical = js.native
    
    /**
      * Subtracts the given Spherical from the current Spherical
      * @param spherical the spherical to subtract
      * @returns the current spherical
      */
    def subtractInPlace(spherical: Spherical): this.type = js.native
    
    /**
      * Subtracts the given Spherical from the current Spherical and stores the result
      * @param spherical the spherical to subtract
      * @param ref the spherical to store the result in
      * @returns the updated ref
      */
    def subtractToRef(spherical: Spherical, ref: Spherical): Spherical = js.native
    
    var theta: Double = js.native
    
    /**
      * Gets a Vector3 from the current spherical coordinates
      * @returns the Vector3
      */
    def toVector3(): Vector3 = js.native
    
    /**
      * Assigns the rectangular coordinates of the current Spherical to a Vector3
      * @param ref the Vector3 to update
      * @returns the updated Vector3
      */
    def toVector3ToRef(ref: DeepImmutable[Vector3]): Vector3 = js.native
  }
  /* static members */
  object Spherical {
    
    @JSImport("babylonjs/Maths/math.polar", "Spherical")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts an array of floats to a spherical
      * @param array the array to convert
      * @returns the converted spherical
      */
    inline def FromArray(array: js.Array[Double]): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Spherical]
    
    /**
      * Gets a Spherical from a Vector3
      * @param vector defines the vector in (x, y, z) coordinate space
      * @returns a new Spherical
      */
    inline def FromVector3(vector: DeepImmutable[Vector3]): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[Spherical]
    
    /**
      * Assigns the spherical coordinates from a Vector3
      * @param vector the vector to convert
      * @param ref the Spherical to update
      * @returns the updated ref
      */
    inline def FromVector3ToRef(vector: DeepImmutable[Vector3], ref: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  }
}
