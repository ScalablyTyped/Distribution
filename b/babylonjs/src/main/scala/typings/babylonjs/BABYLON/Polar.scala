package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polar extends StObject {
  
  /**
    * Adds the current Polar and the given Polar
    * @param polar the polar to add
    * @returns the sum polar
    */
  def add(polar: Polar): Polar
  
  /**
    * Adds the given polar to the current polar
    * @param polar the polar to add
    * @returns the current polar
    */
  def addInPlace(polar: Polar): this.type
  
  /**
    * Adds the provided values to the current polar
    * @param radius the amount to add to the radius
    * @param theta the amount to add to the theta
    * @returns the current polar
    */
  def addInPlaceFromFloats(radius: Double, theta: Double): this.type
  
  /**
    * Adds the current Polar and the given Polar and stores the result
    * @param polar the polar to add
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  def addToRef(polar: Polar, ref: Polar): Polar
  
  /**
    * Converts the current polar to an array
    * @reutrns the current polar as an array
    */
  def asArray(): js.Array[Double]
  
  /**
    * Copies the source polar into the current polar
    * @param source the polar to copy from
    * @returns the current polar
    */
  def copyFrom(source: Polar): this.type
  
  /**
    * Copies the given values into the current polar
    * @param radius the radius to use
    * @param theta the theta to use
    * @returns the current polar
    */
  def copyFromFloats(radius: Double, theta: Double): this.type
  
  /**
    * Divides the current Polar by the given Polar
    * @param polar the polar to divide
    * @returns the quotient polar
    */
  def divide(polar: Polar): Polar
  
  /**
    * Divides the current Polar by the given Polar
    * @param polar the polar to divide
    * @returns the current polar
    */
  def divideInPlace(polar: Polar): this.type
  
  /**
    * Divides the current Polar by the given Polar and stores the result
    * @param polar the polar to divide
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  def divideToRef(polar: Polar, ref: Polar): Polar
  
  /**
    * Gets the class name
    * @returns the string "Polar"
    */
  def getClassName(): String
  
  /**
    * Multiplies the given Polar with the current Polar
    * @param polar the polar to multiply
    * @returns the product polar
    */
  def multiply(polar: Polar): Polar
  
  /**
    * Multiplies the given Polar with the current Polar
    * @param polar the polar to multiply
    * @returns the current polar
    */
  def multiplyInPlace(polar: Polar): this.type
  
  /**
    * Multiplies the given Polar with the current Polar and stores the result
    * @param polar the polar to multiply
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  def multiplyToRef(polar: Polar, ref: Polar): Polar
  
  var radius: Double
  
  /**
    * Scales the current polar and returns a new polar with the scaled coordinates
    * @param scale defines the multiplication factor
    * @returns the scaled polar
    */
  def scale(scale: Double): Polar
  
  /**
    * Scales the current polar
    * @param scale defines the multiplication factor
    * @returns the current polar
    */
  def scaleInPlace(scale: Double): this.type
  
  /**
    * Scales the current polar and stores the result
    * @param scale defines the multiplication factor
    * @param ref where to store the result
    * @returns the updated ref
    */
  def scaleToRef(scale: Double, ref: Polar): Polar
  
  /**
    * Sets the values of the current polar
    * @param radius the new radius
    * @param theta the new theta
    * @returns the current polar
    */
  def set(radius: Double, theta: Double): this.type
  
  /**
    * Sets the values of the current polar
    * @param value the new values
    * @returns the current polar
    */
  def setAll(value: Double): this.type
  
  /**
    * Subtracts the given Polar from the current Polar
    * @param polar the polar to subtract
    * @returns the difference polar
    */
  def subtract(polar: Polar): Polar
  
  /**
    * Subtracts the given floats from the current polar
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @returns the difference polar
    */
  def subtractFromFloats(radius: Double, theta: Double): Polar
  
  /**
    * Subtracts the given floats from the current polar
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  def subtractFromFloatsToRef(radius: Double, theta: Double, ref: Polar): Polar
  
  /**
    * Subtracts the given Polar from the current Polar
    * @param polar the polar to subtract
    * @returns the current polar
    */
  def subtractInPlace(polar: Polar): this.type
  
  /**
    * Subtracts the given Polar from the current Polar and stores the result
    * @param polar the polar to subtract
    * @param ref the polar to store the result in
    * @returns the updated ref
    */
  def subtractToRef(polar: Polar, ref: Polar): Polar
  
  var theta: Double
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @returns the rectangular coordinates
    */
  def toVector2(): Vector2
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  def toVector2ToRef(ref: Vector2): Vector2
}
object Polar {
  
