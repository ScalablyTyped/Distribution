package typings.blackEngine

import typings.blackEngine.utilsObjectPoolMod.ObjectPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomVectorMod {
  
  @JSImport("black-engine/geom/Vector", "Vector")
  @js.native
  open class Vector () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    def add(vector: Vector): Vector = js.native
    
    def angle(): Double = js.native
    
    def angleBetween(vector: Vector): Double = js.native
    
    def clamp(min: Double, max: Double): Vector = js.native
    
    def clampLength(min: Double, max: Double): Vector = js.native
    
    def copyFrom(vector: Vector): Vector = js.native
    
    def copyTo(vector: Vector): Vector = js.native
    
    def distance(vector: Vector): Double = js.native
    
    def distanceSqr(vector: Vector): Double = js.native
    
    def dot(vector: Vector): Double = js.native
    
    def equals(vector: Vector): Boolean = js.native
    def equals(vector: Vector, epsilon: Double): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def lengthSqr(): Double = js.native
    
    def lerp(vector: Vector, t: Double): Vector = js.native
    
    def multiply(vector: Vector): Vector = js.native
    
    def multiplyScalar(scalar: Double): Vector = js.native
    
    def normalize(): Vector = js.native
    
    def perp(): Vector = js.native
    
    def random: Double = js.native
    
    def set(): Vector = js.native
    def set(x: Double): Vector = js.native
    def set(x: Double, y: Double): Vector = js.native
    def set(x: Unit, y: Double): Vector = js.native
    
    def setRotation(rotation: Double): Vector = js.native
    
    def setRotationFrom(vector: Vector, rotation: Double): Vector = js.native
    
    def subtract(vector: Vector): Vector = js.native
    
    def toString(digits: Double): String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Vector {
    
    @JSImport("black-engine/geom/Vector", "Vector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/geom/Vector", "Vector.__cache")
    @js.native
    val cache: Vector = js.native
    
    inline def fromAngle(angle: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Vector]
    inline def fromAngle(angle: Double, outVector: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Vector]
    
    @JSImport("black-engine/geom/Vector", "Vector.pool")
    @js.native
    val pool: ObjectPool = js.native
    
    inline def randomRange(vectorMin: Vector, vectorMax: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def randomRange(vectorMin: Vector, vectorMax: Vector, outVector: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Vector]
  }
}
