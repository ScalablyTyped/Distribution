package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spherical extends StObject {
  
  /**
    * Adds the current Spherical and the given Spherical
    * @param spherical the spherical to add
    * @returns the sum spherical
    */
  def add(spherical: Spherical): Spherical
  
  /**
    * Adds the given spherical to the current spherical
    * @param spherical the spherical to add
    * @returns the current spherical
    */
  def addInPlace(spherical: Spherical): this.type
  
  /**
    * Adds the provided values to the current spherical
    * @param radius the amount to add to the radius
    * @param theta the amount to add to the theta
    * @param phi the amount to add to the phi
    * @returns the current spherical
    */
  def addInPlaceFromFloats(radius: Double, theta: Double, phi: Double): this.type
  
  /**
    * Adds the current Spherical and the given Spherical and stores the result
    * @param spherical the spherical to add
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  def addToRef(spherical: Spherical, ref: Spherical): Spherical
  
  /**
    * Converts the current spherical to an array
    * @reutrns the current spherical as an array
    */
  def asArray(): js.Array[Double]
  
  /**
    * Copies the source spherical into the current spherical
    * @param source the spherical to copy from
    * @returns the current spherical
    */
  def copyFrom(source: Spherical): this.type
  
  /**
    * Copies the given values into the current spherical
    * @param radius the radius to use
    * @param theta the theta to use
    * @param phi the phi to use
    * @returns the current spherical
    */
  def copyFromFloats(radius: Double, theta: Double, phi: Double): this.type
  
  /**
    * Divides the current Spherical by the given Spherical
    * @param spherical the spherical to divide
    * @returns the quotient spherical
    */
  def divide(spherical: Spherical): Spherical
  
  /**
    * Divides the current Spherical by the given Spherical
    * @param spherical the spherical to divide
    * @returns the current spherical
    */
  def divideInPlace(spherical: Spherical): this.type
  
  /**
    * Divides the current Spherical by the given Spherical and stores the result
    * @param spherical the spherical to divide
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  def divideToRef(spherical: Spherical, ref: Spherical): Spherical
  
  /**
    * Gets the class name
    * @returns the string "Spherical"
    */
  def getClassName(): String
  
  /**
    * Multiplies the given Spherical with the current Spherical
    * @param spherical the spherical to multiply
    * @returns the product spherical
    */
  def multiply(spherical: Spherical): Spherical
  
  /**
    * Multiplies the given Spherical with the current Spherical
    * @param spherical the spherical to multiply
    * @returns the current spherical
    */
  def multiplyInPlace(spherical: Spherical): this.type
  
  /**
    * Multiplies the given Spherical with the current Spherical and stores the result
    * @param spherical the spherical to multiply
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  def multiplyToRef(spherical: Spherical, ref: Spherical): Spherical
  
  var phi: Double
  
  var radius: Double
  
  /**
    * Scales the current spherical and returns a new spherical with the scaled coordinates
    * @param scale defines the multiplication factor
    * @returns the scaled spherical
    */
  def scale(scale: Double): Spherical
  
  /**
    * Scales the current spherical
    * @param scale defines the multiplication factor
    * @returns the current spherical
    */
  def scaleInPlace(scale: Double): this.type
  
  /**
    * Scales the current spherical and stores the result
    * @param scale defines the multiplication factor
    * @param ref where to store the result
    * @returns the updated ref
    */
  def scaleToRef(scale: Double, ref: Spherical): Spherical
  
  /**
    * Sets the values of the current spherical
    * @param radius the new radius
    * @param theta the new theta
    * @param phi the new phi
    * @returns the current spherical
    */
  def set(radius: Double, theta: Double, phi: Double): this.type
  
  /**
    * Sets the values of the current spherical
    * @param value the new values
    * @returns the current spherical
    */
  def setAll(value: Double): this.type
  
  /**
    * Subtracts the given Spherical from the current Spherical
    * @param spherical the spherical to subtract
    * @returns the difference spherical
    */
  def subtract(spherical: Spherical): Spherical
  
  /**
    * Subtracts the given floats from the current spherical
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param phi the amount to subtract from the phi
    * @returns the difference spherical
    */
  def subtractFromFloats(radius: Double, theta: Double, phi: Double): Spherical
  
  /**
    * Subtracts the given floats from the current spherical
    * @param radius the amount to subtract from the radius
    * @param theta the amount to subtract from the theta
    * @param phi the amount to subtract from the phi
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  def subtractFromFloatsToRef(radius: Double, theta: Double, phi: Double, ref: Spherical): Spherical
  
  /**
    * Subtracts the given Spherical from the current Spherical
    * @param spherical the spherical to subtract
    * @returns the current spherical
    */
  def subtractInPlace(spherical: Spherical): this.type
  
  /**
    * Subtracts the given Spherical from the current Spherical and stores the result
    * @param spherical the spherical to subtract
    * @param ref the spherical to store the result in
    * @returns the updated ref
    */
  def subtractToRef(spherical: Spherical, ref: Spherical): Spherical
  
  var theta: Double
  
  /**
    * Gets a Vector3 from the current spherical coordinates
    * @returns the Vector3
    */
  def toVector3(): Vector3
  
  /**
    * Assigns the rectangular coordinates of the current Spherical to a Vector3
    * @param ref the Vector3 to update
    * @returns the updated Vector3
    */
  def toVector3ToRef(ref: DeepImmutable[Vector3]): Vector3
}
object Spherical {
  
