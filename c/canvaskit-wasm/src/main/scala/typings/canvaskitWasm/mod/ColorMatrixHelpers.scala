package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMatrixHelpers extends StObject {
  
  /**
    * Returns a new SkColorMatrix that is the result of multiplying outer*inner
    * @param outer
    * @param inner
    */
  def concat(outer: SkColorMatrix, inner: SkColorMatrix): SkColorMatrix
  
  /**
    * Returns an identity SkColorMatrix.
    */
  def identity(): SkColorMatrix
  
  /**
    * Sets the 4 "special" params that will translate the colors after they are multiplied
    * by the 4x4 matrix.
    * @param m
    * @param dr - delta red
    * @param dg - delta green
    * @param db - delta blue
    * @param da - delta alpha
    */
  def postTranslate(m: SkColorMatrix, dr: Double, dg: Double, db: Double, da: Double): SkColorMatrix
  
  /**
    * Returns a new SkColorMatrix that is rotated around a given axis.
    * @param axis - 0 for red, 1 for green, 2 for blue
    * @param sine - sin(angle)
    * @param cosine - cos(angle)
    */
  def rotated(axis: Double, sine: Double, cosine: Double): SkColorMatrix
  
  /**
    * Returns a new SkColorMatrix that scales the colors as specified.
    * @param redScale
    * @param greenScale
    * @param blueScale
    * @param alphaScale
    */
  def scaled(redScale: Double, greenScale: Double, blueScale: Double, alphaScale: Double): SkColorMatrix
}
object ColorMatrixHelpers {
  
  inline def apply(
    concat: (SkColorMatrix, SkColorMatrix) => SkColorMatrix,
    identity: () => SkColorMatrix,
    postTranslate: (SkColorMatrix, Double, Double, Double, Double) => SkColorMatrix,
    rotated: (Double, Double, Double) => SkColorMatrix,
    scaled: (Double, Double, Double, Double) => SkColorMatrix
  ): ColorMatrixHelpers = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), identity = js.Any.fromFunction0(identity), postTranslate = js.Any.fromFunction5(postTranslate), rotated = js.Any.fromFunction3(rotated), scaled = js.Any.fromFunction4(scaled))
    __obj.asInstanceOf[ColorMatrixHelpers]
  }
  
  extension [Self <: ColorMatrixHelpers](x: Self) {
    
    inline def setConcat(value: (SkColorMatrix, SkColorMatrix) => SkColorMatrix): Self = StObject.set(x, "concat", js.Any.fromFunction2(value))
    
    inline def setIdentity(value: () => SkColorMatrix): Self = StObject.set(x, "identity", js.Any.fromFunction0(value))
    
    inline def setPostTranslate(value: (SkColorMatrix, Double, Double, Double, Double) => SkColorMatrix): Self = StObject.set(x, "postTranslate", js.Any.fromFunction5(value))
    
    inline def setRotated(value: (Double, Double, Double) => SkColorMatrix): Self = StObject.set(x, "rotated", js.Any.fromFunction3(value))
    
    inline def setScaled(value: (Double, Double, Double, Double) => SkColorMatrix): Self = StObject.set(x, "scaled", js.Any.fromFunction4(value))
  }
}
