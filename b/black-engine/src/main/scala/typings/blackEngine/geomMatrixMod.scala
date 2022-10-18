package typings.blackEngine

import typings.blackEngine.geomRectangleMod.Rectangle
import typings.blackEngine.geomVectorMod.Vector
import typings.blackEngine.utilsObjectPoolMod.ObjectPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMatrixMod {
  
  @JSImport("black-engine/geom/Matrix", "Matrix")
  @js.native
  open class Matrix protected () extends StObject {
    def this(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ) = this()
    
    def __decompose(): js.Array[Double] = js.native
    
    def append(b: Matrix): Matrix = js.native
    
    def copyFrom(matrix: Matrix): Matrix = js.native
    
    def copyTo(matrix: Matrix): Matrix = js.native
    
    /* private */ var data: Any = js.native
    
    def equals(matrix: Matrix): Boolean = js.native
    def equals(matrix: Matrix, epsilon: Double): Boolean = js.native
    
    def exactEquals(matrix: Matrix): Boolean = js.native
    
    def identity(): Matrix = js.native
    
    def invert(): Matrix = js.native
    
    def isIdentity: Boolean = js.native
    
    def prepend(b: Matrix): Matrix = js.native
    
    def rotate(angle: Double): Matrix = js.native
    
    def scale(sx: Double, sy: Double): Matrix = js.native
    
    def set(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ): Matrix = js.native
    
    def setRotation(theta: Double): Matrix = js.native
    def setRotation(theta: Double, scale: Double): Matrix = js.native
    
    def setTranslation(x: Double, y: Double): Matrix = js.native
    
    def skew(sx: Any, sy: Any): Unit = js.native
    
    def toString(digits: Double): String = js.native
    
    def transformDirectionXY(x: Double, y: Double): Vector = js.native
    def transformDirectionXY(x: Double, y: Double, outVector: Vector): Vector = js.native
    
    def transformRect(rect: Rectangle): Rectangle = js.native
    def transformRect(rect: Rectangle, outRect: Rectangle): Rectangle = js.native
    
    def transformVector(vector: Vector): Vector = js.native
    def transformVector(vector: Vector, outVector: Vector): Vector = js.native
    
    def transformXY(x: Double, y: Double): Vector = js.native
    def transformXY(x: Double, y: Double, outVector: Vector): Vector = js.native
    
    def translate(dx: Double, dy: Double): Matrix = js.native
    
    def value: js.typedarray.Float32Array = js.native
  }
  object Matrix {
    
    @JSImport("black-engine/geom/Matrix", "Matrix.__cache")
    @js.native
    val cache: Matrix = js.native
    
    @JSImport("black-engine/geom/Matrix", "Matrix.__identity")
    @js.native
    val identity: Matrix = js.native
    
    @JSImport("black-engine/geom/Matrix", "Matrix.pool")
    @js.native
    val pool: ObjectPool = js.native
  }
}
