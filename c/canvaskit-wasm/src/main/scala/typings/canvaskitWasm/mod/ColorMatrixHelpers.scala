package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMatrixHelpers extends StObject {
  
  /**
    * Returns a new ColorMatrix that is the result of multiplying outer*inner
    * @param outer
    * @param inner
    */
  def concat(outer: js.typedarray.Float32Array, inner: js.typedarray.Float32Array): js.typedarray.Float32Array
  
  /**
    * Returns an identity ColorMatrix.
    */
  def identity(): js.typedarray.Float32Array
  
  /**
    * Sets the 4 "special" params that will translate the colors after they are multiplied
    * by the 4x4 matrix.
    * @param m
    * @param dr - delta red
    * @param dg - delta green
    * @param db - delta blue
    * @param da - delta alpha
    */
  def postTranslate(m: js.typedarray.Float32Array, dr: Double, dg: Double, db: Double, da: Double): js.typedarray.Float32Array
  
  /**
    * Returns a new ColorMatrix that is rotated around a given axis.
    * @param axis - 0 for red, 1 for green, 2 for blue
    * @param sine - sin(angle)
    * @param cosine - cos(angle)
    */
  def rotated(axis: Double, sine: Double, cosine: Double): js.typedarray.Float32Array
  
  /**
    * Returns a new ColorMatrix that scales the colors as specified.
    * @param redScale
    * @param greenScale
    * @param blueScale
    * @param alphaScale
    */
  def scaled(redScale: Double, greenScale: Double, blueScale: Double, alphaScale: Double): js.typedarray.Float32Array
}
object ColorMatrixHelpers {
  
  inline def apply(
    concat: (js.typedarray.Float32Array, js.typedarray.Float32Array) => js.typedarray.Float32Array,
    identity: () => js.typedarray.Float32Array,
    postTranslate: (js.typedarray.Float32Array, Double, Double, Double, Double) => js.typedarray.Float32Array,
    rotated: (Double, Double, Double) => js.typedarray.Float32Array,
    scaled: (Double, Double, Double, Double) => js.typedarray.Float32Array
  ): ColorMatrixHelpers = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), identity = js.Any.fromFunction0(identity), postTranslate = js.Any.fromFunction5(postTranslate), rotated = js.Any.fromFunction3(rotated), scaled = js.Any.fromFunction4(scaled))
    __obj.asInstanceOf[ColorMatrixHelpers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorMatrixHelpers] (val x: Self) extends AnyVal {
    
    inline def setConcat(value: (js.typedarray.Float32Array, js.typedarray.Float32Array) => js.typedarray.Float32Array): Self = StObject.set(x, "concat", js.Any.fromFunction2(value))
    
    inline def setIdentity(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "identity", js.Any.fromFunction0(value))
    
    inline def setPostTranslate(value: (js.typedarray.Float32Array, Double, Double, Double, Double) => js.typedarray.Float32Array): Self = StObject.set(x, "postTranslate", js.Any.fromFunction5(value))
    
    inline def setRotated(value: (Double, Double, Double) => js.typedarray.Float32Array): Self = StObject.set(x, "rotated", js.Any.fromFunction3(value))
    
    inline def setScaled(value: (Double, Double, Double, Double) => js.typedarray.Float32Array): Self = StObject.set(x, "scaled", js.Any.fromFunction4(value))
  }
}
