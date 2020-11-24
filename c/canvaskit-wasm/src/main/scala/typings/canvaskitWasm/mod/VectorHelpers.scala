package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorHelpers extends js.Object {
  
  /**
    * Adds 2 vectors together, term by term, returning a new Vector.
    * @param a
    * @param b
    */
  def add(a: VectorN, b: VectorN): VectorN = js.native
  
  /**
    * Returns the cross product of the two vectors. Only works for length 3.
    * @param a
    * @param b
    */
  def cross(a: Vector3, b: Vector3): Vector3 = js.native
  
  /**
    * Returns the length(sub(a, b))
    * @param a
    * @param b
    */
  def dist(a: VectorN, b: VectorN): Double = js.native
  
  /**
    * Returns the dot product of the two vectors.
    * @param a
    * @param b
    */
  def dot(a: VectorN, b: VectorN): Double = js.native
  
  /**
    * Returns the length of this vector, which is always positive.
    * @param v
    */
  def length(v: VectorN): Double = js.native
  
  /**
    * Returns the length squared of this vector.
    * @param v
    */
  def lengthSquared(v: VectorN): Double = js.native
  
  /**
    * Returns a new vector which is v multiplied by the scalar s.
    * @param v
    * @param s
    */
  def mulScalar(v: VectorN, s: Double): VectorN = js.native
  
  /**
    * Returns a normalized vector.
    * @param v
    */
  def normalize(v: VectorN): VectorN = js.native
  
  /**
    * Subtracts vector b from vector a (termwise).
    * @param a
    * @param b
    */
  def sub(a: VectorN, b: VectorN): VectorN = js.native
}
object VectorHelpers {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class VectorHelpersOps[Self <: VectorHelpers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (VectorN, VectorN) => VectorN): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCross(value: (Vector3, Vector3) => Vector3): Self = this.set("cross", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDist(value: (VectorN, VectorN) => Double): Self = this.set("dist", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDot(value: (VectorN, VectorN) => Double): Self = this.set("dot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLength(value: VectorN => Double): Self = this.set("length", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLengthSquared(value: VectorN => Double): Self = this.set("lengthSquared", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMulScalar(value: (VectorN, Double) => VectorN): Self = this.set("mulScalar", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNormalize(value: VectorN => VectorN): Self = this.set("normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSub(value: (VectorN, VectorN) => VectorN): Self = this.set("sub", js.Any.fromFunction2(value))
  }
}