  inline def apply(
    add: Spherical => Spherical,
    addInPlace: Spherical => Spherical,
    addInPlaceFromFloats: (Double, Double, Double) => Spherical,
    addToRef: (Spherical, Spherical) => Spherical,
    asArray: () => js.Array[Double],
    copyFrom: Spherical => Spherical,
    copyFromFloats: (Double, Double, Double) => Spherical,
    divide: Spherical => Spherical,
    divideInPlace: Spherical => Spherical,
    divideToRef: (Spherical, Spherical) => Spherical,
    getClassName: () => String,
    multiply: Spherical => Spherical,
    multiplyInPlace: Spherical => Spherical,
    multiplyToRef: (Spherical, Spherical) => Spherical,
    phi: Double,
    radius: Double,
    scale: Double => Spherical,
    scaleInPlace: Double => Spherical,
    scaleToRef: (Double, Spherical) => Spherical,
    set: (Double, Double, Double) => Spherical,
    setAll: Double => Spherical,
    subtract: Spherical => Spherical,
    subtractFromFloats: (Double, Double, Double) => Spherical,
    subtractFromFloatsToRef: (Double, Double, Double, Spherical) => Spherical,
    subtractInPlace: Spherical => Spherical,
    subtractToRef: (Spherical, Spherical) => Spherical,
    theta: Double,
    toVector3: () => Vector3,
    toVector3ToRef: DeepImmutable[Vector3] => Vector3
  ): Spherical = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addInPlace = js.Any.fromFunction1(addInPlace), addInPlaceFromFloats = js.Any.fromFunction3(addInPlaceFromFloats), addToRef = js.Any.fromFunction2(addToRef), asArray = js.Any.fromFunction0(asArray), copyFrom = js.Any.fromFunction1(copyFrom), copyFromFloats = js.Any.fromFunction3(copyFromFloats), divide = js.Any.fromFunction1(divide), divideInPlace = js.Any.fromFunction1(divideInPlace), divideToRef = js.Any.fromFunction2(divideToRef), getClassName = js.Any.fromFunction0(getClassName), multiply = js.Any.fromFunction1(multiply), multiplyInPlace = js.Any.fromFunction1(multiplyInPlace), multiplyToRef = js.Any.fromFunction2(multiplyToRef), phi = phi.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], scale = js.Any.fromFunction1(scale), scaleInPlace = js.Any.fromFunction1(scaleInPlace), scaleToRef = js.Any.fromFunction2(scaleToRef), set = js.Any.fromFunction3(set), setAll = js.Any.fromFunction1(setAll), subtract = js.Any.fromFunction1(subtract), subtractFromFloats = js.Any.fromFunction3(subtractFromFloats), subtractFromFloatsToRef = js.Any.fromFunction4(subtractFromFloatsToRef), subtractInPlace = js.Any.fromFunction1(subtractInPlace), subtractToRef = js.Any.fromFunction2(subtractToRef), theta = theta.asInstanceOf[js.Any], toVector3 = js.Any.fromFunction0(toVector3), toVector3ToRef = js.Any.fromFunction1(toVector3ToRef))
    __obj.asInstanceOf[Spherical]
  }
  
  extension [Self <: Spherical](x: Self) {
    
    inline def setAdd(value: Spherical => Spherical): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddInPlace(value: Spherical => Spherical): Self = StObject.set(x, "addInPlace", js.Any.fromFunction1(value))
    
    inline def setAddInPlaceFromFloats(value: (Double, Double, Double) => Spherical): Self = StObject.set(x, "addInPlaceFromFloats", js.Any.fromFunction3(value))
    
    inline def setAddToRef(value: (Spherical, Spherical) => Spherical): Self = StObject.set(x, "addToRef", js.Any.fromFunction2(value))
    
    inline def setAsArray(value: () => js.Array[Double]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: Spherical => Spherical): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyFromFloats(value: (Double, Double, Double) => Spherical): Self = StObject.set(x, "copyFromFloats", js.Any.fromFunction3(value))
    
    inline def setDivide(value: Spherical => Spherical): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
    
    inline def setDivideInPlace(value: Spherical => Spherical): Self = StObject.set(x, "divideInPlace", js.Any.fromFunction1(value))
    
    inline def setDivideToRef(value: (Spherical, Spherical) => Spherical): Self = StObject.set(x, "divideToRef", js.Any.fromFunction2(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: Spherical => Spherical): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyInPlace(value: Spherical => Spherical): Self = StObject.set(x, "multiplyInPlace", js.Any.fromFunction1(value))
    
    inline def setMultiplyToRef(value: (Spherical, Spherical) => Spherical): Self = StObject.set(x, "multiplyToRef", js.Any.fromFunction2(value))
    
    inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double => Spherical): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleInPlace(value: Double => Spherical): Self = StObject.set(x, "scaleInPlace", js.Any.fromFunction1(value))
    
    inline def setScaleToRef(value: (Double, Spherical) => Spherical): Self = StObject.set(x, "scaleToRef", js.Any.fromFunction2(value))
    
    inline def setSet(value: (Double, Double, Double) => Spherical): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setSetAll(value: Double => Spherical): Self = StObject.set(x, "setAll", js.Any.fromFunction1(value))
    
    inline def setSubtract(value: Spherical => Spherical): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
    
    inline def setSubtractFromFloats(value: (Double, Double, Double) => Spherical): Self = StObject.set(x, "subtractFromFloats", js.Any.fromFunction3(value))
    
    inline def setSubtractFromFloatsToRef(value: (Double, Double, Double, Spherical) => Spherical): Self = StObject.set(x, "subtractFromFloatsToRef", js.Any.fromFunction4(value))
    
    inline def setSubtractInPlace(value: Spherical => Spherical): Self = StObject.set(x, "subtractInPlace", js.Any.fromFunction1(value))
    
    inline def setSubtractToRef(value: (Spherical, Spherical) => Spherical): Self = StObject.set(x, "subtractToRef", js.Any.fromFunction2(value))
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setToVector3(value: () => Vector3): Self = StObject.set(x, "toVector3", js.Any.fromFunction0(value))
    
    inline def setToVector3ToRef(value: DeepImmutable[Vector3] => Vector3): Self = StObject.set(x, "toVector3ToRef", js.Any.fromFunction1(value))
  }
}
