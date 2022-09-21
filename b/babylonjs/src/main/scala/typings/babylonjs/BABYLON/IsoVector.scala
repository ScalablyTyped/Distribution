package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsoVector extends StObject {
  
  /**
    * For an equilateral triangle OAB with O at isovector (0, 0) and A at isovector (m, n)
    * Rotates one IsoVector 120 degrees counter clockwise about the center of the triangle
    * Please note that this is an in place operation
    * @param m integer a measure a Primary triangle of order (m, n) m > n
    * @param n >= 0 integer a measure for a Primary triangle of order (m, n)
    * @returns the rotated IsoVector
    */
  def rotate120(m: Double, n: Double): this.type
  
  /**
    * Rotates one IsoVector 60 degrees counter clockwise about another
    * Please note that this is an in place operation
    * @param other an IsoVector a center of rotation
    * @returns the rotated IsoVector
    */
  def rotate60About(other: IsoVector): this.type
  
  /**
    * For an equilateral triangle OAB with O at isovector (0, 0) and A at isovector (m, n)
    * Rotates one IsoVector 120 degrees clockwise about the center of the triangle
    * Please note that this is an in place operation
    * @param m integer a measure a Primary triangle of order (m, n) m > n
    * @param n >= 0 integer a measure for a Primary triangle of order (m, n)
    * @returns the rotated IsoVector
    */
  def rotateNeg120(m: Double, n: Double): this.type
  
  /**
    * Rotates one IsoVector 60 degrees clockwise about another
    * Please note that this is an in place operation
    * @param other an IsoVector as center of rotation
    * @returns the rotated IsoVector
    */
  def rotateNeg60About(other: IsoVector): this.type
  
  /**
    * Transforms an IsoVector to one in Cartesian 3D space based on an isovector
    * @param origin an IsoVector
    * @param isoGridSize
    * @returns Point as a Vector3
    */
  def toCartesianOrigin(origin: IsoVector, isoGridSize: Double): Vector3
  
  /** defines the first coordinate */
  var x: Double
  
  /** defines the second coordinate */
  var y: Double
}
object IsoVector {
  
  inline def apply(
    rotate120: (Double, Double) => IsoVector,
    rotate60About: IsoVector => IsoVector,
    rotateNeg120: (Double, Double) => IsoVector,
    rotateNeg60About: IsoVector => IsoVector,
    toCartesianOrigin: (IsoVector, Double) => Vector3,
    x: Double,
    y: Double
  ): IsoVector = {
    val __obj = js.Dynamic.literal(rotate120 = js.Any.fromFunction2(rotate120), rotate60About = js.Any.fromFunction1(rotate60About), rotateNeg120 = js.Any.fromFunction2(rotateNeg120), rotateNeg60About = js.Any.fromFunction1(rotateNeg60About), toCartesianOrigin = js.Any.fromFunction2(toCartesianOrigin), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsoVector]
  }
  
  extension [Self <: IsoVector](x: Self) {
    
    inline def setRotate120(value: (Double, Double) => IsoVector): Self = StObject.set(x, "rotate120", js.Any.fromFunction2(value))
    
    inline def setRotate60About(value: IsoVector => IsoVector): Self = StObject.set(x, "rotate60About", js.Any.fromFunction1(value))
    
    inline def setRotateNeg120(value: (Double, Double) => IsoVector): Self = StObject.set(x, "rotateNeg120", js.Any.fromFunction2(value))
    
    inline def setRotateNeg60About(value: IsoVector => IsoVector): Self = StObject.set(x, "rotateNeg60About", js.Any.fromFunction1(value))
    
    inline def setToCartesianOrigin(value: (IsoVector, Double) => Vector3): Self = StObject.set(x, "toCartesianOrigin", js.Any.fromFunction2(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