  inline def apply(
    add: Polar => Polar,
    addInPlace: Polar => Polar,
    addInPlaceFromFloats: (Double, Double) => Polar,
    addToRef: (Polar, Polar) => Polar,
    asArray: () => js.Array[Double],
    copyFrom: Polar => Polar,
    copyFromFloats: (Double, Double) => Polar,
    divide: Polar => Polar,
    divideInPlace: Polar => Polar,
    divideToRef: (Polar, Polar) => Polar,
    getClassName: () => String,
    multiply: Polar => Polar,
    multiplyInPlace: Polar => Polar,
    multiplyToRef: (Polar, Polar) => Polar,
    radius: Double,
    scale: Double => Polar,
    scaleInPlace: Double => Polar,
    scaleToRef: (Double, Polar) => Polar,
    set: (Double, Double) => Polar,
    setAll: Double => Polar,
    subtract: Polar => Polar,
    subtractFromFloats: (Double, Double) => Polar,
    subtractFromFloatsToRef: (Double, Double, Polar) => Polar,
    subtractInPlace: Polar => Polar,
    subtractToRef: (Polar, Polar) => Polar,
    theta: Double,
    toVector2: () => Vector2,
    toVector2ToRef: Vector2 => Vector2
  ): Polar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addInPlace = js.Any.fromFunction1(addInPlace), addInPlaceFromFloats = js.Any.fromFunction2(addInPlaceFromFloats), addToRef = js.Any.fromFunction2(addToRef), asArray = js.Any.fromFunction0(asArray), copyFrom = js.Any.fromFunction1(copyFrom), copyFromFloats = js.Any.fromFunction2(copyFromFloats), divide = js.Any.fromFunction1(divide), divideInPlace = js.Any.fromFunction1(divideInPlace), divideToRef = js.Any.fromFunction2(divideToRef), getClassName = js.Any.fromFunction0(getClassName), multiply = js.Any.fromFunction1(multiply), multiplyInPlace = js.Any.fromFunction1(multiplyInPlace), multiplyToRef = js.Any.fromFunction2(multiplyToRef), radius = radius.asInstanceOf[js.Any], scale = js.Any.fromFunction1(scale), scaleInPlace = js.Any.fromFunction1(scaleInPlace), scaleToRef = js.Any.fromFunction2(scaleToRef), set = js.Any.fromFunction2(set), setAll = js.Any.fromFunction1(setAll), subtract = js.Any.fromFunction1(subtract), subtractFromFloats = js.Any.fromFunction2(subtractFromFloats), subtractFromFloatsToRef = js.Any.fromFunction3(subtractFromFloatsToRef), subtractInPlace = js.Any.fromFunction1(subtractInPlace), subtractToRef = js.Any.fromFunction2(subtractToRef), theta = theta.asInstanceOf[js.Any], toVector2 = js.Any.fromFunction0(toVector2), toVector2ToRef = js.Any.fromFunction1(toVector2ToRef))
    __obj.asInstanceOf[Polar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Polar] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Polar => Polar): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddInPlace(value: Polar => Polar): Self = StObject.set(x, "addInPlace", js.Any.fromFunction1(value))
    
    inline def setAddInPlaceFromFloats(value: (Double, Double) => Polar): Self = StObject.set(x, "addInPlaceFromFloats", js.Any.fromFunction2(value))
    
    inline def setAddToRef(value: (Polar, Polar) => Polar): Self = StObject.set(x, "addToRef", js.Any.fromFunction2(value))
    
    inline def setAsArray(value: () => js.Array[Double]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: Polar => Polar): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyFromFloats(value: (Double, Double) => Polar): Self = StObject.set(x, "copyFromFloats", js.Any.fromFunction2(value))
    
    inline def setDivide(value: Polar => Polar): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
    
    inline def setDivideInPlace(value: Polar => Polar): Self = StObject.set(x, "divideInPlace", js.Any.fromFunction1(value))
    
    inline def setDivideToRef(value: (Polar, Polar) => Polar): Self = StObject.set(x, "divideToRef", js.Any.fromFunction2(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: Polar => Polar): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyInPlace(value: Polar => Polar): Self = StObject.set(x, "multiplyInPlace", js.Any.fromFunction1(value))
    
    inline def setMultiplyToRef(value: (Polar, Polar) => Polar): Self = StObject.set(x, "multiplyToRef", js.Any.fromFunction2(value))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double => Polar): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleInPlace(value: Double => Polar): Self = StObject.set(x, "scaleInPlace", js.Any.fromFunction1(value))
    
    inline def setScaleToRef(value: (Double, Polar) => Polar): Self = StObject.set(x, "scaleToRef", js.Any.fromFunction2(value))
    
    inline def setSet(value: (Double, Double) => Polar): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetAll(value: Double => Polar): Self = StObject.set(x, "setAll", js.Any.fromFunction1(value))
    
    inline def setSubtract(value: Polar => Polar): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
    
    inline def setSubtractFromFloats(value: (Double, Double) => Polar): Self = StObject.set(x, "subtractFromFloats", js.Any.fromFunction2(value))
    
    inline def setSubtractFromFloatsToRef(value: (Double, Double, Polar) => Polar): Self = StObject.set(x, "subtractFromFloatsToRef", js.Any.fromFunction3(value))
    
    inline def setSubtractInPlace(value: Polar => Polar): Self = StObject.set(x, "subtractInPlace", js.Any.fromFunction1(value))
    
    inline def setSubtractToRef(value: (Polar, Polar) => Polar): Self = StObject.set(x, "subtractToRef", js.Any.fromFunction2(value))
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setToVector2(value: () => Vector2): Self = StObject.set(x, "toVector2", js.Any.fromFunction0(value))
    
    inline def setToVector2ToRef(value: Vector2 => Vector2): Self = StObject.set(x, "toVector2ToRef", js.Any.fromFunction1(value))
  }
}
