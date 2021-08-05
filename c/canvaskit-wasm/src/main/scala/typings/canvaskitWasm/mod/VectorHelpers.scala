package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorHelpers extends StObject {
  
  /**
    * Adds 2 vectors together, term by term, returning a new Vector.
    * @param a
    * @param b
    */
  def add(a: VectorN, b: VectorN): VectorN
  
  /**
    * Returns the cross product of the two vectors. Only works for length 3.
    * @param a
    * @param b
    */
  def cross(a: Vector3, b: Vector3): Vector3
  
  /**
    * Returns the length(sub(a, b))
    * @param a
    * @param b
    */
  def dist(a: VectorN, b: VectorN): Double
  
  /**
    * Returns the dot product of the two vectors.
    * @param a
    * @param b
    */
  def dot(a: VectorN, b: VectorN): Double
  
  /**
    * Returns the length of this vector, which is always positive.
    * @param v
    */
  def length(v: VectorN): Double
  
  /**
    * Returns the length squared of this vector.
    * @param v
    */
  def lengthSquared(v: VectorN): Double
  
  /**
    * Returns a new vector which is v multiplied by the scalar s.
    * @param v
    * @param s
    */
  def mulScalar(v: VectorN, s: Double): VectorN
  
  /**
    * Returns a normalized vector.
    * @param v
    */
  def normalize(v: VectorN): VectorN
  
  /**
    * Subtracts vector b from vector a (termwise).
    * @param a
    * @param b
    */
  def sub(a: VectorN, b: VectorN): VectorN
}
object VectorHelpers {
  
  inline def apply(
    add: (VectorN, VectorN) => VectorN,
    cross: (Vector3, Vector3) => Vector3,
    dist: (VectorN, VectorN) => Double,
    dot: (VectorN, VectorN) => Double,
    length: VectorN => Double,
    lengthSquared: VectorN => Double,
    mulScalar: (VectorN, Double) => VectorN,
    normalize: VectorN => VectorN,
    sub: (VectorN, VectorN) => VectorN
  ): VectorHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), cross = js.Any.fromFunction2(cross), dist = js.Any.fromFunction2(dist), dot = js.Any.fromFunction2(dot), length = js.Any.fromFunction1(length), lengthSquared = js.Any.fromFunction1(lengthSquared), mulScalar = js.Any.fromFunction2(mulScalar), normalize = js.Any.fromFunction1(normalize), sub = js.Any.fromFunction2(sub))
    __obj.asInstanceOf[VectorHelpers]
  }
  
  extension [Self <: VectorHelpers](x: Self) {
    
    inline def setAdd(value: (VectorN, VectorN) => VectorN): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setCross(value: (Vector3, Vector3) => Vector3): Self = StObject.set(x, "cross", js.Any.fromFunction2(value))
    
    inline def setDist(value: (VectorN, VectorN) => Double): Self = StObject.set(x, "dist", js.Any.fromFunction2(value))
    
    inline def setDot(value: (VectorN, VectorN) => Double): Self = StObject.set(x, "dot", js.Any.fromFunction2(value))
    
    inline def setLength(value: VectorN => Double): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    inline def setLengthSquared(value: VectorN => Double): Self = StObject.set(x, "lengthSquared", js.Any.fromFunction1(value))
    
    inline def setMulScalar(value: (VectorN, Double) => VectorN): Self = StObject.set(x, "mulScalar", js.Any.fromFunction2(value))
    
    inline def setNormalize(value: VectorN => VectorN): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setSub(value: (VectorN, VectorN) => VectorN): Self = StObject.set(x, "sub", js.Any.fromFunction2(value))
  }
}
